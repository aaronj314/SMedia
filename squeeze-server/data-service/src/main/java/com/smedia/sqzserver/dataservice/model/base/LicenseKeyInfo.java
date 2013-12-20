package com.smedia.sqzserver.dataservice.model.base;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LicenseKeyInfo {
	
	private String id = null;
	private String licenseKey = null;
	private int maxNodeCount = -1;
	private boolean isTrialVersion = true;
	private boolean isValid = false;
	
	public LicenseKeyInfo() {
		
	}
	
	public boolean isValid() {
		return isValid;
	}

	@XmlElement
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public String getId() {
		return id;
	}

	@XmlElement
	public void setId(String id) {
		this.id = id;
	}

	public String getLicenseKey() {
		return licenseKey;
	}

	@XmlElement
	public void setLicenseKey(String key) {
		this.licenseKey = key;
	}

	public int getMaxNodeCount() {
		return maxNodeCount;
	}

	@XmlElement
	public void setMaxNodeCount(int maxNodeCount) {
		this.maxNodeCount = maxNodeCount;
	}

	public boolean isTrialVersion() {
		return isTrialVersion;
	}

	@XmlElement
	public void setTrialVersion(boolean isTrialVersion) {
		this.isTrialVersion = isTrialVersion;
	}

}
