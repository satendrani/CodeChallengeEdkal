package com.automation.stepdefinitions;

import com.automation.utils.ConfigFileReader;

public class BaseStepDefinitions {

	String projectPath = System.getProperty("user.dir");
	private final String propertyFilePath = projectPath + "\\configs\\config.properties";
	
	ConfigFileReader config = new ConfigFileReader(propertyFilePath);
	
	String getFilePath(String fileName) {
		return config.getProperty(fileName);
	}
		
	private final String propertyXpathFilePath = projectPath + "\\src\\test\\resources\\objectRepository\\productsearch.properties";
	ConfigFileReader configXpath = new ConfigFileReader(propertyXpathFilePath);
	
	String getReference(String refernece) {
		return configXpath.getProperty(refernece);
	}
}
