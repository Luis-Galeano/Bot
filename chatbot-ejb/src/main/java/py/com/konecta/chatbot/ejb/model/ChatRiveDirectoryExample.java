package py.com.konecta.chatbot.ejb.model;

import java.util.ArrayList;
import java.util.List;

public class ChatRiveDirectoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatRiveDirectoryExample() {
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

        public Criteria andIdRiveDirectoryIsNull() {
            addCriterion("id_rive_directory is null");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryIsNotNull() {
            addCriterion("id_rive_directory is not null");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryEqualTo(Long value) {
            addCriterion("id_rive_directory =", value, "idRiveDirectory");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryNotEqualTo(Long value) {
            addCriterion("id_rive_directory <>", value, "idRiveDirectory");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryGreaterThan(Long value) {
            addCriterion("id_rive_directory >", value, "idRiveDirectory");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryGreaterThanOrEqualTo(Long value) {
            addCriterion("id_rive_directory >=", value, "idRiveDirectory");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryLessThan(Long value) {
            addCriterion("id_rive_directory <", value, "idRiveDirectory");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryLessThanOrEqualTo(Long value) {
            addCriterion("id_rive_directory <=", value, "idRiveDirectory");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryIn(List<Long> values) {
            addCriterion("id_rive_directory in", values, "idRiveDirectory");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryNotIn(List<Long> values) {
            addCriterion("id_rive_directory not in", values, "idRiveDirectory");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryBetween(Long value1, Long value2) {
            addCriterion("id_rive_directory between", value1, value2, "idRiveDirectory");
            return (Criteria) this;
        }

        public Criteria andIdRiveDirectoryNotBetween(Long value1, Long value2) {
            addCriterion("id_rive_directory not between", value1, value2, "idRiveDirectory");
            return (Criteria) this;
        }

        public Criteria andIdRolIsNull() {
            addCriterion("id_rol is null");
            return (Criteria) this;
        }

        public Criteria andIdRolIsNotNull() {
            addCriterion("id_rol is not null");
            return (Criteria) this;
        }

        public Criteria andIdRolEqualTo(Long value) {
            addCriterion("id_rol =", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolNotEqualTo(Long value) {
            addCriterion("id_rol <>", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolGreaterThan(Long value) {
            addCriterion("id_rol >", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolGreaterThanOrEqualTo(Long value) {
            addCriterion("id_rol >=", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolLessThan(Long value) {
            addCriterion("id_rol <", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolLessThanOrEqualTo(Long value) {
            addCriterion("id_rol <=", value, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolIn(List<Long> values) {
            addCriterion("id_rol in", values, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolNotIn(List<Long> values) {
            addCriterion("id_rol not in", values, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolBetween(Long value1, Long value2) {
            addCriterion("id_rol between", value1, value2, "idRol");
            return (Criteria) this;
        }

        public Criteria andIdRolNotBetween(Long value1, Long value2) {
            addCriterion("id_rol not between", value1, value2, "idRol");
            return (Criteria) this;
        }

        public Criteria andDirectoryIsNull() {
            addCriterion("directory is null");
            return (Criteria) this;
        }

        public Criteria andDirectoryIsNotNull() {
            addCriterion("directory is not null");
            return (Criteria) this;
        }

        public Criteria andDirectoryEqualTo(String value) {
            addCriterion("directory =", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryNotEqualTo(String value) {
            addCriterion("directory <>", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryGreaterThan(String value) {
            addCriterion("directory >", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryGreaterThanOrEqualTo(String value) {
            addCriterion("directory >=", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryLessThan(String value) {
            addCriterion("directory <", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryLessThanOrEqualTo(String value) {
            addCriterion("directory <=", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryLike(String value) {
            addCriterion("directory like", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryNotLike(String value) {
            addCriterion("directory not like", value, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryIn(List<String> values) {
            addCriterion("directory in", values, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryNotIn(List<String> values) {
            addCriterion("directory not in", values, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryBetween(String value1, String value2) {
            addCriterion("directory between", value1, value2, "directory");
            return (Criteria) this;
        }

        public Criteria andDirectoryNotBetween(String value1, String value2) {
            addCriterion("directory not between", value1, value2, "directory");
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