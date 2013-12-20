package com.smedia.sqzserver.dataservice.model.base;

import java.util.ArrayList;
import java.util.List;

public class WatchFolderAttrExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    public WatchFolderAttrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
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
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
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

        public Criteria andAttributeIdIsNull() {
            addCriterion("AttributeId is null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIsNotNull() {
            addCriterion("AttributeId is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdEqualTo(String value) {
            addCriterion("AttributeId =", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotEqualTo(String value) {
            addCriterion("AttributeId <>", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdGreaterThan(String value) {
            addCriterion("AttributeId >", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdGreaterThanOrEqualTo(String value) {
            addCriterion("AttributeId >=", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLessThan(String value) {
            addCriterion("AttributeId <", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLessThanOrEqualTo(String value) {
            addCriterion("AttributeId <=", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdLike(String value) {
            addCriterion("AttributeId like", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotLike(String value) {
            addCriterion("AttributeId not like", value, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdIn(List<String> values) {
            addCriterion("AttributeId in", values, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotIn(List<String> values) {
            addCriterion("AttributeId not in", values, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdBetween(String value1, String value2) {
            addCriterion("AttributeId between", value1, value2, "attributeId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdNotBetween(String value1, String value2) {
            addCriterion("AttributeId not between", value1, value2, "attributeId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdIsNull() {
            addCriterion("WatchFolderId is null");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdIsNotNull() {
            addCriterion("WatchFolderId is not null");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdEqualTo(String value) {
            addCriterion("WatchFolderId =", value, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdNotEqualTo(String value) {
            addCriterion("WatchFolderId <>", value, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdGreaterThan(String value) {
            addCriterion("WatchFolderId >", value, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdGreaterThanOrEqualTo(String value) {
            addCriterion("WatchFolderId >=", value, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdLessThan(String value) {
            addCriterion("WatchFolderId <", value, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdLessThanOrEqualTo(String value) {
            addCriterion("WatchFolderId <=", value, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdLike(String value) {
            addCriterion("WatchFolderId like", value, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdNotLike(String value) {
            addCriterion("WatchFolderId not like", value, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdIn(List<String> values) {
            addCriterion("WatchFolderId in", values, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdNotIn(List<String> values) {
            addCriterion("WatchFolderId not in", values, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdBetween(String value1, String value2) {
            addCriterion("WatchFolderId between", value1, value2, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andWatchFolderIdNotBetween(String value1, String value2) {
            addCriterion("WatchFolderId not between", value1, value2, "watchFolderId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("Value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("Value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("Value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("Value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("Value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("Value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("Value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("Value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("Value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("Value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("Value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("Value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("Value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("Value not between", value1, value2, "value");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 13 11:34:31 PDT 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table WatchFolderAttrs
     *
     * @mbggenerated Tue Mar 13 11:34:31 PDT 2012
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