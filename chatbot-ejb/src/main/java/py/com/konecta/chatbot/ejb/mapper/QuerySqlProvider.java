/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.konecta.chatbot.ejb.mapper;

import java.util.Date;
import java.util.Map;


/**
 *
 * @author Luis Galeano <luis.galeano@konecta.com.py>
 */
public class QuerySqlProvider {
    
   
    public String getRiveDirectoriesByRol(Map<String, Object> parameters){
        
        String sql ="select rd.directory from chat_roles r \n" +
                    "join chat_rive_directory rd \n" +
                    "on r.id_rol = rd.id_rol\n" +
                    "where r.nombre = #{rol}";          
        return sql;
    }
    
    public String getUserVaribales(Map<String, Object> parameters){
        
        String sql ="select v.nombre, uv.valor from chat_usuarios_variables uv\n" +
                    "join chat_usuarios u\n" +
                    "on uv.id_usuario = u.id_usuario\n" +
                    "join chat_variables v\n" +
                    "on uv.id_variable = v.id_variable\n"+
                    "where u.id_cuenta_usuario = #{idCuentaUsuario}";          
        return sql;
    }
    
    public String getConfigValue(Map<String, Object> parameters){
        
        String sql = "select C.valor from chat_configuraciones C JOIN\n" +
                     "chat_parametros P on C.id_parametro = P.id_parametro\n" +
                     "where P.descripcion =#{param}";            
        return sql;
    }
    
    public String insertLineaTexto(Map<String,Object> param){
        
        String sql= "insert into chat_linea_texto (direccion,fecha,id_transporte,id_usuario,linea_texto)\n" +
                    "VALUES (#{direccion}, #{fecha}, #{transporte}, #{usuario}, #{lineaTexto})";
        return sql;
    }
        
    
}
