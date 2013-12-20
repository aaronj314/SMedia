package com.smedia.sqzserver.dataservice.model.oldApi;

import javax.xml.bind.annotation.XmlElement;

public class CompressionPreset {
	
	private String jobPresetId = null;
	private String presetId = null;
	private String presetXmlData = null;
	private String uriLocation = null;
	
	public CompressionPreset() {
		
	}
	

	//<JobPresetId>1627aea5-8e0a-4371-9022-9b504344e724</JobPresetId>
    //<PresetId>1627aea5-8e0a-4371-9022-9b504344e724</PresetId>
    //<PresetXmlBase64Data>String content</PresetXmlBase64Data>
    //<UriLocation>String content</UriLocation>

	@XmlElement(name="JobPresetId")
	public String getJobPresetId() {
		return jobPresetId;
	}

	public void setJobPresetId(String jobPresetId) {
		this.jobPresetId = jobPresetId;
	}

	@XmlElement(name="PresetId")
	public String getPresetId() {
		return presetId;
	}

	public void setPresetId(String presetId) {
		this.presetId = presetId;
	}

	@XmlElement(name="PresetXmlBase64Data")
	public String getPresetXmlData() {
		return presetXmlData;
	}

	public void setPresetXmlData(String presetXmlData) {
		this.presetXmlData = presetXmlData;
	}

	@XmlElement(name="UriLocation")
	public String getUriLocation() {
		return uriLocation;
	}

	public void setUriLocation(String uriLocation) {
		this.uriLocation = uriLocation;
	}
	

}
