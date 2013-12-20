package com.smedia.sqzserver.common.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		//System.out.println("start commom-sqz");
		
		//context.registerService(ConfigService.class.getName(), new ConfigServiceImpl(), new Hashtable());
		
		//System.out.println("hello commom-sqz");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
