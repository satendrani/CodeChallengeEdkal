package com.automation.pages;

import com.automation.utils.ConfigFileReader;

public class BasePage {

	String projectPath = System.getProperty("user.dir");
	private final String propertyXpathFilePath = projectPath + "\\src\\test\\resources\\objectRepository\\productsearch.properties";
	ConfigFileReader configXpath = new ConfigFileReader(propertyXpathFilePath);
	
	
	public String getReference(String refernece) {
		return configXpath.getProperty(refernece);
	}
}
