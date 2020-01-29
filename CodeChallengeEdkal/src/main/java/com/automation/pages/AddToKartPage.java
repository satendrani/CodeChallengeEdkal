package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToKartPage extends BasePage{

	public int findBestSellerMatch(WebDriver driver, String string) {
		int size = driver.findElements(By.xpath(getReference("SearchResult.bestSeller"))).size();
		System.out.println("Best Seller Found:" + size);
		return size;
	}
	
	public void clickOnAddToCartButton(WebDriver driver) {
		driver.findElement(By.xpath(getReference("ResultPage.addToCartButton"))).click();
		System.out.println("clicked on Add to Cart");
	}
	
	public void clickOnProductLink(String xpathLink, WebDriver driver) {
		System.out.println("xpath: "+xpathLink);
		driver.findElement(By.xpath(xpathLink)).click();
		System.out.println("clicked on product link.");
	}
}
