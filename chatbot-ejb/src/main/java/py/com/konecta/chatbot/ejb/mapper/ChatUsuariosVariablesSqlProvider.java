package py.com.konecta.chatbot.ejb.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosVariables;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosVariablesExample.Criteria;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosVariablesExample.Criterion;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosVariablesExample;

public class ChatUsuariosVariablesSqlProvider {

    public String countByExample(ChatUsuariosVariablesExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("chat_usuarios_variables");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ChatUsuariosVariablesExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("chat_usuarios_variables");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ChatUsuariosVariables record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("chat_usuarios_variables");
        
        if (record.getIdUsuario() != null) {
            sql.VALUES("id_usuario", "#{idUsuario,jdbcType=BIGINT}");
        }
        
        if (record.getIdVariable() != null) {
            sql.VALUES("id_variable", "#{idVariable,jdbcType=BIGINT}");
        }
        
        if (record.getValor() != null) {
            sql.VALUES("valor", "#{valor,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ChatUsuariosVariablesExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id_usuario_variable");
        } else {
            sql.SELECT("id_usuario_variable");
        }
        sql.SELECT("id_usuario");
        sql.SELECT("id_variable");
        sql.SELECT("valor");
        sql.FROM("chat_usuarios_variables");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ChatUsuariosVariables record = (ChatUsuariosVariables) parameter.get("record");
        ChatUsuariosVariablesExample example = (ChatUsuariosVariablesExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("chat_usuarios_variables");
        
        if (record.getIdUsuarioVariable() != null) {
            sql.SET("id_usuario_variable = #{record.idUsuarioVariable,jdbcType=BIGINT}");
        }
        
        if (record.getIdUsuario() != null) {
            sql.SET("id_usuario = #{record.idUsuario,jdbcType=BIGINT}");
        }
        
        if (record.getIdVariable() != null) {
            sql.SET("id_variable = #{record.idVariable,jdbcType=BIGINT}");
        }
        
        if (record.getValor() != null) {
            sql.SET("valor = #{record.valor,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("chat_usuarios_variables");
        
        sql.SET("id_usuario_variable = #{record.idUsuarioVariable,jdbcType=BIGINT}");
        sql.SET("id_usuario = #{record.idUsuario,jdbcType=BIGINT}");
        sql.SET("id_variable = #{record.idVariable,jdbcType=BIGINT}");
        sql.SET("valor = #{record.valor,jdbcType=VARCHAR}");
        
        ChatUsuariosVariablesExample example = (ChatUsuariosVariablesExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ChatUsuariosVariables record) {
        SQL sql = new SQL();
        sql.UPDATE("chat_usuarios_variables");
        
        if (record.getIdUsuario() != null) {
            sql.SET("id_usuario = #{idUsuario,jdbcType=BIGINT}");
        }
        
        if (record.getIdVariable() != null) {
            sql.SET("id_variable = #{idVariable,jdbcType=BIGINT}");
        }
        
        if (record.getValor() != null) {
            sql.SET("valor = #{valor,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id_usuario_variable = #{idUsuarioVariable,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ChatUsuariosVariablesExample example, boolean includeExamplePhrase) {
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