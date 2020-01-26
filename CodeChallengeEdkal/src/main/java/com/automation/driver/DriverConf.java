package com.automation.driver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverConf {

	String projectPath = System.getProperty("user.dir");
	File file;
	WebDriver driver;
	
	public WebDriver luanchBrowser(String driverName) {

		System.out.println("Open browser : " + driverName);

		if (driverName.equalsIgnoreCase("firefox")) {
			file = new File(projectPath + "\\src\\main\\resources\\geckodriver.exe");
			System.out.println("gecko driver path URL: " + file.getAbsolutePath());
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			driver = new FirefoxDriver();
		} else if (driverName.equalsIgnoreCase("chrome")) {
			file = new File(projectPath + "\\src\\main\\resources\\chromedriver.exe");
			System.out.println("chrome driver path URL: " + file.getAbsolutePath());
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();
		} else if (driverName.equalsIgnoreCase("IE")) {
			file = new File(projectPath + "\\src\\main\\resources\\geckodriver.exe");
			System.out.println("IE driver path URL: " + file.getAbsolutePath());
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

	public WebDriver luanchWebsite(WebDriver driver, String url) {
		try {
			System.out.println("Website URL :" + url + " opening in the browser.. pls wait...");
			driver.get(url);
			System.out.println("Page Title is : " + driver.getTitle());
		} catch (WebDriverException e) {
			System.out.println("Exception caught.. when try to enter URL : internet error - page didn't opened:" + e);
		} catch(Exception q) {
			System.out.println("Exception caught.. :" + q);
		}
		return driver;
	}
}
