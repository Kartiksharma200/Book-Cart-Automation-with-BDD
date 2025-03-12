package com.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\resources\\AllFeaturesfile\\login.feature",
		"src/test/resources/AllFeaturesfile/AddToCart.feature"},
		glue = {"com.stepDefinition"})
public class TestRunnerForCucumber extends AbstractTestNGCucumberTests{

}
