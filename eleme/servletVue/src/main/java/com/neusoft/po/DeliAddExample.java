package com.neusoft.po;

import java.util.ArrayList;
import java.util.List;

public class DeliAddExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliAddExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andDaidIsNull() {
            addCriterion("daId is null");
            return (Criteria) this;
        }

        public Criteria andDaidIsNotNull() {
            addCriterion("daId is not null");
            return (Criteria) this;
        }

        public Criteria andDaidEqualTo(Integer value) {
            addCriterion("daId =", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidNotEqualTo(Integer value) {
            addCriterion("daId <>", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidGreaterThan(Integer value) {
            addCriterion("daId >", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("daId >=", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidLessThan(Integer value) {
            addCriterion("daId <", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidLessThanOrEqualTo(Integer value) {
            addCriterion("daId <=", value, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidIn(List<Integer> values) {
            addCriterion("daId in", values, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidNotIn(List<Integer> values) {
            addCriterion("daId not in", values, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidBetween(Integer value1, Integer value2) {
            addCriterion("daId between", value1, value2, "daid");
            return (Criteria) this;
        }

        public Criteria andDaidNotBetween(Integer value1, Integer value2) {
            addCriterion("daId not between", value1, value2, "daid");
            return (Criteria) this;
        }

        public Criteria andConnameIsNull() {
            addCriterion("conName is null");
            return (Criteria) this;
        }

        public Criteria andConnameIsNotNull() {
            addCriterion("conName is not null");
            return (Criteria) this;
        }

        public Criteria andConnameEqualTo(String value) {
            addCriterion("conName =", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotEqualTo(String value) {
            addCriterion("conName <>", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameGreaterThan(String value) {
            addCriterion("conName >", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameGreaterThanOrEqualTo(String value) {
            addCriterion("conName >=", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameLessThan(String value) {
            addCriterion("conName <", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameLessThanOrEqualTo(String value) {
            addCriterion("conName <=", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameLike(String value) {
            addCriterion("conName like", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotLike(String value) {
            addCriterion("conName not like", value, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameIn(List<String> values) {
            addCriterion("conName in", values, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotIn(List<String> values) {
            addCriterion("conName not in", values, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameBetween(String value1, String value2) {
            addCriterion("conName between", value1, value2, "conname");
            return (Criteria) this;
        }

        public Criteria andConnameNotBetween(String value1, String value2) {
            addCriterion("conName not between", value1, value2, "conname");
            return (Criteria) this;
        }

        public Criteria andConsexIsNull() {
            addCriterion("conSex is null");
            return (Criteria) this;
        }

        public Criteria andConsexIsNotNull() {
            addCriterion("conSex is not null");
            return (Criteria) this;
        }

        public Criteria andConsexEqualTo(Integer value) {
            addCriterion("conSex =", value, "consex");
            return (Criteria) this;
        }

        public Criteria andConsexNotEqualTo(Integer value) {
            addCriterion("conSex <>", value, "consex");
            return (Criteria) this;
        }

        public Criteria andConsexGreaterThan(Integer value) {
            addCriterion("conSex >", value, "consex");
            return (Criteria) this;
        }

        public Criteria andConsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("conSex >=", value, "consex");
            return (Criteria) this;
        }

        public Criteria andConsexLessThan(Integer value) {
            addCriterion("conSex <", value, "consex");
            return (Criteria) this;
        }

        public Criteria andConsexLessThanOrEqualTo(Integer value) {
            addCriterion("conSex <=", value, "consex");
            return (Criteria) this;
        }

        public Criteria andConsexIn(List<Integer> values) {
            addCriterion("conSex in", values, "consex");
            return (Criteria) this;
        }

        public Criteria andConsexNotIn(List<Integer> values) {
            addCriterion("conSex not in", values, "consex");
            return (Criteria) this;
        }

        public Criteria andConsexBetween(Integer value1, Integer value2) {
            addCriterion("conSex between", value1, value2, "consex");
            return (Criteria) this;
        }

        public Criteria andConsexNotBetween(Integer value1, Integer value2) {
            addCriterion("conSex not between", value1, value2, "consex");
            return (Criteria) this;
        }

        public Criteria andContelIsNull() {
            addCriterion("conTel is null");
            return (Criteria) this;
        }

        public Criteria andContelIsNotNull() {
            addCriterion("conTel is not null");
            return (Criteria) this;
        }

        public Criteria andContelEqualTo(String value) {
            addCriterion("conTel =", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelNotEqualTo(String value) {
            addCriterion("conTel <>", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelGreaterThan(String value) {
            addCriterion("conTel >", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelGreaterThanOrEqualTo(String value) {
            addCriterion("conTel >=", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelLessThan(String value) {
            addCriterion("conTel <", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelLessThanOrEqualTo(String value) {
            addCriterion("conTel <=", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelLike(String value) {
            addCriterion("conTel like", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelNotLike(String value) {
            addCriterion("conTel not like", value, "contel");
            return (Criteria) this;
        }

        public Criteria andContelIn(List<String> values) {
            addCriterion("conTel in", values, "contel");
            return (Criteria) this;
        }

        public Criteria andContelNotIn(List<String> values) {
            addCriterion("conTel not in", values, "contel");
            return (Criteria) this;
        }

        public Criteria andContelBetween(String value1, String value2) {
            addCriterion("conTel between", value1, value2, "contel");
            return (Criteria) this;
        }

        public Criteria andContelNotBetween(String value1, String value2) {
            addCriterion("conTel not between", value1, value2, "contel");
            return (Criteria) this;
        }

        public Criteria andAddIsNull() {
            addCriterion("add is null");
            return (Criteria) this;
        }

        public Criteria andAddIsNotNull() {
            addCriterion("add is not null");
            return (Criteria) this;
        }

        public Criteria andAddEqualTo(String value) {
            addCriterion("add =", value, "add");
            return (Criteria) this;
        }

        public Criteria andAddNotEqualTo(String value) {
            addCriterion("add <>", value, "add");
            return (Criteria) this;
        }

        public Criteria andAddGreaterThan(String value) {
            addCriterion("add >", value, "add");
            return (Criteria) this;
        }

        public Criteria andAddGreaterThanOrEqualTo(String value) {
            addCriterion("add >=", value, "add");
            return (Criteria) this;
        }

        public Criteria andAddLessThan(String value) {
            addCriterion("add <", value, "add");
            return (Criteria) this;
        }

        public Criteria andAddLessThanOrEqualTo(String value) {
            addCriterion("add <=", value, "add");
            return (Criteria) this;
        }

        public Criteria andAddLike(String value) {
            addCriterion("add like", value, "add");
            return (Criteria) this;
        }

        public Criteria andAddNotLike(String value) {
            addCriterion("add not like", value, "add");
            return (Criteria) this;
        }

        public Criteria andAddIn(List<String> values) {
            addCriterion("add in", values, "add");
            return (Criteria) this;
        }

        public Criteria andAddNotIn(List<String> values) {
            addCriterion("add not in", values, "add");
            return (Criteria) this;
        }

        public Criteria andAddBetween(String value1, String value2) {
            addCriterion("add between", value1, value2, "add");
            return (Criteria) this;
        }

        public Criteria andAddNotBetween(String value1, String value2) {
            addCriterion("add not between", value1, value2, "add");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
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