/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.konecta.chatbot.web.rest;

import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import py.com.konecta.chatbot.ejb.dto.GenericResponse;
import py.com.konecta.chatbot.ejb.bean.RiveBean;

/**
 *
 * @author Luis Galeano
 */
@Path("rive")
public class RiveResource {
    
    private final Logger logger = LogManager.getLogger(this.getClass());
    
    @EJB
    RiveBean riveBean;
    
    @Context
    private HttpServletRequest request;
    
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public GenericResponse getDirectories(@QueryParam("rol") String rol){
        String header = request.getHeader("Authorization");
        return riveBean.getDirectories(header);
    }
    
    
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("read-rive")
    public GenericResponse readRive(@QueryParam("rive") String rive){      
        return riveBean.readRiveFile(rive);
    }
    
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("write-rive")
    public GenericResponse writeRive(@QueryParam("rive") String rive, 
            @QueryParam("content") String content){      
        return riveBean.writeRiveFile(rive, content);
    }
}
