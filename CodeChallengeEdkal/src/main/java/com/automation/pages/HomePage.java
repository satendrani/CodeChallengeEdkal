package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	
	public WebDriver searchItem(WebDriver driver, String product_search_name) {

		driver.findElement(By.xpath(getReference("HomePage.searchTextBox"))).click();
		driver.findElement(By.xpath(getReference("HomePage.searchTextBox"))).sendKeys(product_search_name);
		driver.findElement(By.xpath(getReference("HomePage.submit"))).click();
		System.out.println("check homepage is loaded or not");
		
		return driver;
	}

}
