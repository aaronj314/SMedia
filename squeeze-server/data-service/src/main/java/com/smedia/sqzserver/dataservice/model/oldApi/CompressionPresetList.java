package com.smedia.sqzserver.dataservice.model.oldApi;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class CompressionPresetList {
	
	private List<CompressionPreset> presetList = null;
	
	public CompressionPresetList() {
		 
	}
	
	@XmlElement(name="CompressionPreset")
	public List<CompressionPreset> getPresetList() {
		return presetList;
	}

	public void setPresetList(List<CompressionPreset> presetList) {
		this.presetList = presetList;
	}

	

}
