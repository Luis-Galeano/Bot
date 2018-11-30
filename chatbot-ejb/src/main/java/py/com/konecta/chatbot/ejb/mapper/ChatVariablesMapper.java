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
import py.com.konecta.chatbot.ejb.model.ChatVariables;
import py.com.konecta.chatbot.ejb.model.ChatVariablesExample;

public interface ChatVariablesMapper {
    @SelectProvider(type=ChatVariablesSqlProvider.class, method="countByExample")
    long countByExample(ChatVariablesExample example);

    @DeleteProvider(type=ChatVariablesSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChatVariablesExample example);

    @Delete({
        "delete from chat_variables",
        "where id_variable = #{idVariable,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idVariable);

    @Insert({
        "insert into chat_variables (nombre)",
        "values (#{nombre,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idVariable")
    int insert(ChatVariables record);

    @InsertProvider(type=ChatVariablesSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idVariable")
    int insertSelective(ChatVariables record);

    @SelectProvider(type=ChatVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_variable", property="idVariable", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR)
    })
    List<ChatVariables> selectByExampleWithRowbounds(ChatVariablesExample example, RowBounds rowBounds);

    @SelectProvider(type=ChatVariablesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_variable", property="idVariable", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR)
    })
    List<ChatVariables> selectByExample(ChatVariablesExample example);

    @Select({
        "select",
        "id_variable, nombre",
        "from chat_variables",
        "where id_variable = #{idVariable,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_variable", property="idVariable", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR)
    })
    ChatVariables selectByPrimaryKey(Long idVariable);

    @UpdateProvider(type=ChatVariablesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChatVariables record, @Param("example") ChatVariablesExample example);

    @UpdateProvider(type=ChatVariablesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ChatVariables record, @Param("example") ChatVariablesExample example);

    @UpdateProvider(type=ChatVariablesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChatVariables record);

    @Update({
        "update chat_variables",
        "set nombre = #{nombre,jdbcType=VARCHAR}",
        "where id_variable = #{idVariable,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ChatVariables record);
}