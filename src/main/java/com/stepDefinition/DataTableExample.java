
  package com.stepDefinition;
  
  import java.util.List;
  
  import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver;
  
  import cucumber.api.DataTable; import cucumber.api.java.en.Given; import
  cucumber.api.java.en.Then;
  
  public class DataTableExample {
  
  WebDriver driver;
  
  @Given("^Launch the URL$") public void launch_the_url() {
  System.setProperty("webdriver.chrome.driver",
  "C:\\\\Users\\\\Manojkumar\\\\Downloads\\\\chromedriver_win32_Driver\\\\chromedriver.exe"
  ); driver =new ChromeDriver(); driver.get("https://www.facebook.com/"); }
  
  @Given("^Username and Password$") public void username_and_Password(DataTable
  credentials){ List<List<String>> list = credentials.raw();
  driver.findElement(By.id("email")).sendKeys(list.get(0).get(0));
  // Data Driven approach
  driver.findElement(By.id("pass")).sendKeys(list.get(0).get(1)); }
  
  @Then("^Click on submit$") public void click_on_submit() {
  driver.findElement(By.name("login")).click(); } }
 