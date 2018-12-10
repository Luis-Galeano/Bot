/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.konecta.chatbot.ejb.bean;

import py.com.konecta.chatbot.ejb.macro.AgregarVariableMacro;
import com.rivescript.Config;
import com.rivescript.RiveScript;
import com.rivescript.lang.Perl;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import py.com.konecta.chatbot.ejb.dto.GenericResponse;
import py.com.konecta.chatbot.ejb.dto.UserVars;
import static py.com.konecta.chatbot.ejb.Constantes.ESTADO_ERROR;
import static py.com.konecta.chatbot.ejb.Constantes.ESTADO_EXITO;
import static py.com.konecta.chatbot.ejb.Constantes.MAX_TIME;
import static py.com.konecta.chatbot.ejb.Constantes.MENSAJE_ERROR;
import static py.com.konecta.chatbot.ejb.Constantes.MENSAJE_EXITO;
import static py.com.konecta.chatbot.ejb.Constantes.URL_INICIAR_CHAT;
import py.com.konecta.chatbot.ejb.dao.ChatLineaTextoDAO;
import py.com.konecta.chatbot.ejb.dao.ChatUsuariosDAO;
import py.com.konecta.chatbot.ejb.dao.ChatUsuariosVariablesDAO;
import py.com.konecta.chatbot.ejb.dao.ChatVariablesDAO;
import py.com.konecta.chatbot.ejb.dao.QueryDAO;
import py.com.konecta.chatbot.ejb.macro.GetVariableMacro;
import py.com.konecta.chatbot.ejb.model.ChatLineaTexto;
import py.com.konecta.chatbot.ejb.model.ChatUsuarios;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosExample;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosVariables;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosVariablesExample;
import py.com.konecta.chatbot.ejb.model.ChatVariables;
import py.com.konecta.chatbot.ejb.model.ChatVariablesExample;
import py.com.konecta.chatbot.ejb.model.Trigger;
import py.com.konecta.chatbot.ejb.util.Util;

/**
 *
 * @author Luis Galeano
 */
@Stateless
public class BotBean {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @EJB
    QueryDAO queryDao;
    @Inject
    ChatUsuariosDAO usuarioDao;
    @Inject
    ChatVariablesDAO variableDao;
    @Inject
    ChatUsuariosVariablesDAO userVariableDao;
    @Inject
    AgregarVariableMacro agregarVariableMacro;
    @Inject
    GetVariableMacro getVariableMacro;
    @Inject
    ChatLineaTextoDAO conversacionDao;

    private RiveScript bot;

    @PostConstruct
    public void init() {

        bot = new RiveScript(Config.utf8());

        File rsp4jFile = new File(BotBean.class.getClassLoader().getResource("rsp4j.pl").getFile());
        bot.setHandler("perl", new Perl(rsp4jFile.getAbsolutePath()));

        bot.setSubroutine("agregar", agregarVariableMacro);
        bot.setSubroutine("obtener", getVariableMacro);
    }

    public GenericResponse getBotResponse(Trigger trigger) {
        logger.info("{}",trigger);
        GenericResponse resp = new GenericResponse();
        try {
            // agregar la variable userId al usuario
            if (bot.getUservar(trigger.getCodigoUsuario(), "userId") == null) {
                bot.setUservar(trigger.getCodigoUsuario(), "userId", trigger.getCodigoUsuario());
            }
            // obtener usuario de la bd por su chatId
//            ChatUsuariosExample uexample = new ChatUsuariosExample();
//            uexample.createCriteria().andIdCuentaUsuarioEqualTo(trigger.getCodigoUsuario());
//            ChatUsuarios user = usuarioDao.selectOneByExample(uexample);
            
            // agregar conversacion entrante en la bd
            ChatLineaTexto conversacionEntrante = new ChatLineaTexto();
            conversacionEntrante.setDireccion("I");
            conversacionEntrante.setFecha(Calendar.getInstance().getTime());
            conversacionEntrante.setIdTransporte(1l);
            conversacionEntrante.setIdUsuario(trigger.getCodigoUsuario());
            conversacionEntrante.setLineaTexto(trigger.getMensaje());
            conversacionDao.insertSelective(conversacionEntrante);
            
            bot.loadDirectory("/opt/rs/scripts/");
            bot.sortReplies();
               
            //String maxTime = queryDao.getConfigValue(MAX_TIME);
            //Long miliSegundosMaxTime = Long.valueOf(maxTime);
            //Date currentTime = Calendar.getInstance().getTime();
            
            // salir del topico despues de un periodo de tiempo de inactividad del usuario
//            if (user.getUltimaConversacion() != null){
//                Long milisegundos = currentTime.getTime() - user.getUltimaConversacion().getTime();
//                if  (milisegundos > miliSegundosMaxTime){
//                    logger.info("Salir del topico actual");
//                    bot.setUservar(trigger.getCodigoUsuario(), "topic", "random");
//                }
//            }
            
            logger.info("MENSAJE IN: {} || {}", trigger.getMensaje(), trigger.getCodigoUsuario());
            String reply = bot.reply(trigger.getCodigoUsuario(), trigger.getMensaje());
            
            // agregar conversacion saliente en la bd
            ChatLineaTexto conversacionSaliente = new ChatLineaTexto();
            conversacionSaliente.setDireccion("O");
            conversacionSaliente.setFecha(Calendar.getInstance().getTime());
            conversacionSaliente.setIdTransporte(1l);
            conversacionSaliente.setIdUsuario(trigger.getCodigoUsuario());
            conversacionSaliente.setLineaTexto(reply);
            conversacionDao.insertSelective(conversacionSaliente);
            
//            // actualizar ultima conversacion del usuario
//            user.setUltimaConversacion(currentTime);
//            usuarioDao.updateByPrimaryKeySelective(user);
            
            resp.setDato(reply);
            resp.setEstado(ESTADO_EXITO);
            resp.setMensaje(MENSAJE_EXITO);

        } catch (Exception e) {
            resp.setEstado(ESTADO_ERROR);
            resp.setMensaje(MENSAJE_ERROR);
            logger.error("", e);
        }
        logger.info("MENSAJE OUT: {}", (String) resp.getDato());
        return resp;
    }

