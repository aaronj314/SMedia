package com.smedia.sqzserver.dataservice.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServerQueueExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public ServerQueueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        public Criteria andServerQueueIdIsNull() {
            addCriterion("ServerQueueId is null");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdIsNotNull() {
            addCriterion("ServerQueueId is not null");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdEqualTo(String value) {
            addCriterion("ServerQueueId =", value, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdNotEqualTo(String value) {
            addCriterion("ServerQueueId <>", value, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdGreaterThan(String value) {
            addCriterion("ServerQueueId >", value, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdGreaterThanOrEqualTo(String value) {
            addCriterion("ServerQueueId >=", value, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdLessThan(String value) {
            addCriterion("ServerQueueId <", value, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdLessThanOrEqualTo(String value) {
            addCriterion("ServerQueueId <=", value, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdLike(String value) {
            addCriterion("ServerQueueId like", value, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdNotLike(String value) {
            addCriterion("ServerQueueId not like", value, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdIn(List<String> values) {
            addCriterion("ServerQueueId in", values, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdNotIn(List<String> values) {
            addCriterion("ServerQueueId not in", values, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdBetween(String value1, String value2) {
            addCriterion("ServerQueueId between", value1, value2, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerQueueIdNotBetween(String value1, String value2) {
            addCriterion("ServerQueueId not between", value1, value2, "serverQueueId");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("ServerId is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("ServerId is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(String value) {
            addCriterion("ServerId =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(String value) {
            addCriterion("ServerId <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(String value) {
            addCriterion("ServerId >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(String value) {
            addCriterion("ServerId >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(String value) {
            addCriterion("ServerId <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(String value) {
            addCriterion("ServerId <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLike(String value) {
            addCriterion("ServerId like", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotLike(String value) {
            addCriterion("ServerId not like", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<String> values) {
            addCriterion("ServerId in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<String> values) {
            addCriterion("ServerId not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(String value1, String value2) {
            addCriterion("ServerId between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(String value1, String value2) {
            addCriterion("ServerId not between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andQueueIdIsNull() {
            addCriterion("QueueId is null");
            return (Criteria) this;
        }

        public Criteria andQueueIdIsNotNull() {
            addCriterion("QueueId is not null");
            return (Criteria) this;
        }

        public Criteria andQueueIdEqualTo(String value) {
            addCriterion("QueueId =", value, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdNotEqualTo(String value) {
            addCriterion("QueueId <>", value, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdGreaterThan(String value) {
            addCriterion("QueueId >", value, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdGreaterThanOrEqualTo(String value) {
            addCriterion("QueueId >=", value, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdLessThan(String value) {
            addCriterion("QueueId <", value, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdLessThanOrEqualTo(String value) {
            addCriterion("QueueId <=", value, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdLike(String value) {
            addCriterion("QueueId like", value, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdNotLike(String value) {
            addCriterion("QueueId not like", value, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdIn(List<String> values) {
            addCriterion("QueueId in", values, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdNotIn(List<String> values) {
            addCriterion("QueueId not in", values, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdBetween(String value1, String value2) {
            addCriterion("QueueId between", value1, value2, "queueId");
            return (Criteria) this;
        }

        public Criteria andQueueIdNotBetween(String value1, String value2) {
            addCriterion("QueueId not between", value1, value2, "queueId");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("Order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("Order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(Integer value) {
            addCriterion("Order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(Integer value) {
            addCriterion("Order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(Integer value) {
            addCriterion("Order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(Integer value) {
            addCriterion("Order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(Integer value) {
            addCriterion("Order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<Integer> values) {
            addCriterion("Order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<Integer> values) {
            addCriterion("Order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(Integer value1, Integer value2) {
            addCriterion("Order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("Order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("Created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("Created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("Created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("Created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("Created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("Created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("Created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("Created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("Created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("Created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("Created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("Created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("Modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("Modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterion("Modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterion("Modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterion("Modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("Modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterion("Modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterion("Modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterion("Modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterion("Modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterion("Modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterion("Modified not between", value1, value2, "modified");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table serverqueues
     *
     * @mbggenerated do_not_delete_during_merge Thu Jan 26 23:49:44 MST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table serverqueues
     *
     * @mbggenerated Thu Jan 26 23:49:44 MST 2012
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}