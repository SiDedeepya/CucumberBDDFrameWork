package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class DataDrivenWithExample {

	WebDriver driver;

	@Given("^User is present on login page$")
	public void user_is_present_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Manojkumar\\\\Downloads\\\\chromedriver_win32_Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@SuppressWarnings("deprecation")
	@When("^Title of login page is Facebookk$")
	public void title_of_login_page_is_Facebookk() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Facebook – log in or sign up", title);

	}

	@Then("^User enters \"(.*)\" and enters \"(.*)\"$")
	public void user_enter_and_enters(String Username, String Password) {
		driver.findElement(By.id("email")).sendKeys(Username);// Data Driven approach
		driver.findElement(By.id("pass")).sendKeys(Password); // Data Driven approach
	}

	@Then("^User clicks on Login button$")
	public void user_clicks_on_Login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("^User is on Homepage #Validation$")
	public void user_is_on_Homepage_Validation() {
		String HomeTitle = driver.getTitle();
		System.out.println(HomeTitle);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Assert.assertEquals("Facebook – log in or sign up", HomeTitle);
	}
}
