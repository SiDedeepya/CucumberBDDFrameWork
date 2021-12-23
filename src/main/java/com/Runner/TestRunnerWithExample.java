//TestRunner with Example
package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:\\Selenium\\Projects\\CucumberBDDFramework\\src\\main\\java\\com\\Features\\withExampleKeyword.feature",//path of feature file 
		glue= {"com.stepDefinition.TestRunnerWithExample"},//path of stepDefinition
		format= {"pretty","html:test-output","json:json_output/json.output","junit:junit_output/cucumber.xml"},// to generate different reports like html,json,junit whatever we want
		monochrome = true, //generate readable output in console-> If its True, it shows good o/p and if it false, it will not looks good
		strict = true, //It will check the test definition if any missing in stepDefinition file, but it will give an error what ever missing steps
		dryRun = false// if it is true, it will only check missing ones. Once all the methods are implemented/mapping correctly. Make it false to run Test cases
		)
public class TestRunnerWithExample {

}
