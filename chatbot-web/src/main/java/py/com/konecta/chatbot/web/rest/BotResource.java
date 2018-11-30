/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.konecta.chatbot.web.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import py.com.konecta.chatbot.ejb.dto.GenericResponse;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;
import py.com.konecta.chatbot.ejb.bean.BotBean;
import py.com.konecta.chatbot.ejb.model.Trigger;

/**
 *
 * @author Luis Galeano
 */
@Path("bot")
public class BotResource {
    private final Logger logger = LogManager.getLogger(this.getClass());
   
    @EJB
    BotBean botBean;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public GenericResponse getServicios(Trigger trigger){
        return botBean.getBotResponse(trigger);
    }
    
    @Path("inciar-chat")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @GET
    public GenericResponse iniciarChat(@QueryParam("mensaje") String mensaje){
        return botBean.iniciarConversacion(mensaje);
    }
}
