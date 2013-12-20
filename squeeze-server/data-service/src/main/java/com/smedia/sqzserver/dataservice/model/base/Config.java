package com.smedia.sqzserver.dataservice.model.base;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Config {
	
	private String id = null;
	private String name = null;
	private String value = null;
	
	public Config() {
		
	}
	
	@XmlElement
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	//@XmlElement
	public String getName() {
		return name;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	
	//@XmlElement
	public String getValue() {
		return value;
	}
	
	@XmlElement
	public void setValue(String value) {
		this.value = value;
	}

}
