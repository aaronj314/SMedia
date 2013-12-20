package com.smedia.sqzserver.dataservice.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LicenseKeyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    public LicenseKeyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
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
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
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

        public Criteria andLicenseKeyIdIsNull() {
            addCriterion("LicenseKeyId is null");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdIsNotNull() {
            addCriterion("LicenseKeyId is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdEqualTo(String value) {
            addCriterion("LicenseKeyId =", value, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdNotEqualTo(String value) {
            addCriterion("LicenseKeyId <>", value, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdGreaterThan(String value) {
            addCriterion("LicenseKeyId >", value, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdGreaterThanOrEqualTo(String value) {
            addCriterion("LicenseKeyId >=", value, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdLessThan(String value) {
            addCriterion("LicenseKeyId <", value, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdLessThanOrEqualTo(String value) {
            addCriterion("LicenseKeyId <=", value, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdLike(String value) {
            addCriterion("LicenseKeyId like", value, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdNotLike(String value) {
            addCriterion("LicenseKeyId not like", value, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdIn(List<String> values) {
            addCriterion("LicenseKeyId in", values, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdNotIn(List<String> values) {
            addCriterion("LicenseKeyId not in", values, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdBetween(String value1, String value2) {
            addCriterion("LicenseKeyId between", value1, value2, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIdNotBetween(String value1, String value2) {
            addCriterion("LicenseKeyId not between", value1, value2, "licenseKeyId");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIsNull() {
            addCriterion("LicenseKey is null");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIsNotNull() {
            addCriterion("LicenseKey is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyEqualTo(String value) {
            addCriterion("LicenseKey =", value, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyNotEqualTo(String value) {
            addCriterion("LicenseKey <>", value, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyGreaterThan(String value) {
            addCriterion("LicenseKey >", value, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyGreaterThanOrEqualTo(String value) {
            addCriterion("LicenseKey >=", value, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyLessThan(String value) {
            addCriterion("LicenseKey <", value, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyLessThanOrEqualTo(String value) {
            addCriterion("LicenseKey <=", value, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyLike(String value) {
            addCriterion("LicenseKey like", value, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyNotLike(String value) {
            addCriterion("LicenseKey not like", value, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyIn(List<String> values) {
            addCriterion("LicenseKey in", values, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyNotIn(List<String> values) {
            addCriterion("LicenseKey not in", values, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyBetween(String value1, String value2) {
            addCriterion("LicenseKey between", value1, value2, "licenseKey");
            return (Criteria) this;
        }

        public Criteria andLicenseKeyNotBetween(String value1, String value2) {
            addCriterion("LicenseKey not between", value1, value2, "licenseKey");
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("CompanyName like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table LicenseKeys
     *
     * @mbggenerated do_not_delete_during_merge Wed Jun 20 12:13:55 MDT 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table LicenseKeys
     *
     * @mbggenerated Wed Jun 20 12:13:55 MDT 2012
     */
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