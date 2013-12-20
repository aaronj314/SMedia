package com.smedia.sqzserver.dataservice.model;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.smedia.sqzserver.dataservice.model.base.Destination;
import com.smedia.sqzserver.dataservice.model.base.Job;
import com.smedia.sqzserver.dataservice.model.base.JobOutput;
import com.smedia.sqzserver.dataservice.model.base.JobPreset;
import com.smedia.sqzserver.dataservice.model.base.Source;

@XmlRootElement
public class JobDetails extends Job {
	// transient 
	// High(0) Med(4) Low(9)
	private int priority;
	
	// transient
	// JOB TAG NAME
	private String jobTagName;
	
	// transient
	private Map<String,String> attributes;
	
	// transient
	private  Map<String,String> phaseEventHandlers;
	
	// transient
	private String encodeURL;
	
	private String statusState;
	
	
	public JobDetails() {
		priority = 4;
		/*
		attributes = new HashMap<String, String>();
		attributes.put("key1", "value1");
		attributes.put("key2", "value2");
		
		phaseEventHandlers = new HashMap<String, String>();
		phaseEventHandlers.put("key1", "value1");
		phaseEventHandlers.put("key2", "value2");
		*/
	}
	
	private JobPreset jobPreset;
	
	
	private Source source;
	
	
	private List<Destination> destinations;
	
	
	private JobOutput jobOutput;

	
	
	public String getJobTagName() {
		return jobTagName;
	}

	public void setJobTagName(String jobTagName) {
		this.jobTagName = jobTagName;
	}

	public String getStatusState() {
		return statusState;
	}

	public void setStatusState(String statusState) {
		this.statusState = statusState;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public Map<String, String> getPhaseEventHandlers() {
		return phaseEventHandlers;
	}

	public void setPhaseEventHandlers(Map<String, String> phaseEventHandlers) {
		this.phaseEventHandlers = phaseEventHandlers;
	}

	public JobPreset getJobPreset() {
		return jobPreset;
	}

	public void setJobPreset(JobPreset jobPreset) {
		this.jobPreset = jobPreset;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public List<Destination> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}

	public JobOutput getJobOutput() {
		return jobOutput;
	}

	public void setJobOutput(JobOutput jobOutput) {
		this.jobOutput = jobOutput;
	}

	public String getEncodeURL() {
		return encodeURL;
	}

	public void setEncodeURL(String encodeURL) {
		this.encodeURL = encodeURL;
	}

	
}
