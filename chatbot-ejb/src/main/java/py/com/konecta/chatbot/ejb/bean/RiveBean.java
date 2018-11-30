/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.konecta.chatbot.ejb.bean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static py.com.konecta.chatbot.ejb.Constantes.CONDITION;
import py.com.konecta.chatbot.ejb.dto.GenericResponse;
import static py.com.konecta.chatbot.ejb.Constantes.DIRECTORIO_BASE;
import static py.com.konecta.chatbot.ejb.Constantes.ESTADO_ERROR;
import static py.com.konecta.chatbot.ejb.Constantes.ESTADO_EXITO;
import static py.com.konecta.chatbot.ejb.Constantes.MENSAJE_ERROR;
import static py.com.konecta.chatbot.ejb.Constantes.MENSAJE_EXITO;
import static py.com.konecta.chatbot.ejb.Constantes.REPLY;
import static py.com.konecta.chatbot.ejb.Constantes.TRIGGER;
import py.com.konecta.chatbot.ejb.dao.QueryDAO;
import py.com.konecta.chatbot.ejb.dto.RiveRepresentation;
import py.com.konecta.chatbot.ejb.dto.RiveResponse;
import py.com.konecta.chatbot.ejb.util.Util;


/**
 *
 * @author Luis Galeano
 */
@Stateless
public class RiveBean {
    private final Logger logger = LogManager.getLogger(this.getClass());
    
    @EJB
    QueryDAO queryDao;
    
    public GenericResponse getDirectories(String header){
        GenericResponse resp = new GenericResponse();
        
        try {
            List<String> roles = Util.getUserRoles(header);
            logger.info("ROLES: {}",roles);
            List<String> data = new ArrayList<>();
            for(String rol : roles){
                List<String> dataTemp = queryDao.getRiveDirectoriesByRol(rol);
                data.addAll(dataTemp);
            }
            resp.setDato(data);
            resp.setEstado(ESTADO_EXITO);
            resp.setMensaje(MENSAJE_EXITO);
        } catch (Exception e) {
            logger.error("",e);
            resp.setEstado(ESTADO_ERROR);
            resp.setMensaje(MENSAJE_ERROR);
        }
        logger.info("OUT: {}",resp);
        return resp;
    }
    
    
    public GenericResponse readRiveFile(String name){
        GenericResponse resp = new GenericResponse();
        logger.info("IN: {}",name);
        try {
            String pathToFile = DIRECTORIO_BASE+name;
            File file = new File(pathToFile);
            if (!file.exists()){
                resp.setEstado(ESTADO_ERROR);
                resp.setMensaje("No se encuentra el archivo");
                logger.info("OUT: {}",resp);
                return resp;
            }
            
            String body = new String(Files.readAllBytes(file.toPath()),"UTF-8");
            //--------------------
            
            RiveResponse riveResponse = new RiveResponse();
            List<RiveRepresentation> rive = new ArrayList<>();
            BufferedReader br = new BufferedReader(new StringReader(body));
            String sCurrentLine;
            
            String trigger = null;
            List<String> conditions = new ArrayList<>();
            while ((sCurrentLine = br.readLine()) != null) {
                if (!sCurrentLine.isEmpty()){
                    if(sCurrentLine.trim().startsWith(TRIGGER)){
                      int a = sCurrentLine.indexOf(" ");
                      trigger = sCurrentLine.substring (a+1);
                    }
                    else if(sCurrentLine.trim().startsWith(CONDITION)){
                        int b = sCurrentLine.indexOf(" ");
                        conditions.add(sCurrentLine.substring (b+1));
                    }
                    else if(sCurrentLine.trim().startsWith(REPLY)){
                      RiveRepresentation riveRepresentation = new RiveRepresentation();
                      int c = sCurrentLine.indexOf(" ");
                      riveRepresentation.setReply(sCurrentLine.substring (c+1));
                      riveRepresentation.setTrigger(trigger);
                      riveRepresentation.setConditions(conditions);
                      trigger = null;
                      conditions = new ArrayList<>();
                      rive.add(riveRepresentation);
                    }
                    
                }
            }
            riveResponse.setData(rive);
            logger.info("{}",rive);
            // ------------------------
            resp.setDato(body);
            resp.setEstado(ESTADO_EXITO);
            resp.setMensaje(MENSAJE_EXITO);
        } catch (Exception e) {
            logger.error("",e);
            resp.setEstado(ESTADO_ERROR);
            resp.setMensaje(MENSAJE_ERROR);
        }
        //logger.info("OUT: {}",resp);
        return resp;
    }
    
    
    public GenericResponse writeRiveFile(String name, String content){
        GenericResponse resp = new GenericResponse();
        logger.info("IN: {}",name);
        try {
            String pathToFile = DIRECTORIO_BASE+name;
            File file = new File(pathToFile);
            if (!file.exists()){
                resp.setEstado(ESTADO_ERROR);
                resp.setMensaje("No se encuentra el archivo");
                logger.info("No se encuentra el archivo {}",pathToFile);
                return resp;
            }
            
            FileWriter fileWriter = new FileWriter(pathToFile);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(content);
            printWriter.close();
    
            resp.setEstado(ESTADO_EXITO);
            resp.setMensaje("Guardado Exitosamente");
        } catch (Exception e) {
            logger.error("",e);
            resp.setEstado(ESTADO_ERROR);
            resp.setMensaje(MENSAJE_ERROR);
        }
        logger.info("OUT: {}",resp);
        return resp;
    }
}
