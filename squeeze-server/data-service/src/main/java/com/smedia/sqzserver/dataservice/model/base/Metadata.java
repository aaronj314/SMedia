package com.smedia.sqzserver.dataservice.model.base;

import java.util.Date;

public class Metadata {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Metadata.MetadataId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String metadataId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Metadata.Name
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Metadata.Value
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Metadata.JobId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private String jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Metadata.Created
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Metadata.Modified
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    private Date modified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Metadata.MetadataId
     *
     * @return the value of Metadata.MetadataId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getMetadataId() {
        return metadataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Metadata.MetadataId
     *
     * @param metadataId the value for Metadata.MetadataId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setMetadataId(String metadataId) {
        this.metadataId = metadataId == null ? null : metadataId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Metadata.Name
     *
     * @return the value of Metadata.Name
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Metadata.Name
     *
     * @param name the value for Metadata.Name
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Metadata.Value
     *
     * @return the value of Metadata.Value
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Metadata.Value
     *
     * @param value the value for Metadata.Value
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Metadata.JobId
     *
     * @return the value of Metadata.JobId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Metadata.JobId
     *
     * @param jobId the value for Metadata.JobId
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Metadata.Created
     *
     * @return the value of Metadata.Created
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Metadata.Created
     *
     * @param created the value for Metadata.Created
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Metadata.Modified
     *
     * @return the value of Metadata.Modified
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Metadata.Modified
     *
     * @param modified the value for Metadata.Modified
     *
     * @mbggenerated Wed Jan 18 12:46:26 PST 2012
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }
}