package com.smedia.sqzserver.dataservice.model;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.ibatis.annotations.MapKey;

import com.smedia.sqzserver.dataservice.model.base.WatchFolder;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderDestination;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderPreset;
import com.smedia.sqzserver.dataservice.model.base.WatchFolderSource;
import com.smedia.sqzserver.dataservice.model.base.Preset;

@XmlRootElement
public class WatchFolderDetails extends WatchFolder {
	
	private WatchFolderPreset jobPreset;
	private Preset preset;
	private WatchFolderSource source;
	private	List<WatchFolderDestination> destinations;
	private Map<String, String> attributes;
	private Map<String, String> phaseListeners;


	public WatchFolderSource getSource() {
		return source;
	}


	public void setSource(WatchFolderSource source) {
		this.source = source;
	}


	public List<WatchFolderDestination> getDestinations() {
		return destinations;
	}


	public void setDestinations(List<WatchFolderDestination> destinations) {
		this.destinations = destinations;
	}


	public WatchFolderPreset getJobPreset() {
		return jobPreset;
	}


	public void setJobPreset(WatchFolderPreset jobPreset) {
		this.jobPreset = jobPreset;
	}

	
	public Preset getPreset() {
		return preset;
	}


	public void setPreset(Preset preset) {
		this.preset = preset;
	}

	
	@MapKey("Value")
	public Map<String, String> getAttributes() {
		return attributes;
	}
	
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	@MapKey("PhaseType")
	public Map<String, String> getPhaseListeners() {
		return phaseListeners;
	}

	public void setPhaseListeners(Map<String, String> phaseListeners) {
		this.phaseListeners = phaseListeners;
	}

	

}
