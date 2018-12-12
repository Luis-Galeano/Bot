/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.konecta.chatbot.ejb.dao;

import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.cdi.Mapper;
import py.com.konecta.chatbot.ejb.dto.UserVars;
import py.com.konecta.chatbot.ejb.mapper.QueryMapper;
/**
 *
 * @author Luis Galeano <luis.galeano@konecta.com.py>
 */
@Stateless
public class QueryDAO {

    @Inject
    @Mapper
    QueryMapper mapper;

    private final Logger logger = LogManager.getLogger(this.getClass());
    
    public List<String> getRiveDirectoriesByRol(String rol){
        logger.info("IN: {}",rol);
        List<String> resp = null;
        try {
            resp = mapper.getRiveDirectoriesByRol(rol);
        } catch (Exception e) {
            logger.error("",e);
        }
        logger.info("OUT: {}",resp);
        return resp;
    }
    
    public List<UserVars> getUserVaribales(String idCuenta){
        logger.info("IN: {}",idCuenta);
        List<UserVars> resp = null;
        try {
            resp = mapper.getUserVaribales(idCuenta);
        } catch (Exception e) {
            logger.error("",e);
        }
        logger.info("OUT: {}",resp);
        return resp;
    }
    
    public String getConfigValue(String param){
        logger.info("IN: {}",param);
        String resp = null;
        try {
            resp = mapper.getConfigValue(param);
        } catch (Exception e) {
            logger.error("",e);
        }
        logger.info("OUT: {}",resp);
        return resp;
    }
    
    public void insertLineaTexto(String direccion, Date fecha,
            Long idTransporte, String usuario, String lineaTexto){
        logger.info("IN: {}, {}, {}, {}, {}",direccion,fecha,idTransporte,usuario,lineaTexto);
        try {
            mapper.insertLineaTexto(direccion, fecha, idTransporte, usuario, lineaTexto);
        } catch (Exception e) {
            logger.error("",e);
        }
    }
      
}
