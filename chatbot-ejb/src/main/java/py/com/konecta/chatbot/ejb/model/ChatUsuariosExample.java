package py.com.konecta.chatbot.ejb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatUsuariosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatUsuariosExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdUsuarioIsNull() {
            addCriterion("id_usuario is null");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIsNotNull() {
            addCriterion("id_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioEqualTo(Long value) {
            addCriterion("id_usuario =", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotEqualTo(Long value) {
            addCriterion("id_usuario <>", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioGreaterThan(Long value) {
            addCriterion("id_usuario >", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioGreaterThanOrEqualTo(Long value) {
            addCriterion("id_usuario >=", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLessThan(Long value) {
            addCriterion("id_usuario <", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLessThanOrEqualTo(Long value) {
            addCriterion("id_usuario <=", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIn(List<Long> values) {
            addCriterion("id_usuario in", values, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotIn(List<Long> values) {
            addCriterion("id_usuario not in", values, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioBetween(Long value1, Long value2) {
            addCriterion("id_usuario between", value1, value2, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotBetween(Long value1, Long value2) {
            addCriterion("id_usuario not between", value1, value2, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioIsNull() {
            addCriterion("id_cuenta_usuario is null");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioIsNotNull() {
            addCriterion("id_cuenta_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioEqualTo(String value) {
            addCriterion("id_cuenta_usuario =", value, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioNotEqualTo(String value) {
            addCriterion("id_cuenta_usuario <>", value, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioGreaterThan(String value) {
            addCriterion("id_cuenta_usuario >", value, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("id_cuenta_usuario >=", value, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioLessThan(String value) {
            addCriterion("id_cuenta_usuario <", value, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioLessThanOrEqualTo(String value) {
            addCriterion("id_cuenta_usuario <=", value, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioLike(String value) {
            addCriterion("id_cuenta_usuario like", value, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioNotLike(String value) {
            addCriterion("id_cuenta_usuario not like", value, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioIn(List<String> values) {
            addCriterion("id_cuenta_usuario in", values, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioNotIn(List<String> values) {
            addCriterion("id_cuenta_usuario not in", values, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioBetween(String value1, String value2) {
            addCriterion("id_cuenta_usuario between", value1, value2, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andIdCuentaUsuarioNotBetween(String value1, String value2) {
            addCriterion("id_cuenta_usuario not between", value1, value2, "idCuentaUsuario");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("nombre is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("nombre is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("nombre =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("nombre <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("nombre >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nombre >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("nombre <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("nombre <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("nombre like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("nombre not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("nombre in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("nombre not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("nombre between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("nombre not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andApellidoIsNull() {
            addCriterion("apellido is null");
            return (Criteria) this;
        }

        public Criteria andApellidoIsNotNull() {
            addCriterion("apellido is not null");
            return (Criteria) this;
        }

        public Criteria andApellidoEqualTo(String value) {
            addCriterion("apellido =", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotEqualTo(String value) {
            addCriterion("apellido <>", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoGreaterThan(String value) {
            addCriterion("apellido >", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoGreaterThanOrEqualTo(String value) {
            addCriterion("apellido >=", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoLessThan(String value) {
            addCriterion("apellido <", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoLessThanOrEqualTo(String value) {
            addCriterion("apellido <=", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoLike(String value) {
            addCriterion("apellido like", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotLike(String value) {
            addCriterion("apellido not like", value, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoIn(List<String> values) {
            addCriterion("apellido in", values, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotIn(List<String> values) {
            addCriterion("apellido not in", values, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoBetween(String value1, String value2) {
            addCriterion("apellido between", value1, value2, "apellido");
            return (Criteria) this;
        }

        public Criteria andApellidoNotBetween(String value1, String value2) {
            addCriterion("apellido not between", value1, value2, "apellido");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNull() {
            addCriterion("telefono is null");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNotNull() {
            addCriterion("telefono is not null");
            return (Criteria) this;
        }

        public Criteria andTelefonoEqualTo(String value) {
            addCriterion("telefono =", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotEqualTo(String value) {
            addCriterion("telefono <>", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThan(String value) {
            addCriterion("telefono >", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("telefono >=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThan(String value) {
            addCriterion("telefono <", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThanOrEqualTo(String value) {
            addCriterion("telefono <=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLike(String value) {
            addCriterion("telefono like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotLike(String value) {
            addCriterion("telefono not like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoIn(List<String> values) {
            addCriterion("telefono in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotIn(List<String> values) {
            addCriterion("telefono not in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoBetween(String value1, String value2) {
            addCriterion("telefono between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotBetween(String value1, String value2) {
            addCriterion("telefono not between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUbicacionIsNull() {
            addCriterion("ubicacion is null");
            return (Criteria) this;
        }

        public Criteria andUbicacionIsNotNull() {
            addCriterion("ubicacion is not null");
            return (Criteria) this;
        }

        public Criteria andUbicacionEqualTo(String value) {
            addCriterion("ubicacion =", value, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionNotEqualTo(String value) {
            addCriterion("ubicacion <>", value, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionGreaterThan(String value) {
            addCriterion("ubicacion >", value, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionGreaterThanOrEqualTo(String value) {
            addCriterion("ubicacion >=", value, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionLessThan(String value) {
            addCriterion("ubicacion <", value, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionLessThanOrEqualTo(String value) {
            addCriterion("ubicacion <=", value, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionLike(String value) {
            addCriterion("ubicacion like", value, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionNotLike(String value) {
            addCriterion("ubicacion not like", value, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionIn(List<String> values) {
            addCriterion("ubicacion in", values, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionNotIn(List<String> values) {
            addCriterion("ubicacion not in", values, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionBetween(String value1, String value2) {
            addCriterion("ubicacion between", value1, value2, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUbicacionNotBetween(String value1, String value2) {
            addCriterion("ubicacion not between", value1, value2, "ubicacion");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionIsNull() {
            addCriterion("ultima_conversacion is null");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionIsNotNull() {
            addCriterion("ultima_conversacion is not null");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionEqualTo(Date value) {
            addCriterion("ultima_conversacion =", value, "ultimaConversacion");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionNotEqualTo(Date value) {
            addCriterion("ultima_conversacion <>", value, "ultimaConversacion");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionGreaterThan(Date value) {
            addCriterion("ultima_conversacion >", value, "ultimaConversacion");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionGreaterThanOrEqualTo(Date value) {
            addCriterion("ultima_conversacion >=", value, "ultimaConversacion");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionLessThan(Date value) {
            addCriterion("ultima_conversacion <", value, "ultimaConversacion");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionLessThanOrEqualTo(Date value) {
            addCriterion("ultima_conversacion <=", value, "ultimaConversacion");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionIn(List<Date> values) {
            addCriterion("ultima_conversacion in", values, "ultimaConversacion");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionNotIn(List<Date> values) {
            addCriterion("ultima_conversacion not in", values, "ultimaConversacion");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionBetween(Date value1, Date value2) {
            addCriterion("ultima_conversacion between", value1, value2, "ultimaConversacion");
            return (Criteria) this;
        }

        public Criteria andUltimaConversacionNotBetween(Date value1, Date value2) {
            addCriterion("ultima_conversacion not between", value1, value2, "ultimaConversacion");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}