package py.com.konecta.chatbot.ejb.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import py.com.konecta.chatbot.ejb.model.ChatUsuarios;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosExample;

public interface ChatUsuariosMapper {
    @SelectProvider(type=ChatUsuariosSqlProvider.class, method="countByExample")
    long countByExample(ChatUsuariosExample example);

    @DeleteProvider(type=ChatUsuariosSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChatUsuariosExample example);

    @Delete({
        "delete from chat_usuarios",
        "where id_usuario = #{idUsuario,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idUsuario);

    @Insert({
        "insert into chat_usuarios (id_cuenta_usuario, nombre, ",
        "apellido, telefono, ",
        "email, ubicacion, ",
        "ultima_conversacion)",
        "values (#{idCuentaUsuario,jdbcType=VARCHAR}, #{nombre,jdbcType=VARCHAR}, ",
        "#{apellido,jdbcType=VARCHAR}, #{telefono,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{ubicacion,jdbcType=VARCHAR}, ",
        "#{ultimaConversacion,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idUsuario")
    int insert(ChatUsuarios record);

    @InsertProvider(type=ChatUsuariosSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idUsuario")
    int insertSelective(ChatUsuarios record);

    @SelectProvider(type=ChatUsuariosSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_cuenta_usuario", property="idCuentaUsuario", jdbcType=JdbcType.VARCHAR),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellido", property="apellido", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="ubicacion", property="ubicacion", jdbcType=JdbcType.VARCHAR),
        @Result(column="ultima_conversacion", property="ultimaConversacion", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ChatUsuarios> selectByExampleWithRowbounds(ChatUsuariosExample example, RowBounds rowBounds);

    @SelectProvider(type=ChatUsuariosSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_cuenta_usuario", property="idCuentaUsuario", jdbcType=JdbcType.VARCHAR),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellido", property="apellido", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="ubicacion", property="ubicacion", jdbcType=JdbcType.VARCHAR),
        @Result(column="ultima_conversacion", property="ultimaConversacion", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ChatUsuarios> selectByExample(ChatUsuariosExample example);

    @Select({
        "select",
        "id_usuario, id_cuenta_usuario, nombre, apellido, telefono, email, ubicacion, ",
        "ultima_conversacion",
        "from chat_usuarios",
        "where id_usuario = #{idUsuario,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_cuenta_usuario", property="idCuentaUsuario", jdbcType=JdbcType.VARCHAR),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellido", property="apellido", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="ubicacion", property="ubicacion", jdbcType=JdbcType.VARCHAR),
        @Result(column="ultima_conversacion", property="ultimaConversacion", jdbcType=JdbcType.TIMESTAMP)
    })
    ChatUsuarios selectByPrimaryKey(Long idUsuario);

    @UpdateProvider(type=ChatUsuariosSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChatUsuarios record, @Param("example") ChatUsuariosExample example);

    @UpdateProvider(type=ChatUsuariosSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ChatUsuarios record, @Param("example") ChatUsuariosExample example);

    @UpdateProvider(type=ChatUsuariosSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChatUsuarios record);

    @Update({
        "update chat_usuarios",
        "set id_cuenta_usuario = #{idCuentaUsuario,jdbcType=VARCHAR},",
          "nombre = #{nombre,jdbcType=VARCHAR},",
          "apellido = #{apellido,jdbcType=VARCHAR},",
          "telefono = #{telefono,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "ubicacion = #{ubicacion,jdbcType=VARCHAR},",
          "ultima_conversacion = #{ultimaConversacion,jdbcType=TIMESTAMP}",
        "where id_usuario = #{idUsuario,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ChatUsuarios record);
}