package com.smedia.sqzserver.dataservice.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PresetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public PresetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
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
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
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

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
		    addCriterion("Name in", values, "name");
		    return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
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

        public Criteria andWorkflowIsNull() {
            addCriterion("Workflow is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowIsNotNull() {
            addCriterion("Workflow is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowEqualTo(String value) {
            addCriterion("Workflow =", value, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowNotEqualTo(String value) {
            addCriterion("Workflow <>", value, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowGreaterThan(String value) {
            addCriterion("Workflow >", value, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowGreaterThanOrEqualTo(String value) {
            addCriterion("Workflow >=", value, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowLessThan(String value) {
            addCriterion("Workflow <", value, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowLessThanOrEqualTo(String value) {
            addCriterion("Workflow <=", value, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowLike(String value) {
            addCriterion("Workflow like", value, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowNotLike(String value) {
            addCriterion("Workflow not like", value, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowIn(List<String> values) {
            addCriterion("Workflow in", values, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowNotIn(List<String> values) {
            addCriterion("Workflow not in", values, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowBetween(String value1, String value2) {
            addCriterion("Workflow between", value1, value2, "workflow");
            return (Criteria) this;
        }

        public Criteria andWorkflowNotBetween(String value1, String value2) {
            addCriterion("Workflow not between", value1, value2, "workflow");
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

        public Criteria andDeletedIsNull() {
            addCriterion("Deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("Deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("Deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("Deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("Deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("Deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("Deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("Deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("Deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("Deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNull() {
            addCriterion("Published is null");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNotNull() {
            addCriterion("Published is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedEqualTo(Boolean value) {
            addCriterion("Published =", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotEqualTo(Boolean value) {
            addCriterion("Published <>", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThan(Boolean value) {
            addCriterion("Published >", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Published >=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThan(Boolean value) {
            addCriterion("Published <", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThanOrEqualTo(Boolean value) {
            addCriterion("Published <=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedIn(List<Boolean> values) {
            addCriterion("Published in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotIn(List<Boolean> values) {
            addCriterion("Published not in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedBetween(Boolean value1, Boolean value2) {
            addCriterion("Published between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Published not between", value1, value2, "published");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Presets
     *
     * @mbggenerated do_not_delete_during_merge Sun Jan 01 09:09:58 PST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Presets
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
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