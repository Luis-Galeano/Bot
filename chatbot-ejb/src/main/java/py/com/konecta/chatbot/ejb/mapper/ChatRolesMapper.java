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
import py.com.konecta.chatbot.ejb.model.ChatRoles;
import py.com.konecta.chatbot.ejb.model.ChatRolesExample;

public interface ChatRolesMapper {
    @SelectProvider(type=ChatRolesSqlProvider.class, method="countByExample")
    long countByExample(ChatRolesExample example);

    @DeleteProvider(type=ChatRolesSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChatRolesExample example);

    @Delete({
        "delete from chat_roles",
        "where id_rol = #{idRol,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idRol);

    @Insert({
        "insert into chat_roles (nombre)",
        "values (#{nombre,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idRol")
    int insert(ChatRoles record);

    @InsertProvider(type=ChatRolesSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idRol")
    int insertSelective(ChatRoles record);

    @SelectProvider(type=ChatRolesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_rol", property="idRol", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR)
    })
    List<ChatRoles> selectByExampleWithRowbounds(ChatRolesExample example, RowBounds rowBounds);

    @SelectProvider(type=ChatRolesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_rol", property="idRol", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR)
    })
    List<ChatRoles> selectByExample(ChatRolesExample example);

    @Select({
        "select",
        "id_rol, nombre",
        "from chat_roles",
        "where id_rol = #{idRol,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_rol", property="idRol", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR)
    })
    ChatRoles selectByPrimaryKey(Long idRol);

    @UpdateProvider(type=ChatRolesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChatRoles record, @Param("example") ChatRolesExample example);

    @UpdateProvider(type=ChatRolesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ChatRoles record, @Param("example") ChatRolesExample example);

    @UpdateProvider(type=ChatRolesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChatRoles record);

    @Update({
        "update chat_roles",
        "set nombre = #{nombre,jdbcType=VARCHAR}",
        "where id_rol = #{idRol,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ChatRoles record);
}