    public String agregarVaribalesUsuario(String[] args) {
        try {
            Long idUsuario = null;
            Long idVarible = null;
            String userId = args[0];
            String nombreVariable = args[1];
            String valorVariable = "";
            for (int i = 2; i < args.length; i++) {
                valorVariable = valorVariable + args[i];
                if (i < args.length - 1) {
                    valorVariable = valorVariable + " ";
                }
            }

            logger.info("{}, {}, {}", userId, nombreVariable, valorVariable);

            ChatUsuariosExample uexample = new ChatUsuariosExample();
            ChatVariablesExample vexample = new ChatVariablesExample();

            uexample.createCriteria().andIdCuentaUsuarioEqualTo(userId);
            vexample.createCriteria().andNombreEqualTo(nombreVariable);

            ChatUsuarios user = usuarioDao.selectOneByExample(uexample);
            ChatVariables variable = variableDao.selectOneByExample(vexample);

            if (user != null) {
                idUsuario = user.getIdUsuario();
            } else {
                logger.info("No se pudo obtener el usuario de la Base de Datos");
                return "";
            }
            if (variable != null) {
                idVarible = variable.getIdVariable();
            } else {
                logger.info("No se pudo obtener la variable de la Base de Datos");
                ChatVariables chatVar = new ChatVariables();
                chatVar.setNombre(nombreVariable);
                variableDao.insertSelective(chatVar);
                idVarible = chatVar.getIdVariable();
                //return "";
            }
            ChatUsuariosVariablesExample uvExample = new ChatUsuariosVariablesExample();
            uvExample.createCriteria().andIdUsuarioEqualTo(idUsuario)
                    .andIdVariableEqualTo(idVarible);
            ChatUsuariosVariables usuarioVariableUpdate = userVariableDao.selectOneByExample(uvExample);
            if (usuarioVariableUpdate == null) {
                ChatUsuariosVariables usuarioVariableInsert = new ChatUsuariosVariables();
                usuarioVariableInsert.setIdUsuario(idUsuario);
                usuarioVariableInsert.setIdVariable(idVarible);
                usuarioVariableInsert.setValor(valorVariable);
                userVariableDao.insertSelective(usuarioVariableInsert);
            } else {
                usuarioVariableUpdate.setValor(valorVariable);
                userVariableDao.updateByPrimaryKeySelective(usuarioVariableUpdate);
            }

        } catch (Exception e) {
            logger.error("", e);
        }

        return "";
    }

    public String getVariableByNombre(String[] args) {
        logger.info("OUT: {}", args);
        String resp = null;
        try {
            String userId = args[0];
            String nombreVariable = args[1];
            List<UserVars> vars = queryDao.getUserVaribales(userId);

            if (vars != null) {
                for (UserVars var : vars) {
                    if (var.getNombre().equals(nombreVariable)) {
                        resp = var.getValor();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            logger.error("", e);
        }
        logger.info("OUT: {}", resp);
        return resp;
    }

    public GenericResponse iniciarConversacion(String mensaje) {
        logger.info("IN: {}", mensaje);
        GenericResponse resp = new GenericResponse();
        try {
            if(mensaje == null){
                resp.setEstado(ESTADO_ERROR);
                resp.setMensaje("Favor agregar algun contenido al mensaje");
                return resp;
            }
            List<ChatUsuarios> usuarios = usuarioDao.selectByExample(null);
            String url = queryDao.getConfigValue(URL_INICIAR_CHAT);
            JSONObject jsonObject = null;
  
            for (ChatUsuarios user : usuarios) {
                Map<String,String> jsonRequest = new HashMap<>();
                jsonRequest.put("chatId", user.getIdCuentaUsuario());
                jsonRequest.put("mensaje", mensaje);
                jsonObject = new JSONObject(jsonRequest);
                Util.restPostCall(url,jsonObject.toString(), null);
            }
            resp.setEstado(ESTADO_EXITO);
            resp.setMensaje(MENSAJE_EXITO);
        } catch (Exception e) {
            resp.setEstado(ESTADO_ERROR);
            resp.setMensaje(MENSAJE_ERROR);
            logger.error("", e);
        }
        logger.info("OUT {}",resp);
        return resp;
    }
}
