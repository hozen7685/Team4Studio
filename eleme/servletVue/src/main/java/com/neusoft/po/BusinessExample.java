package com.neusoft.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBnameIsNull() {
            addCriterion("bName is null");
            return (Criteria) this;
        }

        public Criteria andBnameIsNotNull() {
            addCriterion("bName is not null");
            return (Criteria) this;
        }

        public Criteria andBnameEqualTo(String value) {
            addCriterion("bName =", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotEqualTo(String value) {
            addCriterion("bName <>", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThan(String value) {
            addCriterion("bName >", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameGreaterThanOrEqualTo(String value) {
            addCriterion("bName >=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThan(String value) {
            addCriterion("bName <", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLessThanOrEqualTo(String value) {
            addCriterion("bName <=", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameLike(String value) {
            addCriterion("bName like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotLike(String value) {
            addCriterion("bName not like", value, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameIn(List<String> values) {
            addCriterion("bName in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotIn(List<String> values) {
            addCriterion("bName not in", values, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameBetween(String value1, String value2) {
            addCriterion("bName between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBnameNotBetween(String value1, String value2) {
            addCriterion("bName not between", value1, value2, "bname");
            return (Criteria) this;
        }

        public Criteria andBaddIsNull() {
            addCriterion("bAdd is null");
            return (Criteria) this;
        }

        public Criteria andBaddIsNotNull() {
            addCriterion("bAdd is not null");
            return (Criteria) this;
        }

        public Criteria andBaddEqualTo(String value) {
            addCriterion("bAdd =", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddNotEqualTo(String value) {
            addCriterion("bAdd <>", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddGreaterThan(String value) {
            addCriterion("bAdd >", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddGreaterThanOrEqualTo(String value) {
            addCriterion("bAdd >=", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddLessThan(String value) {
            addCriterion("bAdd <", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddLessThanOrEqualTo(String value) {
            addCriterion("bAdd <=", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddLike(String value) {
            addCriterion("bAdd like", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddNotLike(String value) {
            addCriterion("bAdd not like", value, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddIn(List<String> values) {
            addCriterion("bAdd in", values, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddNotIn(List<String> values) {
            addCriterion("bAdd not in", values, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddBetween(String value1, String value2) {
            addCriterion("bAdd between", value1, value2, "badd");
            return (Criteria) this;
        }

        public Criteria andBaddNotBetween(String value1, String value2) {
            addCriterion("bAdd not between", value1, value2, "badd");
            return (Criteria) this;
        }

        public Criteria andBinfoIsNull() {
            addCriterion("bInfo is null");
            return (Criteria) this;
        }

        public Criteria andBinfoIsNotNull() {
            addCriterion("bInfo is not null");
            return (Criteria) this;
        }

        public Criteria andBinfoEqualTo(String value) {
            addCriterion("bInfo =", value, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoNotEqualTo(String value) {
            addCriterion("bInfo <>", value, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoGreaterThan(String value) {
            addCriterion("bInfo >", value, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoGreaterThanOrEqualTo(String value) {
            addCriterion("bInfo >=", value, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoLessThan(String value) {
            addCriterion("bInfo <", value, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoLessThanOrEqualTo(String value) {
            addCriterion("bInfo <=", value, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoLike(String value) {
            addCriterion("bInfo like", value, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoNotLike(String value) {
            addCriterion("bInfo not like", value, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoIn(List<String> values) {
            addCriterion("bInfo in", values, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoNotIn(List<String> values) {
            addCriterion("bInfo not in", values, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoBetween(String value1, String value2) {
            addCriterion("bInfo between", value1, value2, "binfo");
            return (Criteria) this;
        }

        public Criteria andBinfoNotBetween(String value1, String value2) {
            addCriterion("bInfo not between", value1, value2, "binfo");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidIsNull() {
            addCriterion("orderTypeId is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidIsNotNull() {
            addCriterion("orderTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidEqualTo(Integer value) {
            addCriterion("orderTypeId =", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidNotEqualTo(Integer value) {
            addCriterion("orderTypeId <>", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidGreaterThan(Integer value) {
            addCriterion("orderTypeId >", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderTypeId >=", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidLessThan(Integer value) {
            addCriterion("orderTypeId <", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidLessThanOrEqualTo(Integer value) {
            addCriterion("orderTypeId <=", value, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidIn(List<Integer> values) {
            addCriterion("orderTypeId in", values, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidNotIn(List<Integer> values) {
            addCriterion("orderTypeId not in", values, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidBetween(Integer value1, Integer value2) {
            addCriterion("orderTypeId between", value1, value2, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andOrdertypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderTypeId not between", value1, value2, "ordertypeid");
            return (Criteria) this;
        }

        public Criteria andStartpriceIsNull() {
            addCriterion("startPrice is null");
            return (Criteria) this;
        }

        public Criteria andStartpriceIsNotNull() {
            addCriterion("startPrice is not null");
            return (Criteria) this;
        }

        public Criteria andStartpriceEqualTo(BigDecimal value) {
            addCriterion("startPrice =", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceNotEqualTo(BigDecimal value) {
            addCriterion("startPrice <>", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceGreaterThan(BigDecimal value) {
            addCriterion("startPrice >", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("startPrice >=", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceLessThan(BigDecimal value) {
            addCriterion("startPrice <", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("startPrice <=", value, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceIn(List<BigDecimal> values) {
            addCriterion("startPrice in", values, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceNotIn(List<BigDecimal> values) {
            addCriterion("startPrice not in", values, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("startPrice between", value1, value2, "startprice");
            return (Criteria) this;
        }

        public Criteria andStartpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("startPrice not between", value1, value2, "startprice");
            return (Criteria) this;
        }

        public Criteria andDelipriceIsNull() {
            addCriterion("deliPrice is null");
            return (Criteria) this;
        }

        public Criteria andDelipriceIsNotNull() {
            addCriterion("deliPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDelipriceEqualTo(BigDecimal value) {
            addCriterion("deliPrice =", value, "deliprice");
            return (Criteria) this;
        }

        public Criteria andDelipriceNotEqualTo(BigDecimal value) {
            addCriterion("deliPrice <>", value, "deliprice");
            return (Criteria) this;
        }

        public Criteria andDelipriceGreaterThan(BigDecimal value) {
            addCriterion("deliPrice >", value, "deliprice");
            return (Criteria) this;
        }

        public Criteria andDelipriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deliPrice >=", value, "deliprice");
            return (Criteria) this;
        }

        public Criteria andDelipriceLessThan(BigDecimal value) {
            addCriterion("deliPrice <", value, "deliprice");
            return (Criteria) this;
        }

        public Criteria andDelipriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deliPrice <=", value, "deliprice");
            return (Criteria) this;
        }

        public Criteria andDelipriceIn(List<BigDecimal> values) {
            addCriterion("deliPrice in", values, "deliprice");
            return (Criteria) this;
        }

        public Criteria andDelipriceNotIn(List<BigDecimal> values) {
            addCriterion("deliPrice not in", values, "deliprice");
            return (Criteria) this;
        }

        public Criteria andDelipriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliPrice between", value1, value2, "deliprice");
            return (Criteria) this;
        }

        public Criteria andDelipriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliPrice not between", value1, value2, "deliprice");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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