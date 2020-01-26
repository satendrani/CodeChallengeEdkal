package com.automation.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.automation.driver.DriverConf;
import com.automation.pages.AddToKartPage;
import com.automation.pages.HomePage;

public class SearchProductStepDef extends BaseStepDefinitions {

	private WebDriver driver;

	DriverConf common = new DriverConf();
	HomePage homePage = new HomePage();
	AddToKartPage addToCartPage = new AddToKartPage();

	@Given("^Open browser and luanch the website$")
	public void Open_browser_and_luanch_the_website() throws Throwable {

		driver = common.luanchBrowser("firefox");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		common.luanchWebsite(driver, "https://www.amazon.com/");

	}

	
	@When("^Enter the text Headphones in the search box Hit enter$")
	public void Enter_the_text_Headphones_in_the_search_box_Hit_enter() throws Throwable {
		homePage.searchItem(driver, "Headphones");
	}

	@Then("^From the results displayed on page add all the items marked as Best seller to the cart$")
	public void From_the_results_displayed_on_page1_add_all_the_items_marked_as_Best_seller_to_the_cart()
			throws Throwable {
		
		int sizeOfBestSeller = addToCartPage.findBestSellerMatch(driver, "BestSeller");

//		for(int i=0; i<sizeOfBestSeller; i++) {
			addToCartPage.clickOnProductLink(driver);
			addToCartPage.clickOnAddToCartButton(driver);
			backToResultPage();
//			scrollToElement();
//		}
	}

	
	// Re-usable methods
	private void scrollToElement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,400)");
		System.out.println("scrolling screen");
	}

	private void backToResultPage() {
		driver.navigate().back();
		driver.navigate().back();
	}

}