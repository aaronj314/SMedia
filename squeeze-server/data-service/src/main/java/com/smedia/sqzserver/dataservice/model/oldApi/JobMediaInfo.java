package com.smedia.sqzserver.dataservice.model.oldApi;

import javax.xml.bind.annotation.XmlElement;

public class JobMediaInfo {
	
	private CompressionPresetList presetList = null;
	private DestinationList destinationList = null;
	private SourceMedia sourceMedia = null;
	
	public JobMediaInfo() {

	}

	@XmlElement(name="CompressionPresetList")
	public CompressionPresetList getPresetList() {
		return presetList;
	}

	@XmlElement(name="DestinationList")
	public DestinationList getDestinationList() {
		return destinationList;
	}
	
	@XmlElement(name="SourceMedia")
	public SourceMedia getSourceMedia() {
		return sourceMedia;
	}
	
	public void setPresetList(CompressionPresetList presetList) {
		this.presetList = presetList;
	}

	public void setDestinationList(DestinationList destinationList) {
		this.destinationList = destinationList;
	}

	

	public void setSourceMedia(SourceMedia sourceMedia) {
		this.sourceMedia = sourceMedia;
	}
	
	

}
