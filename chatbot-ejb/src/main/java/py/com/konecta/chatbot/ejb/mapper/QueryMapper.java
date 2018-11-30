/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.konecta.chatbot.ejb.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import py.com.konecta.chatbot.ejb.dto.UserVars;



/**
 *
 * @author Luis Galeano <luis.galeano@konecta.com.py>
 */
public interface QueryMapper {
    
    @SelectProvider(type=QuerySqlProvider.class, method="getRiveDirectoriesByRol")
    public List<String> getRiveDirectoriesByRol(@Param("rol") String rol);
    
    @SelectProvider(type=QuerySqlProvider.class, method="getUserVaribales")
    public List<UserVars> getUserVaribales(@Param("idCuentaUsuario") String idCuentaUsuario);
    
    @SelectProvider(type=QuerySqlProvider.class, method="getConfigValue")
    public String getConfigValue(@Param("param") String param);
}
