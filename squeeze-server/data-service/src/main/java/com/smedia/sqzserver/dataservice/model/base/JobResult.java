package com.smedia.sqzserver.dataservice.model.base;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JobResult {

	private String status = null;
	private String jobId = null;
	private String error = null;

	public JobResult() {

	}

	public String getStatus() {
		return status;
	}

	@XmlElement
	public void setStatus(String status) {
		this.status = status;
	}

	public String getJobId() {
		return jobId;
	}

	@XmlElement
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getError() {
		return error;
	}

	@XmlElement
	public void setError(String error) {
		this.error = error;
	}

}
