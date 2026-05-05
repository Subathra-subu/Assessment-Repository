package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Pages.LoginPage;
import com.Pages.RegisterPage;


public class BaseTest {
	
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	RegisterPage register_Page;
	LoginPage login_Page;
	
//	public WebDriver driver;
	
	public WebDriver get_Driver() {
		return driver.get();
	}
 
  @BeforeMethod
  public void before() {
	  
	  WebDriver driver1 = new ChromeDriver();
	  driver.set(driver1);
	  
	  driver1.get("https://automationexercise.com/");
	  
	  driver1.manage().window().maximize();
	  
	  register_Page = new RegisterPage(driver1);
	  login_Page = new LoginPage(driver1);
  }
  
  
  @AfterMethod
  public void after() {
	  
	  WebDriver driver1 = driver.get();
	  
	  if(driver1!=null) {
		  driver1.quit();
	  }
  }
}
