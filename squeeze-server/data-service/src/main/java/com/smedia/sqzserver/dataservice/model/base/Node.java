package com.smedia.sqzserver.dataservice.model.base;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
public class Node implements Serializable {
	
	private String uuid;
	private String name;
	private String hostname;
	private String version;
	private String replyQueue;
	private String requestQueue;
	private Date lastPinged;
	private String lastJobId;
	private float cpu;
	private String engineVersion;
	private String ipAddress;
	private String osArch;
	private String osName;
	private String osVersion;
	private String userName;
	
	public Node() {
		uuid = UUID.randomUUID().toString();
	}
	
	public String getIpAddress() {
		return ipAddress;
	}
	
	public void setIpAddress(String ip) {
		ipAddress = ip;
	}
	
	public String getEngineVersion() {
		return engineVersion;
	}
	
	@XmlElement
	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}
	
	public String getVersion() {
		return version;
	}
	
	@XmlElement
	public void setVersion(String version) {
		this.version = version;
	}
	public String getUuid() {
		return uuid;
	}
	
	@XmlElement
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Date getLastPinged() {
		return lastPinged;
	}
	
	@XmlElement
	public void setLastPinged(Date lastPinged) {
		this.lastPinged = lastPinged;
	}
	public String getLastJobId() {
		return lastJobId;
	}
	
	@XmlElement
	public void setLastJobId(String lastJobId) {
		this.lastJobId = lastJobId;
	}
	public float getCpu() {
		return cpu;
	}
	
	@XmlElement
	public void setCpu(float cpu) {
		this.cpu = cpu;
	}
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getHostname() {
		return hostname;
	}
	
	@XmlElement
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	@XmlElement
	public void setOsArch(String arch) {
		this.osArch = arch;
	}

	@XmlElement
	public void setOsName(String osn) {
		this.osName = osn;
	}

	@XmlElement
	public void setOsVersion(String v) {
		this.osVersion = v;
	}

	@XmlElement
	public void setUserName(String u) {
		this.userName = u;
	}

	public String getOsArch() {
		return osArch;
	}

	public String getOsName() {
		return osName;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public String getUserName() {
		return userName;
	}
	
}
