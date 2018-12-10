package py.com.konecta.chatbot.ejb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChatLineaTextoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatLineaTextoExample() {
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

        public Criteria andIdLineaTextoIsNull() {
            addCriterion("id_linea_texto is null");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoIsNotNull() {
            addCriterion("id_linea_texto is not null");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoEqualTo(Long value) {
            addCriterion("id_linea_texto =", value, "idLineaTexto");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoNotEqualTo(Long value) {
            addCriterion("id_linea_texto <>", value, "idLineaTexto");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoGreaterThan(Long value) {
            addCriterion("id_linea_texto >", value, "idLineaTexto");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoGreaterThanOrEqualTo(Long value) {
            addCriterion("id_linea_texto >=", value, "idLineaTexto");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoLessThan(Long value) {
            addCriterion("id_linea_texto <", value, "idLineaTexto");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoLessThanOrEqualTo(Long value) {
            addCriterion("id_linea_texto <=", value, "idLineaTexto");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoIn(List<Long> values) {
            addCriterion("id_linea_texto in", values, "idLineaTexto");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoNotIn(List<Long> values) {
            addCriterion("id_linea_texto not in", values, "idLineaTexto");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoBetween(Long value1, Long value2) {
            addCriterion("id_linea_texto between", value1, value2, "idLineaTexto");
            return (Criteria) this;
        }

        public Criteria andIdLineaTextoNotBetween(Long value1, Long value2) {
            addCriterion("id_linea_texto not between", value1, value2, "idLineaTexto");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIsNull() {
            addCriterion("id_usuario is null");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIsNotNull() {
            addCriterion("id_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioEqualTo(String value) {
            addCriterion("id_usuario =", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotEqualTo(String value) {
            addCriterion("id_usuario <>", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioGreaterThan(String value) {
            addCriterion("id_usuario >", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("id_usuario >=", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLessThan(String value) {
            addCriterion("id_usuario <", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLessThanOrEqualTo(String value) {
            addCriterion("id_usuario <=", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLike(String value) {
            addCriterion("id_usuario like", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotLike(String value) {
            addCriterion("id_usuario not like", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIn(List<String> values) {
            addCriterion("id_usuario in", values, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotIn(List<String> values) {
            addCriterion("id_usuario not in", values, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioBetween(String value1, String value2) {
            addCriterion("id_usuario between", value1, value2, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotBetween(String value1, String value2) {
            addCriterion("id_usuario not between", value1, value2, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdTransporteIsNull() {
            addCriterion("id_transporte is null");
            return (Criteria) this;
        }

        public Criteria andIdTransporteIsNotNull() {
            addCriterion("id_transporte is not null");
            return (Criteria) this;
        }

        public Criteria andIdTransporteEqualTo(Long value) {
            addCriterion("id_transporte =", value, "idTransporte");
            return (Criteria) this;
        }

        public Criteria andIdTransporteNotEqualTo(Long value) {
            addCriterion("id_transporte <>", value, "idTransporte");
            return (Criteria) this;
        }

        public Criteria andIdTransporteGreaterThan(Long value) {
            addCriterion("id_transporte >", value, "idTransporte");
            return (Criteria) this;
        }

        public Criteria andIdTransporteGreaterThanOrEqualTo(Long value) {
            addCriterion("id_transporte >=", value, "idTransporte");
            return (Criteria) this;
        }

        public Criteria andIdTransporteLessThan(Long value) {
            addCriterion("id_transporte <", value, "idTransporte");
            return (Criteria) this;
        }

        public Criteria andIdTransporteLessThanOrEqualTo(Long value) {
            addCriterion("id_transporte <=", value, "idTransporte");
            return (Criteria) this;
        }

        public Criteria andIdTransporteIn(List<Long> values) {
            addCriterion("id_transporte in", values, "idTransporte");
            return (Criteria) this;
        }

        public Criteria andIdTransporteNotIn(List<Long> values) {
            addCriterion("id_transporte not in", values, "idTransporte");
            return (Criteria) this;
        }

        public Criteria andIdTransporteBetween(Long value1, Long value2) {
            addCriterion("id_transporte between", value1, value2, "idTransporte");
            return (Criteria) this;
        }

        public Criteria andIdTransporteNotBetween(Long value1, Long value2) {
            addCriterion("id_transporte not between", value1, value2, "idTransporte");
            return (Criteria) this;
        }

        public Criteria andFechaIsNull() {
            addCriterion("fecha is null");
            return (Criteria) this;
        }

        public Criteria andFechaIsNotNull() {
            addCriterion("fecha is not null");
            return (Criteria) this;
        }

        public Criteria andFechaEqualTo(Date value) {
            addCriterion("fecha =", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotEqualTo(Date value) {
            addCriterion("fecha <>", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThan(Date value) {
            addCriterion("fecha >", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThanOrEqualTo(Date value) {
            addCriterion("fecha >=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThan(Date value) {
            addCriterion("fecha <", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThanOrEqualTo(Date value) {
            addCriterion("fecha <=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaIn(List<Date> values) {
            addCriterion("fecha in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotIn(List<Date> values) {
            addCriterion("fecha not in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaBetween(Date value1, Date value2) {
            addCriterion("fecha between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotBetween(Date value1, Date value2) {
            addCriterion("fecha not between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNull() {
            addCriterion("direccion is null");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNotNull() {
            addCriterion("direccion is not null");
            return (Criteria) this;
        }

        public Criteria andDireccionEqualTo(String value) {
            addCriterion("direccion =", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotEqualTo(String value) {
            addCriterion("direccion <>", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThan(String value) {
            addCriterion("direccion >", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("direccion >=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThan(String value) {
            addCriterion("direccion <", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThanOrEqualTo(String value) {
            addCriterion("direccion <=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLike(String value) {
            addCriterion("direccion like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotLike(String value) {
            addCriterion("direccion not like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionIn(List<String> values) {
            addCriterion("direccion in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotIn(List<String> values) {
            addCriterion("direccion not in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionBetween(String value1, String value2) {
            addCriterion("direccion between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotBetween(String value1, String value2) {
            addCriterion("direccion not between", value1, value2, "direccion");
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