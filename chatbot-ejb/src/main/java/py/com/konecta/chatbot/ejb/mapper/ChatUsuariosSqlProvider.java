package py.com.konecta.chatbot.ejb.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import py.com.konecta.chatbot.ejb.model.ChatUsuarios;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosExample.Criteria;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosExample.Criterion;
import py.com.konecta.chatbot.ejb.model.ChatUsuariosExample;

public class ChatUsuariosSqlProvider {

    public String countByExample(ChatUsuariosExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("chat_usuarios");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ChatUsuariosExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("chat_usuarios");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(ChatUsuarios record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("chat_usuarios");
        
        if (record.getIdCuentaUsuario() != null) {
            sql.VALUES("id_cuenta_usuario", "#{idCuentaUsuario,jdbcType=VARCHAR}");
        }
        
        if (record.getNombre() != null) {
            sql.VALUES("nombre", "#{nombre,jdbcType=VARCHAR}");
        }
        
        if (record.getApellido() != null) {
            sql.VALUES("apellido", "#{apellido,jdbcType=VARCHAR}");
        }
        
        if (record.getTelefono() != null) {
            sql.VALUES("telefono", "#{telefono,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getUbicacion() != null) {
            sql.VALUES("ubicacion", "#{ubicacion,jdbcType=VARCHAR}");
        }
        
        if (record.getUltimaConversacion() != null) {
            sql.VALUES("ultima_conversacion", "#{ultimaConversacion,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ChatUsuariosExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id_usuario");
        } else {
            sql.SELECT("id_usuario");
        }
        sql.SELECT("id_cuenta_usuario");
        sql.SELECT("nombre");
        sql.SELECT("apellido");
        sql.SELECT("telefono");
        sql.SELECT("email");
        sql.SELECT("ubicacion");
        sql.SELECT("ultima_conversacion");
        sql.FROM("chat_usuarios");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        ChatUsuarios record = (ChatUsuarios) parameter.get("record");
        ChatUsuariosExample example = (ChatUsuariosExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("chat_usuarios");
        
        if (record.getIdUsuario() != null) {
            sql.SET("id_usuario = #{record.idUsuario,jdbcType=BIGINT}");
        }
        
        if (record.getIdCuentaUsuario() != null) {
            sql.SET("id_cuenta_usuario = #{record.idCuentaUsuario,jdbcType=VARCHAR}");
        }
        
        if (record.getNombre() != null) {
            sql.SET("nombre = #{record.nombre,jdbcType=VARCHAR}");
        }
        
        if (record.getApellido() != null) {
            sql.SET("apellido = #{record.apellido,jdbcType=VARCHAR}");
        }
        
        if (record.getTelefono() != null) {
            sql.SET("telefono = #{record.telefono,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getUbicacion() != null) {
            sql.SET("ubicacion = #{record.ubicacion,jdbcType=VARCHAR}");
        }
        
        if (record.getUltimaConversacion() != null) {
            sql.SET("ultima_conversacion = #{record.ultimaConversacion,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("chat_usuarios");
        
        sql.SET("id_usuario = #{record.idUsuario,jdbcType=BIGINT}");
        sql.SET("id_cuenta_usuario = #{record.idCuentaUsuario,jdbcType=VARCHAR}");
        sql.SET("nombre = #{record.nombre,jdbcType=VARCHAR}");
        sql.SET("apellido = #{record.apellido,jdbcType=VARCHAR}");
        sql.SET("telefono = #{record.telefono,jdbcType=VARCHAR}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("ubicacion = #{record.ubicacion,jdbcType=VARCHAR}");
        sql.SET("ultima_conversacion = #{record.ultimaConversacion,jdbcType=TIMESTAMP}");
        
        ChatUsuariosExample example = (ChatUsuariosExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ChatUsuarios record) {
        SQL sql = new SQL();
        sql.UPDATE("chat_usuarios");
        
        if (record.getIdCuentaUsuario() != null) {
            sql.SET("id_cuenta_usuario = #{idCuentaUsuario,jdbcType=VARCHAR}");
        }
        
        if (record.getNombre() != null) {
            sql.SET("nombre = #{nombre,jdbcType=VARCHAR}");
        }
        
        if (record.getApellido() != null) {
            sql.SET("apellido = #{apellido,jdbcType=VARCHAR}");
        }
        
        if (record.getTelefono() != null) {
            sql.SET("telefono = #{telefono,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getUbicacion() != null) {
            sql.SET("ubicacion = #{ubicacion,jdbcType=VARCHAR}");
        }
        
        if (record.getUltimaConversacion() != null) {
            sql.SET("ultima_conversacion = #{ultimaConversacion,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id_usuario = #{idUsuario,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ChatUsuariosExample example, boolean includeExamplePhrase) {
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