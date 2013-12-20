package com.smedia.sqzserver.common.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigService {
	private static final String PROP_FILE_NAME = "com.smedia.sqzserver.properties";
	private static String karafHome;
	private static String propertiesFilePath;

	static private boolean checkedOS = false;
	static private boolean windowsOS;
	static private boolean macOS;
	static private boolean intelArch;
	static private boolean quickTime;
	static private boolean directShow;
	static private boolean linuxOS;
	private static String os = "";
	private static boolean validLicense = false;

	private static Properties properties;

	static {
		karafHome = System.getProperty("karaf.home");
		propertiesFilePath = karafHome + File.separator + "etc" + File.separator + PROP_FILE_NAME;

		properties = new Properties();

		try {
			FileInputStream fin = new FileInputStream(propertiesFilePath);
			properties.load(fin);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected ConfigService() {
		/*
		karafHome = System.getProperty("karaf.home");
		propertiesFilePath = karafHome + File.separator + "etc" + File.separator + PROP_FILE_NAME;

		properties = new Properties();

		try {
			FileInputStream fin = new FileInputStream(propertiesFilePath);
			properties.load(fin);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/
	}
	
	public static void setHaveValidLicense(boolean valid) {
		validLicense = valid;
	}
	
	public static boolean haveValidLicense() {
		return validLicense;
	}

	public static String getOS() {
		return os;
	}

	private static synchronized void checkOSFlags() {
		if (!checkedOS) {
			os = System.getProperty("os.name");

			macOS = (os.indexOf("Mac") >= 0);

			windowsOS = (os.indexOf("Windows") >= 0);

			linuxOS = (os.indexOf("linux") >= 0);

			System.out.println("OS: " + os + " --- Version: " + System.getProperty("os.version"));

			String osArch = System.getProperty("os.arch");

			intelArch = (osArch.indexOf("x86") >= 0) || (osArch.indexOf("i386") >= 0);

			checkedOS = true;

			if (windowsOS) {
				// On windows, we can use QuickTime or DirectShow. The QuickTime
				// option
				// is for developer testing only
				String s = System.getProperty("useQuickTime");
				if (s != null && s.equalsIgnoreCase("true")) {
					quickTime = true;
					directShow = false;
				} else {
					quickTime = false;
					directShow = true;
				}
			} else {
				quickTime = true;
				directShow = false;
			}
		}
	}

	public static String getProperty(String name) {
		
		String value = properties.getProperty(name);
		if(value == null) {
			if( name.endsWith("concurrentConsumers") || name.endsWith("maxConcurrentConsumers")) {
				return "1";
			} else if( name.endsWith("mgr.hostname")) {
				return "localhost";
			} else if(name.equalsIgnoreCase("node.job.tag.name")) {
				// just in case later someone needs a default or things it worth while
				return null;
			}
		}
		return value;
	}

	public static Properties getConfig() {
		return properties;
	}

	
	public static void saveConfigProp(String name, String value) {
		// TODO Auto-generated method stub

	}


	public static boolean isMac() {
		if (!checkedOS) {
			checkOSFlags();
		}

		return macOS;
	}

	public static boolean isWindows() {
		if (!checkedOS) {
			checkOSFlags();
		}

		return windowsOS;
	}

	
	public static boolean isLinux() {
		if (!checkedOS) {
			checkOSFlags();
		}

		return linuxOS;
	}
}
