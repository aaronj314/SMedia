package com.smedia.sqzserver.dataservice.model.base;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NodeList {
	
	private List<Node> nodes = null;
	
	public NodeList() {}
	
	@XmlElement
	public void setNodeList(List<Node> list) {
		nodes = list;
	}
	
	public List<Node> getNodeList() {
		return nodes;
	}

}
