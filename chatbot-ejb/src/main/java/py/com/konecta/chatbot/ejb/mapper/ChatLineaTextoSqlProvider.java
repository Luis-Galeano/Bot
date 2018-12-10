package py.com.konecta.chatbot.ejb.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import py.com.konecta.chatbot.ejb.model.ChatLineaTexto;
import py.com.konecta.chatbot.ejb.model.ChatLineaTextoExample.Criteria;
import py.com.konecta.chatbot.ejb.model.ChatLineaTextoExample.Criterion;
import py.com.konecta.chatbot.ejb.model.ChatLineaTextoExample;

public class ChatLineaTextoSqlProvider {

    public String countByExample(ChatLineaTextoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("chat_linea_texto");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ChatLineaTextoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("chat_linea_texto");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ChatLineaTexto record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("chat_linea_texto");
        
        if (record.getIdUsuario() != null) {
            sql.VALUES("id_usuario", "#{idUsuario,jdbcType=VARCHAR}");
        }
        
        if (record.getIdTransporte() != null) {
            sql.VALUES("id_transporte", "#{idTransporte,jdbcType=BIGINT}");
        }
        
        if (record.getFecha() != null) {
            sql.VALUES("fecha", "#{fecha,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDireccion() != null) {
            sql.VALUES("direccion", "#{direccion,jdbcType=VARCHAR}");
        }
        
        if (record.getLineaTexto() != null) {
            sql.VALUES("linea_texto", "#{lineaTexto,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(ChatLineaTextoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id_linea_texto");
        } else {
            sql.SELECT("id_linea_texto");
        }
        sql.SELECT("id_usuario");
        sql.SELECT("id_transporte");
        sql.SELECT("fecha");
        sql.SELECT("direccion");
        sql.SELECT("linea_texto");
        sql.FROM("chat_linea_texto");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(ChatLineaTextoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id_linea_texto");
        } else {
            sql.SELECT("id_linea_texto");
        }
        sql.SELECT("id_usuario");
        sql.SELECT("id_transporte");
        sql.SELECT("fecha");
        sql.SELECT("direccion");
        sql.FROM("chat_linea_texto");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ChatLineaTexto record = (ChatLineaTexto) parameter.get("record");
        ChatLineaTextoExample example = (ChatLineaTextoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("chat_linea_texto");
        
        if (record.getIdLineaTexto() != null) {
            sql.SET("id_linea_texto = #{record.idLineaTexto,jdbcType=BIGINT}");
        }
        
        if (record.getIdUsuario() != null) {
            sql.SET("id_usuario = #{record.idUsuario,jdbcType=VARCHAR}");
        }
        
        if (record.getIdTransporte() != null) {
            sql.SET("id_transporte = #{record.idTransporte,jdbcType=BIGINT}");
        }
        
        if (record.getFecha() != null) {
            sql.SET("fecha = #{record.fecha,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDireccion() != null) {
            sql.SET("direccion = #{record.direccion,jdbcType=VARCHAR}");
        }
        
        if (record.getLineaTexto() != null) {
            sql.SET("linea_texto = #{record.lineaTexto,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("chat_linea_texto");
        
        sql.SET("id_linea_texto = #{record.idLineaTexto,jdbcType=BIGINT}");
        sql.SET("id_usuario = #{record.idUsuario,jdbcType=VARCHAR}");
        sql.SET("id_transporte = #{record.idTransporte,jdbcType=BIGINT}");
        sql.SET("fecha = #{record.fecha,jdbcType=TIMESTAMP}");
        sql.SET("direccion = #{record.direccion,jdbcType=VARCHAR}");
        sql.SET("linea_texto = #{record.lineaTexto,jdbcType=LONGVARCHAR}");
        
        ChatLineaTextoExample example = (ChatLineaTextoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("chat_linea_texto");
        
        sql.SET("id_linea_texto = #{record.idLineaTexto,jdbcType=BIGINT}");
        sql.SET("id_usuario = #{record.idUsuario,jdbcType=VARCHAR}");
        sql.SET("id_transporte = #{record.idTransporte,jdbcType=BIGINT}");
        sql.SET("fecha = #{record.fecha,jdbcType=TIMESTAMP}");
        sql.SET("direccion = #{record.direccion,jdbcType=VARCHAR}");
        
        ChatLineaTextoExample example = (ChatLineaTextoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ChatLineaTexto record) {
        SQL sql = new SQL();
        sql.UPDATE("chat_linea_texto");
        
        if (record.getIdUsuario() != null) {
            sql.SET("id_usuario = #{idUsuario,jdbcType=VARCHAR}");
        }
        
        if (record.getIdTransporte() != null) {
            sql.SET("id_transporte = #{idTransporte,jdbcType=BIGINT}");
        }
        
        if (record.getFecha() != null) {
            sql.SET("fecha = #{fecha,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDireccion() != null) {
            sql.SET("direccion = #{direccion,jdbcType=VARCHAR}");
        }
        
        if (record.getLineaTexto() != null) {
            sql.SET("linea_texto = #{lineaTexto,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id_linea_texto = #{idLineaTexto,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ChatLineaTextoExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}