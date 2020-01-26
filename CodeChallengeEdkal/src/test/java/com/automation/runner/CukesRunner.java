package com.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumberHtmlReport" },

		features = { "src/test/resources/features" }, 
		glue = { "com.automation.stepdefinitions" }, 
		tags = { "@UI_Test" }
)

public class CukesRunner extends BaseRunner {

}