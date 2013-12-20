package com.smedia.sqzserver.dataservice.model.base;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
	}

	public Config createConfig() {
		return new Config();
	}

	public Node createNode() {
		return new Node();
	}

	public NodeList createNodeList() {
		return new NodeList();
	}

	public JobResult createJobResult() {
		return new JobResult();
	}
	
	public LicenseKeyInfo createLicenseKeyInfo() {
		return new LicenseKeyInfo();
	}

}
