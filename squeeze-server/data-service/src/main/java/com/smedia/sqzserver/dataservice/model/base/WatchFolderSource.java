package com.smedia.sqzserver.dataservice.model.base;

import java.util.Date;

public class WatchFolderSource {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WatchFolderSources.SourceId
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    private String sourceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WatchFolderSources.WatchFolderId
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    private String watchFolderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WatchFolderSources.URI
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    private String URI;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WatchFolderSources.ThumbFileNamePattern
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    private String thumbFileNamePattern;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WatchFolderSources.ThumbURI
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    private String thumbURI;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WatchFolderSources.Created
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WatchFolderSources.Modified
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    private Date modified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WatchFolderSources.Name
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WatchFolderSources.FileNamingMethod
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    private String fileNamingMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column WatchFolderSources.ExtensionNamingMethod
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    private String extensionNamingMethod;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WatchFolderSources.SourceId
     *
     * @return the value of WatchFolderSources.SourceId
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WatchFolderSources.SourceId
     *
     * @param sourceId the value for WatchFolderSources.SourceId
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WatchFolderSources.WatchFolderId
     *
     * @return the value of WatchFolderSources.WatchFolderId
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public String getWatchFolderId() {
        return watchFolderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WatchFolderSources.WatchFolderId
     *
     * @param watchFolderId the value for WatchFolderSources.WatchFolderId
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public void setWatchFolderId(String watchFolderId) {
        this.watchFolderId = watchFolderId == null ? null : watchFolderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WatchFolderSources.URI
     *
     * @return the value of WatchFolderSources.URI
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public String getURI() {
        return URI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WatchFolderSources.URI
     *
     * @param URI the value for WatchFolderSources.URI
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public void setURI(String URI) {
        this.URI = URI == null ? null : URI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WatchFolderSources.ThumbFileNamePattern
     *
     * @return the value of WatchFolderSources.ThumbFileNamePattern
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public String getThumbFileNamePattern() {
        return thumbFileNamePattern;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WatchFolderSources.ThumbFileNamePattern
     *
     * @param thumbFileNamePattern the value for WatchFolderSources.ThumbFileNamePattern
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public void setThumbFileNamePattern(String thumbFileNamePattern) {
        this.thumbFileNamePattern = thumbFileNamePattern == null ? null : thumbFileNamePattern.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WatchFolderSources.ThumbURI
     *
     * @return the value of WatchFolderSources.ThumbURI
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public String getThumbURI() {
        return thumbURI;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WatchFolderSources.ThumbURI
     *
     * @param thumbURI the value for WatchFolderSources.ThumbURI
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public void setThumbURI(String thumbURI) {
        this.thumbURI = thumbURI == null ? null : thumbURI.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WatchFolderSources.Created
     *
     * @return the value of WatchFolderSources.Created
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WatchFolderSources.Created
     *
     * @param created the value for WatchFolderSources.Created
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WatchFolderSources.Modified
     *
     * @return the value of WatchFolderSources.Modified
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WatchFolderSources.Modified
     *
     * @param modified the value for WatchFolderSources.Modified
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WatchFolderSources.Name
     *
     * @return the value of WatchFolderSources.Name
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WatchFolderSources.Name
     *
     * @param name the value for WatchFolderSources.Name
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WatchFolderSources.FileNamingMethod
     *
     * @return the value of WatchFolderSources.FileNamingMethod
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public String getFileNamingMethod() {
        return fileNamingMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WatchFolderSources.FileNamingMethod
     *
     * @param fileNamingMethod the value for WatchFolderSources.FileNamingMethod
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public void setFileNamingMethod(String fileNamingMethod) {
        this.fileNamingMethod = fileNamingMethod == null ? null : fileNamingMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column WatchFolderSources.ExtensionNamingMethod
     *
     * @return the value of WatchFolderSources.ExtensionNamingMethod
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public String getExtensionNamingMethod() {
        return extensionNamingMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column WatchFolderSources.ExtensionNamingMethod
     *
     * @param extensionNamingMethod the value for WatchFolderSources.ExtensionNamingMethod
     *
     * @mbggenerated Sat Mar 10 16:01:36 PST 2012
     */
    public void setExtensionNamingMethod(String extensionNamingMethod) {
        this.extensionNamingMethod = extensionNamingMethod == null ? null : extensionNamingMethod.trim();
    }
}