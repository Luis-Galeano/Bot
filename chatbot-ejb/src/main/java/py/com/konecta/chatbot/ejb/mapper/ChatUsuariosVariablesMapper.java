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
import py.com.konecta.chatbot.ejb.model.ChatUsuariosVariables;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosVariablesExample;

public interface ChatUsuariosVariablesMapper {
    @SelectProvider(type=ChatUsuariosVariablesSqlProvider.class, method="countByExample")
    long countByExample(ChatUsuariosVariablesExample example);

    @DeleteProvider(type=ChatUsuariosVariablesSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChatUsuariosVariablesExample example);

    @Delete({
        "delete from chat_usuarios_variables",
        "where id_usuario_variable = #{idUsuarioVariable,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idUsuarioVariable);

    @Insert({
        "insert into chat_usuarios_variables (id_usuario, id_variable, ",
        "valor)",
        "values (#{idUsuario,jdbcType=BIGINT}, #{idVariable,jdbcType=BIGINT}, ",
        "#{valor,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idUsuarioVariable")
    int insert(ChatUsuariosVariables record);

    @InsertProvider(type=ChatUsuariosVariablesSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idUsuarioVariable")
    int insertSelective(ChatUsuariosVariables record);

    @SelectProvider(type=ChatUsuariosVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_usuario_variable", property="idUsuarioVariable", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.BIGINT),
        @Result(column="id_variable", property="idVariable", jdbcType=JdbcType.BIGINT),
        @Result(column="valor", property="valor", jdbcType=JdbcType.VARCHAR)
    })
    List<ChatUsuariosVariables> selectByExampleWithRowbounds(ChatUsuariosVariablesExample example, RowBounds rowBounds);

    @SelectProvider(type=ChatUsuariosVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_usuario_variable", property="idUsuarioVariable", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.BIGINT),
        @Result(column="id_variable", property="idVariable", jdbcType=JdbcType.BIGINT),
        @Result(column="valor", property="valor", jdbcType=JdbcType.VARCHAR)
    })
    List<ChatUsuariosVariables> selectByExample(ChatUsuariosVariablesExample example);

    @Select({
        "select",
        "id_usuario_variable, id_usuario, id_variable, valor",
        "from chat_usuarios_variables",
        "where id_usuario_variable = #{idUsuarioVariable,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_usuario_variable", property="idUsuarioVariable", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.BIGINT),
        @Result(column="id_variable", property="idVariable", jdbcType=JdbcType.BIGINT),
        @Result(column="valor", property="valor", jdbcType=JdbcType.VARCHAR)
    })
    ChatUsuariosVariables selectByPrimaryKey(Long idUsuarioVariable);

    @UpdateProvider(type=ChatUsuariosVariablesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChatUsuariosVariables record, @Param("example") ChatUsuariosVariablesExample example);

    @UpdateProvider(type=ChatUsuariosVariablesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ChatUsuariosVariables record, @Param("example") ChatUsuariosVariablesExample example);

    @UpdateProvider(type=ChatUsuariosVariablesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChatUsuariosVariables record);

    @Update({
        "update chat_usuarios_variables",
        "set id_usuario = #{idUsuario,jdbcType=BIGINT},",
          "id_variable = #{idVariable,jdbcType=BIGINT},",
          "valor = #{valor,jdbcType=VARCHAR}",
        "where id_usuario_variable = #{idUsuarioVariable,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ChatUsuariosVariables record);
}