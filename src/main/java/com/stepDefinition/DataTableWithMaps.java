package com.stepDefinition;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataTableWithMaps {
	
	WebDriver driver;
	@Given("^Launch the URL$")
	public void launch_the_url() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Manojkumar\\\\Downloads\\\\chromedriver_win32_Driver\\\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	@Given("^Username and Password$")
	public void username_and_Password(DataTable credentials){
	    for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
	    	 driver.findElement(By.id("email")).sendKeys(data.get("username"));// Data Driven approach
	 		driver.findElement(By.id("pass")).sendKeys(data.get("password"));
	    }
	    
	}

	@Then("^Click on submit$")
	public void click_on_submit() {
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
