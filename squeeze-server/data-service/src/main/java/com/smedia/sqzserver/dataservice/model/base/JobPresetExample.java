package com.smedia.sqzserver.dataservice.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobPresetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    public JobPresetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
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
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
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

        public Criteria andJobPresetIdIsNull() {
            addCriterion("JobPresetId is null");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdIsNotNull() {
            addCriterion("JobPresetId is not null");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdEqualTo(String value) {
            addCriterion("JobPresetId =", value, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdNotEqualTo(String value) {
            addCriterion("JobPresetId <>", value, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdGreaterThan(String value) {
            addCriterion("JobPresetId >", value, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdGreaterThanOrEqualTo(String value) {
            addCriterion("JobPresetId >=", value, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdLessThan(String value) {
            addCriterion("JobPresetId <", value, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdLessThanOrEqualTo(String value) {
            addCriterion("JobPresetId <=", value, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdLike(String value) {
            addCriterion("JobPresetId like", value, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdNotLike(String value) {
            addCriterion("JobPresetId not like", value, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdIn(List<String> values) {
            addCriterion("JobPresetId in", values, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdNotIn(List<String> values) {
            addCriterion("JobPresetId not in", values, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdBetween(String value1, String value2) {
            addCriterion("JobPresetId between", value1, value2, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobPresetIdNotBetween(String value1, String value2) {
            addCriterion("JobPresetId not between", value1, value2, "jobPresetId");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("JobId is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("JobId is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(String value) {
            addCriterion("JobId =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(String value) {
            addCriterion("JobId <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(String value) {
            addCriterion("JobId >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("JobId >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(String value) {
            addCriterion("JobId <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(String value) {
            addCriterion("JobId <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLike(String value) {
            addCriterion("JobId like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotLike(String value) {
            addCriterion("JobId not like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<String> values) {
            addCriterion("JobId in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<String> values) {
            addCriterion("JobId not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(String value1, String value2) {
            addCriterion("JobId between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(String value1, String value2) {
            addCriterion("JobId not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andPresetIdIsNull() {
            addCriterion("PresetId is null");
            return (Criteria) this;
        }

        public Criteria andPresetIdIsNotNull() {
            addCriterion("PresetId is not null");
            return (Criteria) this;
        }

        public Criteria andPresetIdEqualTo(String value) {
            addCriterion("PresetId =", value, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdNotEqualTo(String value) {
            addCriterion("PresetId <>", value, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdGreaterThan(String value) {
            addCriterion("PresetId >", value, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdGreaterThanOrEqualTo(String value) {
            addCriterion("PresetId >=", value, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdLessThan(String value) {
            addCriterion("PresetId <", value, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdLessThanOrEqualTo(String value) {
            addCriterion("PresetId <=", value, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdLike(String value) {
            addCriterion("PresetId like", value, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdNotLike(String value) {
            addCriterion("PresetId not like", value, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdIn(List<String> values) {
            addCriterion("PresetId in", values, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdNotIn(List<String> values) {
            addCriterion("PresetId not in", values, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdBetween(String value1, String value2) {
            addCriterion("PresetId between", value1, value2, "presetId");
            return (Criteria) this;
        }

        public Criteria andPresetIdNotBetween(String value1, String value2) {
            addCriterion("PresetId not between", value1, value2, "presetId");
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

        public Criteria andURIIsNull() {
            addCriterion("URI is null");
            return (Criteria) this;
        }

        public Criteria andURIIsNotNull() {
            addCriterion("URI is not null");
            return (Criteria) this;
        }

        public Criteria andURIEqualTo(String value) {
            addCriterion("URI =", value, "URI");
            return (Criteria) this;
        }

        public Criteria andURINotEqualTo(String value) {
            addCriterion("URI <>", value, "URI");
            return (Criteria) this;
        }

        public Criteria andURIGreaterThan(String value) {
            addCriterion("URI >", value, "URI");
            return (Criteria) this;
        }

        public Criteria andURIGreaterThanOrEqualTo(String value) {
            addCriterion("URI >=", value, "URI");
            return (Criteria) this;
        }

        public Criteria andURILessThan(String value) {
            addCriterion("URI <", value, "URI");
            return (Criteria) this;
        }

        public Criteria andURILessThanOrEqualTo(String value) {
            addCriterion("URI <=", value, "URI");
            return (Criteria) this;
        }

        public Criteria andURILike(String value) {
            addCriterion("URI like", value, "URI");
            return (Criteria) this;
        }

        public Criteria andURINotLike(String value) {
            addCriterion("URI not like", value, "URI");
            return (Criteria) this;
        }

        public Criteria andURIIn(List<String> values) {
            addCriterion("URI in", values, "URI");
            return (Criteria) this;
        }

        public Criteria andURINotIn(List<String> values) {
            addCriterion("URI not in", values, "URI");
            return (Criteria) this;
        }

        public Criteria andURIBetween(String value1, String value2) {
            addCriterion("URI between", value1, value2, "URI");
            return (Criteria) this;
        }

        public Criteria andURINotBetween(String value1, String value2) {
            addCriterion("URI not between", value1, value2, "URI");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionIsNull() {
            addCriterion("ExpectedFileNameExtension is null");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionIsNotNull() {
            addCriterion("ExpectedFileNameExtension is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionEqualTo(String value) {
            addCriterion("ExpectedFileNameExtension =", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionNotEqualTo(String value) {
            addCriterion("ExpectedFileNameExtension <>", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionGreaterThan(String value) {
            addCriterion("ExpectedFileNameExtension >", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("ExpectedFileNameExtension >=", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionLessThan(String value) {
            addCriterion("ExpectedFileNameExtension <", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionLessThanOrEqualTo(String value) {
            addCriterion("ExpectedFileNameExtension <=", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionLike(String value) {
            addCriterion("ExpectedFileNameExtension like", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionNotLike(String value) {
            addCriterion("ExpectedFileNameExtension not like", value, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionIn(List<String> values) {
            addCriterion("ExpectedFileNameExtension in", values, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionNotIn(List<String> values) {
            addCriterion("ExpectedFileNameExtension not in", values, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionBetween(String value1, String value2) {
            addCriterion("ExpectedFileNameExtension between", value1, value2, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andExpectedFileNameExtensionNotBetween(String value1, String value2) {
            addCriterion("ExpectedFileNameExtension not between", value1, value2, "expectedFileNameExtension");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeIsNull() {
            addCriterion("EncoderType is null");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeIsNotNull() {
            addCriterion("EncoderType is not null");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeEqualTo(String value) {
            addCriterion("EncoderType =", value, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeNotEqualTo(String value) {
            addCriterion("EncoderType <>", value, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeGreaterThan(String value) {
            addCriterion("EncoderType >", value, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EncoderType >=", value, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeLessThan(String value) {
            addCriterion("EncoderType <", value, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeLessThanOrEqualTo(String value) {
            addCriterion("EncoderType <=", value, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeLike(String value) {
            addCriterion("EncoderType like", value, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeNotLike(String value) {
            addCriterion("EncoderType not like", value, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeIn(List<String> values) {
            addCriterion("EncoderType in", values, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeNotIn(List<String> values) {
            addCriterion("EncoderType not in", values, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeBetween(String value1, String value2) {
            addCriterion("EncoderType between", value1, value2, "encoderType");
            return (Criteria) this;
        }

        public Criteria andEncoderTypeNotBetween(String value1, String value2) {
            addCriterion("EncoderType not between", value1, value2, "encoderType");
            return (Criteria) this;
        }

        public Criteria andInPointIsNull() {
            addCriterion("InPoint is null");
            return (Criteria) this;
        }

        public Criteria andInPointIsNotNull() {
            addCriterion("InPoint is not null");
            return (Criteria) this;
        }

        public Criteria andInPointEqualTo(Double value) {
            addCriterion("InPoint =", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointNotEqualTo(Double value) {
            addCriterion("InPoint <>", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointGreaterThan(Double value) {
            addCriterion("InPoint >", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointGreaterThanOrEqualTo(Double value) {
            addCriterion("InPoint >=", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointLessThan(Double value) {
            addCriterion("InPoint <", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointLessThanOrEqualTo(Double value) {
            addCriterion("InPoint <=", value, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointIn(List<Double> values) {
            addCriterion("InPoint in", values, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointNotIn(List<Double> values) {
            addCriterion("InPoint not in", values, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointBetween(Double value1, Double value2) {
            addCriterion("InPoint between", value1, value2, "inPoint");
            return (Criteria) this;
        }

        public Criteria andInPointNotBetween(Double value1, Double value2) {
            addCriterion("InPoint not between", value1, value2, "inPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointIsNull() {
            addCriterion("OutPoint is null");
            return (Criteria) this;
        }

        public Criteria andOutPointIsNotNull() {
            addCriterion("OutPoint is not null");
            return (Criteria) this;
        }

        public Criteria andOutPointEqualTo(Double value) {
            addCriterion("OutPoint =", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointNotEqualTo(Double value) {
            addCriterion("OutPoint <>", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointGreaterThan(Double value) {
            addCriterion("OutPoint >", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointGreaterThanOrEqualTo(Double value) {
            addCriterion("OutPoint >=", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointLessThan(Double value) {
            addCriterion("OutPoint <", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointLessThanOrEqualTo(Double value) {
            addCriterion("OutPoint <=", value, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointIn(List<Double> values) {
            addCriterion("OutPoint in", values, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointNotIn(List<Double> values) {
            addCriterion("OutPoint not in", values, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointBetween(Double value1, Double value2) {
            addCriterion("OutPoint between", value1, value2, "outPoint");
            return (Criteria) this;
        }

        public Criteria andOutPointNotBetween(Double value1, Double value2) {
            addCriterion("OutPoint not between", value1, value2, "outPoint");
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
     * This class corresponds to the database table JobPresets
     *
     * @mbggenerated do_not_delete_during_merge Wed Apr 25 18:18:06 PDT 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table JobPresets
     *
     * @mbggenerated Wed Apr 25 18:18:06 PDT 2012
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