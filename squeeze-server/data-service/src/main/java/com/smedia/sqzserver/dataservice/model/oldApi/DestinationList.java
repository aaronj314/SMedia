package com.smedia.sqzserver.dataservice.model.oldApi;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class DestinationList {
	
	private List<DestinationInfo> destList = null;
	
	public DestinationList() {
		
	}

	@XmlElement(name="DestinationInfo")
	public List<DestinationInfo> getDestList() {
		return destList;
	}

	public void setDestList(List<DestinationInfo> destList) {
		this.destList = destList;
	}
	

}
