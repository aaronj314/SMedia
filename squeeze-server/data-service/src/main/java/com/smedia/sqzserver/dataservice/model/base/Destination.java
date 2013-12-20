package com.smedia.sqzserver.dataservice.model.base;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Destination {
	
	public Destination() {
		locationTypeId = 1;
	}
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.DestinationId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String destinationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.JobId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.LocationTypeId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private Integer locationTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.URI
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String URI;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.FileName
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.SSSBucket
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String SSSBucket;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.CredentialId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String credentialId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.UserName
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.Password
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.Salt
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.SSSThumbBucket
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String SSSThumbBucket;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.ThumbFileNamePattern
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String thumbFileNamePattern;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.ThumbURI
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String thumbURI;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.Created
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.Modified
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private Date modified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.FileNamingMethodId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private Integer fileNamingMethodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.DestinationName
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String destinationName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.FileNamingMethod
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String fileNamingMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.ExtensionNamingMethod
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String extensionNamingMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Destinations.WatchFolderId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    private String watchFolderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.DestinationId
     *
     * @return the value of Destinations.DestinationId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.DestinationId
     *
     * @param destinationId the value for Destinations.DestinationId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId == null ? null : destinationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.JobId
     *
     * @return the value of Destinations.JobId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.JobId
     *
     * @param jobId the value for Destinations.JobId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setJobId(String jobId) {
        this.jobId = jobId == null ? null : jobId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.LocationTypeId
     *
     * @return the value of Destinations.LocationTypeId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public Integer getLocationTypeId() {
        return locationTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.LocationTypeId
     *
     * @param locationTypeId the value for Destinations.LocationTypeId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setLocationTypeId(Integer locationTypeId) {
        this.locationTypeId = locationTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.URI
     *
     * @return the value of Destinations.URI
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getURI() {
        return URI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.URI
     *
     * @param URI the value for Destinations.URI
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setURI(String URI) {
        this.URI = URI == null ? null : URI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.FileName
     *
     * @return the value of Destinations.FileName
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.FileName
     *
     * @param fileName the value for Destinations.FileName
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.SSSBucket
     *
     * @return the value of Destinations.SSSBucket
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getSSSBucket() {
        return SSSBucket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.SSSBucket
     *
     * @param SSSBucket the value for Destinations.SSSBucket
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setSSSBucket(String SSSBucket) {
        this.SSSBucket = SSSBucket == null ? null : SSSBucket.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.CredentialId
     *
     * @return the value of Destinations.CredentialId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getCredentialId() {
        return credentialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.CredentialId
     *
     * @param credentialId the value for Destinations.CredentialId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setCredentialId(String credentialId) {
        this.credentialId = credentialId == null ? null : credentialId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.UserName
     *
     * @return the value of Destinations.UserName
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.UserName
     *
     * @param userName the value for Destinations.UserName
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.Password
     *
     * @return the value of Destinations.Password
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.Password
     *
     * @param password the value for Destinations.Password
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.Salt
     *
     * @return the value of Destinations.Salt
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.Salt
     *
     * @param salt the value for Destinations.Salt
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.SSSThumbBucket
     *
     * @return the value of Destinations.SSSThumbBucket
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getSSSThumbBucket() {
        return SSSThumbBucket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.SSSThumbBucket
     *
     * @param SSSThumbBucket the value for Destinations.SSSThumbBucket
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setSSSThumbBucket(String SSSThumbBucket) {
        this.SSSThumbBucket = SSSThumbBucket == null ? null : SSSThumbBucket.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.ThumbFileNamePattern
     *
     * @return the value of Destinations.ThumbFileNamePattern
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getThumbFileNamePattern() {
        return thumbFileNamePattern;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.ThumbFileNamePattern
     *
     * @param thumbFileNamePattern the value for Destinations.ThumbFileNamePattern
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setThumbFileNamePattern(String thumbFileNamePattern) {
        this.thumbFileNamePattern = thumbFileNamePattern == null ? null : thumbFileNamePattern.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.ThumbURI
     *
     * @return the value of Destinations.ThumbURI
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getThumbURI() {
        return thumbURI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.ThumbURI
     *
     * @param thumbURI the value for Destinations.ThumbURI
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setThumbURI(String thumbURI) {
        this.thumbURI = thumbURI == null ? null : thumbURI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.Created
     *
     * @return the value of Destinations.Created
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.Created
     *
     * @param created the value for Destinations.Created
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.Modified
     *
     * @return the value of Destinations.Modified
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.Modified
     *
     * @param modified the value for Destinations.Modified
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.FileNamingMethodId
     *
     * @return the value of Destinations.FileNamingMethodId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public Integer getFileNamingMethodId() {
        return fileNamingMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.FileNamingMethodId
     *
     * @param fileNamingMethodId the value for Destinations.FileNamingMethodId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setFileNamingMethodId(Integer fileNamingMethodId) {
        this.fileNamingMethodId = fileNamingMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.DestinationName
     *
     * @return the value of Destinations.DestinationName
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.DestinationName
     *
     * @param destinationName the value for Destinations.DestinationName
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName == null ? null : destinationName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.FileNamingMethod
     *
     * @return the value of Destinations.FileNamingMethod
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getFileNamingMethod() {
        return fileNamingMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.FileNamingMethod
     *
     * @param fileNamingMethod the value for Destinations.FileNamingMethod
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setFileNamingMethod(String fileNamingMethod) {
        this.fileNamingMethod = fileNamingMethod == null ? null : fileNamingMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.ExtensionNamingMethod
     *
     * @return the value of Destinations.ExtensionNamingMethod
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getExtensionNamingMethod() {
        return extensionNamingMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.ExtensionNamingMethod
     *
     * @param extensionNamingMethod the value for Destinations.ExtensionNamingMethod
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setExtensionNamingMethod(String extensionNamingMethod) {
        this.extensionNamingMethod = extensionNamingMethod == null ? null : extensionNamingMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Destinations.WatchFolderId
     *
     * @return the value of Destinations.WatchFolderId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public String getWatchFolderId() {
        return watchFolderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Destinations.WatchFolderId
     *
     * @param watchFolderId the value for Destinations.WatchFolderId
     *
     * @mbggenerated Sun Jan 01 09:09:58 PST 2012
     */
    public void setWatchFolderId(String watchFolderId) {
        this.watchFolderId = watchFolderId == null ? null : watchFolderId.trim();
    }
}