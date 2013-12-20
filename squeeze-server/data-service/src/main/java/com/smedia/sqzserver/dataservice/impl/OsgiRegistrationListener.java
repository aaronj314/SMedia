package com.smedia.sqzserver.dataservice.impl;

import java.util.Map;

import org.apache.log4j.Logger;

import com.smedia.sqzserver.dataservice.DataService;

public class OsgiRegistrationListener {
	private static Logger log = Logger.getLogger(OsgiRegistrationListener.class);
	
	public void serviceRegistered(DataService serviceInstance, Map<?, ?> serviceProperties) {
		log.info("DataService has registered with OSGi framework");
	}
	
	public void serviceUnegistered(DataService serviceInstance, Map<?, ?> serviceProperties) {
		log.info("DataService has UN-registered with OSGi framework");
	}
}
