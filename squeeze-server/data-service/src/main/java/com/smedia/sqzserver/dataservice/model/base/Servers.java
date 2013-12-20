package com.smedia.sqzserver.dataservice.model.base;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Servers {
	
	public Servers(){
		
	}
	
	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.ServerId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String serverId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.ImageId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String imageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.InstanceId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String instanceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.PublicName
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String publicName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.PublicIp
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String publicIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.PrivateName
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String privateName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.PrivateIp
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String privateIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.LastPingTime
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private Date lastPingTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.CommandId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private Integer commandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.ServerStateId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private Integer serverStateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.CommandTime
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private Date commandTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.StateChangeTime
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private Date stateChangeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.WebHostName
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String webHostName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.DateCreated
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.MachineType
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String machineType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.Processors
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private Integer processors;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.OSVersion
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String OSVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.WebServiceHost
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String webServiceHost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.ProductVersion
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String productVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.ManagementCredentialId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String managementCredentialId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.Modified
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private Date modified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.Comments
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Servers.CompressorVersion
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    private String compressorVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.ServerId
     *
     * @return the value of Servers.ServerId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.ServerId
     *
     * @param serverId the value for Servers.ServerId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setServerId(String serverId) {
        this.serverId = serverId == null ? null : serverId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.ImageId
     *
     * @return the value of Servers.ImageId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.ImageId
     *
     * @param imageId the value for Servers.ImageId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setImageId(String imageId) {
        this.imageId = imageId == null ? null : imageId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.InstanceId
     *
     * @return the value of Servers.InstanceId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.InstanceId
     *
     * @param instanceId the value for Servers.InstanceId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId == null ? null : instanceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.PublicName
     *
     * @return the value of Servers.PublicName
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getPublicName() {
        return publicName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.PublicName
     *
     * @param publicName the value for Servers.PublicName
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setPublicName(String publicName) {
        this.publicName = publicName == null ? null : publicName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.PublicIp
     *
     * @return the value of Servers.PublicIp
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.PublicIp
     *
     * @param publicIp the value for Servers.PublicIp
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp == null ? null : publicIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.PrivateName
     *
     * @return the value of Servers.PrivateName
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getPrivateName() {
        return privateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.PrivateName
     *
     * @param privateName the value for Servers.PrivateName
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setPrivateName(String privateName) {
        this.privateName = privateName == null ? null : privateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.PrivateIp
     *
     * @return the value of Servers.PrivateIp
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.PrivateIp
     *
     * @param privateIp the value for Servers.PrivateIp
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp == null ? null : privateIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.LastPingTime
     *
     * @return the value of Servers.LastPingTime
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public Date getLastPingTime() {
        return lastPingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.LastPingTime
     *
     * @param lastPingTime the value for Servers.LastPingTime
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setLastPingTime(Date lastPingTime) {
        this.lastPingTime = lastPingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.CommandId
     *
     * @return the value of Servers.CommandId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public Integer getCommandId() {
        return commandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.CommandId
     *
     * @param commandId the value for Servers.CommandId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.ServerStateId
     *
     * @return the value of Servers.ServerStateId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public Integer getServerStateId() {
        return serverStateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.ServerStateId
     *
     * @param serverStateId the value for Servers.ServerStateId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setServerStateId(Integer serverStateId) {
        this.serverStateId = serverStateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.CommandTime
     *
     * @return the value of Servers.CommandTime
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public Date getCommandTime() {
        return commandTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.CommandTime
     *
     * @param commandTime the value for Servers.CommandTime
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setCommandTime(Date commandTime) {
        this.commandTime = commandTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.StateChangeTime
     *
     * @return the value of Servers.StateChangeTime
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public Date getStateChangeTime() {
        return stateChangeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.StateChangeTime
     *
     * @param stateChangeTime the value for Servers.StateChangeTime
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setStateChangeTime(Date stateChangeTime) {
        this.stateChangeTime = stateChangeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.WebHostName
     *
     * @return the value of Servers.WebHostName
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getWebHostName() {
        return webHostName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.WebHostName
     *
     * @param webHostName the value for Servers.WebHostName
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setWebHostName(String webHostName) {
        this.webHostName = webHostName == null ? null : webHostName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.DateCreated
     *
     * @return the value of Servers.DateCreated
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.DateCreated
     *
     * @param dateCreated the value for Servers.DateCreated
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.MachineType
     *
     * @return the value of Servers.MachineType
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getMachineType() {
        return machineType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.MachineType
     *
     * @param machineType the value for Servers.MachineType
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setMachineType(String machineType) {
        this.machineType = machineType == null ? null : machineType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.Processors
     *
     * @return the value of Servers.Processors
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public Integer getProcessors() {
        return processors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.Processors
     *
     * @param processors the value for Servers.Processors
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setProcessors(Integer processors) {
        this.processors = processors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.OSVersion
     *
     * @return the value of Servers.OSVersion
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getOSVersion() {
        return OSVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.OSVersion
     *
     * @param OSVersion the value for Servers.OSVersion
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion == null ? null : OSVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.WebServiceHost
     *
     * @return the value of Servers.WebServiceHost
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getWebServiceHost() {
        return webServiceHost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.WebServiceHost
     *
     * @param webServiceHost the value for Servers.WebServiceHost
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setWebServiceHost(String webServiceHost) {
        this.webServiceHost = webServiceHost == null ? null : webServiceHost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.ProductVersion
     *
     * @return the value of Servers.ProductVersion
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getProductVersion() {
        return productVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.ProductVersion
     *
     * @param productVersion the value for Servers.ProductVersion
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion == null ? null : productVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.ManagementCredentialId
     *
     * @return the value of Servers.ManagementCredentialId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getManagementCredentialId() {
        return managementCredentialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.ManagementCredentialId
     *
     * @param managementCredentialId the value for Servers.ManagementCredentialId
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setManagementCredentialId(String managementCredentialId) {
        this.managementCredentialId = managementCredentialId == null ? null : managementCredentialId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.Modified
     *
     * @return the value of Servers.Modified
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.Modified
     *
     * @param modified the value for Servers.Modified
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.Comments
     *
     * @return the value of Servers.Comments
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.Comments
     *
     * @param comments the value for Servers.Comments
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Servers.CompressorVersion
     *
     * @return the value of Servers.CompressorVersion
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public String getCompressorVersion() {
        return compressorVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Servers.CompressorVersion
     *
     * @param compressorVersion the value for Servers.CompressorVersion
     *
     * @mbggenerated Fri Feb 10 14:15:10 MST 2012
     */
    public void setCompressorVersion(String compressorVersion) {
        this.compressorVersion = compressorVersion == null ? null : compressorVersion.trim();
    }
}