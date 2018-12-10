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
import py.com.konecta.chatbot.ejb.model.ChatLineaTexto;
import py.com.konecta.chatbot.ejb.model.ChatLineaTextoExample;

public interface ChatLineaTextoMapper {
    @SelectProvider(type=ChatLineaTextoSqlProvider.class, method="countByExample")
    long countByExample(ChatLineaTextoExample example);

    @DeleteProvider(type=ChatLineaTextoSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChatLineaTextoExample example);

    @Delete({
        "delete from chat_linea_texto",
        "where id_linea_texto = #{idLineaTexto,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idLineaTexto);

    @Insert({
        "insert into chat_linea_texto (id_usuario, id_transporte, ",
        "fecha, direccion, ",
        "linea_texto)",
        "values (#{idUsuario,jdbcType=VARCHAR}, #{idTransporte,jdbcType=BIGINT}, ",
        "#{fecha,jdbcType=TIMESTAMP}, #{direccion,jdbcType=VARCHAR}, ",
        "#{lineaTexto,jdbcType=LONGVARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idLineaTexto")
    int insert(ChatLineaTexto record);

    @InsertProvider(type=ChatLineaTextoSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idLineaTexto")
    int insertSelective(ChatLineaTexto record);

    @SelectProvider(type=ChatLineaTextoSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id_linea_texto", property="idLineaTexto", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_transporte", property="idTransporte", jdbcType=JdbcType.BIGINT),
        @Result(column="fecha", property="fecha", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR),
        @Result(column="linea_texto", property="lineaTexto", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ChatLineaTexto> selectByExampleWithBLOBsWithRowbounds(ChatLineaTextoExample example, RowBounds rowBounds);

    @SelectProvider(type=ChatLineaTextoSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id_linea_texto", property="idLineaTexto", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_transporte", property="idTransporte", jdbcType=JdbcType.BIGINT),
        @Result(column="fecha", property="fecha", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR),
        @Result(column="linea_texto", property="lineaTexto", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ChatLineaTexto> selectByExampleWithBLOBs(ChatLineaTextoExample example);

    @SelectProvider(type=ChatLineaTextoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_linea_texto", property="idLineaTexto", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_transporte", property="idTransporte", jdbcType=JdbcType.BIGINT),
        @Result(column="fecha", property="fecha", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR)
    })
    List<ChatLineaTexto> selectByExampleWithRowbounds(ChatLineaTextoExample example, RowBounds rowBounds);

    @SelectProvider(type=ChatLineaTextoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_linea_texto", property="idLineaTexto", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_transporte", property="idTransporte", jdbcType=JdbcType.BIGINT),
        @Result(column="fecha", property="fecha", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR)
    })
    List<ChatLineaTexto> selectByExample(ChatLineaTextoExample example);

    @Select({
        "select",
        "id_linea_texto, id_usuario, id_transporte, fecha, direccion, linea_texto",
        "from chat_linea_texto",
        "where id_linea_texto = #{idLineaTexto,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_linea_texto", property="idLineaTexto", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_transporte", property="idTransporte", jdbcType=JdbcType.BIGINT),
        @Result(column="fecha", property="fecha", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR),
        @Result(column="linea_texto", property="lineaTexto", jdbcType=JdbcType.LONGVARCHAR)
    })
    ChatLineaTexto selectByPrimaryKey(Long idLineaTexto);

    @UpdateProvider(type=ChatLineaTextoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChatLineaTexto record, @Param("example") ChatLineaTextoExample example);

    @UpdateProvider(type=ChatLineaTextoSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") ChatLineaTexto record, @Param("example") ChatLineaTextoExample example);

    @UpdateProvider(type=ChatLineaTextoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ChatLineaTexto record, @Param("example") ChatLineaTextoExample example);

    @UpdateProvider(type=ChatLineaTextoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChatLineaTexto record);

    @Update({
        "update chat_linea_texto",
        "set id_usuario = #{idUsuario,jdbcType=VARCHAR},",
          "id_transporte = #{idTransporte,jdbcType=BIGINT},",
          "fecha = #{fecha,jdbcType=TIMESTAMP},",
          "direccion = #{direccion,jdbcType=VARCHAR},",
          "linea_texto = #{lineaTexto,jdbcType=LONGVARCHAR}",
        "where id_linea_texto = #{idLineaTexto,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(ChatLineaTexto record);

    @Update({
        "update chat_linea_texto",
        "set id_usuario = #{idUsuario,jdbcType=VARCHAR},",
          "id_transporte = #{idTransporte,jdbcType=BIGINT},",
          "fecha = #{fecha,jdbcType=TIMESTAMP},",
          "direccion = #{direccion,jdbcType=VARCHAR}",
        "where id_linea_texto = #{idLineaTexto,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ChatLineaTexto record);
}