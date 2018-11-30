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
import py.com.konecta.chatbot.ejb.model.ChatRiveDirectory;
import py.com.konecta.chatbot.ejb.model.ChatRiveDirectoryExample;

public interface ChatRiveDirectoryMapper {
    @SelectProvider(type=ChatRiveDirectorySqlProvider.class, method="countByExample")
    long countByExample(ChatRiveDirectoryExample example);

    @DeleteProvider(type=ChatRiveDirectorySqlProvider.class, method="deleteByExample")
    int deleteByExample(ChatRiveDirectoryExample example);

    @Delete({
        "delete from chat_rive_directory",
        "where id_rive_directory = #{idRiveDirectory,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idRiveDirectory);

    @Insert({
        "insert into chat_rive_directory (id_rol, directory)",
        "values (#{idRol,jdbcType=BIGINT}, #{directory,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idRiveDirectory")
    int insert(ChatRiveDirectory record);

    @InsertProvider(type=ChatRiveDirectorySqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idRiveDirectory")
    int insertSelective(ChatRiveDirectory record);

    @SelectProvider(type=ChatRiveDirectorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_rive_directory", property="idRiveDirectory", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_rol", property="idRol", jdbcType=JdbcType.BIGINT),
        @Result(column="directory", property="directory", jdbcType=JdbcType.VARCHAR)
    })
    List<ChatRiveDirectory> selectByExampleWithRowbounds(ChatRiveDirectoryExample example, RowBounds rowBounds);

    @SelectProvider(type=ChatRiveDirectorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_rive_directory", property="idRiveDirectory", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_rol", property="idRol", jdbcType=JdbcType.BIGINT),
        @Result(column="directory", property="directory", jdbcType=JdbcType.VARCHAR)
    })
    List<ChatRiveDirectory> selectByExample(ChatRiveDirectoryExample example);

    @Select({
        "select",
        "id_rive_directory, id_rol, directory",
        "from chat_rive_directory",
        "where id_rive_directory = #{idRiveDirectory,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_rive_directory", property="idRiveDirectory", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_rol", property="idRol", jdbcType=JdbcType.BIGINT),
        @Result(column="directory", property="directory", jdbcType=JdbcType.VARCHAR)
    })
    ChatRiveDirectory selectByPrimaryKey(Long idRiveDirectory);

    @UpdateProvider(type=ChatRiveDirectorySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChatRiveDirectory record, @Param("example") ChatRiveDirectoryExample example);

    @UpdateProvider(type=ChatRiveDirectorySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ChatRiveDirectory record, @Param("example") ChatRiveDirectoryExample example);

    @UpdateProvider(type=ChatRiveDirectorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChatRiveDirectory record);

    @Update({
        "update chat_rive_directory",
        "set id_rol = #{idRol,jdbcType=BIGINT},",
          "directory = #{directory,jdbcType=VARCHAR}",
        "where id_rive_directory = #{idRiveDirectory,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ChatRiveDirectory record);
}