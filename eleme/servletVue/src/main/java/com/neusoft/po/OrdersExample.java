package com.neusoft.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
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

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(Integer value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(Integer value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andOdateIsNull() {
            addCriterion("oDate is null");
            return (Criteria) this;
        }

        public Criteria andOdateIsNotNull() {
            addCriterion("oDate is not null");
            return (Criteria) this;
        }

        public Criteria andOdateEqualTo(String value) {
            addCriterion("oDate =", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotEqualTo(String value) {
            addCriterion("oDate <>", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThan(String value) {
            addCriterion("oDate >", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThanOrEqualTo(String value) {
            addCriterion("oDate >=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThan(String value) {
            addCriterion("oDate <", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThanOrEqualTo(String value) {
            addCriterion("oDate <=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLike(String value) {
            addCriterion("oDate like", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotLike(String value) {
            addCriterion("oDate not like", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateIn(List<String> values) {
            addCriterion("oDate in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotIn(List<String> values) {
            addCriterion("oDate not in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateBetween(String value1, String value2) {
            addCriterion("oDate between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotBetween(String value1, String value2) {
            addCriterion("oDate not between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andOttIsNull() {
            addCriterion("oTT is null");
            return (Criteria) this;
        }

        public Criteria andOttIsNotNull() {
            addCriterion("oTT is not null");
            return (Criteria) this;
        }

        public Criteria andOttEqualTo(BigDecimal value) {
            addCriterion("oTT =", value, "ott");
            return (Criteria) this;
        }

        public Criteria andOttNotEqualTo(BigDecimal value) {
            addCriterion("oTT <>", value, "ott");
            return (Criteria) this;
        }

        public Criteria andOttGreaterThan(BigDecimal value) {
            addCriterion("oTT >", value, "ott");
            return (Criteria) this;
        }

        public Criteria andOttGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("oTT >=", value, "ott");
            return (Criteria) this;
        }

        public Criteria andOttLessThan(BigDecimal value) {
            addCriterion("oTT <", value, "ott");
            return (Criteria) this;
        }

        public Criteria andOttLessThanOrEqualTo(BigDecimal value) {
            addCriterion("oTT <=", value, "ott");
            return (Criteria) this;
        }

        public Criteria andOttIn(List<BigDecimal> values) {
            addCriterion("oTT in", values, "ott");
            return (Criteria) this;
        }

        public Criteria andOttNotIn(List<BigDecimal> values) {
            addCriterion("oTT not in", values, "ott");
            return (Criteria) this;
        }

        public Criteria andOttBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oTT between", value1, value2, "ott");
            return (Criteria) this;
        }

        public Criteria andOttNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("oTT not between", value1, value2, "ott");
            return (Criteria) this;
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

        public Criteria andOstateIsNull() {
            addCriterion("oState is null");
            return (Criteria) this;
        }

        public Criteria andOstateIsNotNull() {
            addCriterion("oState is not null");
            return (Criteria) this;
        }

        public Criteria andOstateEqualTo(Integer value) {
            addCriterion("oState =", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotEqualTo(Integer value) {
            addCriterion("oState <>", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateGreaterThan(Integer value) {
            addCriterion("oState >", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("oState >=", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateLessThan(Integer value) {
            addCriterion("oState <", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateLessThanOrEqualTo(Integer value) {
            addCriterion("oState <=", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateIn(List<Integer> values) {
            addCriterion("oState in", values, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotIn(List<Integer> values) {
            addCriterion("oState not in", values, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateBetween(Integer value1, Integer value2) {
            addCriterion("oState between", value1, value2, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotBetween(Integer value1, Integer value2) {
            addCriterion("oState not between", value1, value2, "ostate");
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