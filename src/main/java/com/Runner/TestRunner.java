package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "F:\\Selenium\\Projects\\CucumberBDDFramework\\src\\main\\java\\com\\Features\\LoginMaps.feature",
		glue = {"com.stepDefinition"},
		plugin= {"pretty","html:test-output"},
		monochrome = true,
		strict = true,
		dryRun = false,
		tags ={"@RegressionTest, @SmokeTest"}
		)
public class TestRunner {

	
}
