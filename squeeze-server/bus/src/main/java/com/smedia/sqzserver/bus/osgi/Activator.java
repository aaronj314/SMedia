package com.smedia.sqzserver.bus.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Starting Squeeze Server Bus");
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	

	}

}
