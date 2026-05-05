package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	
	
	@FindBy (xpath="//a[contains(text(),'Signup')]")
	public WebElement SignupOrLogin;
	
	
	public void clickSignupOrLogin() {
		SignupOrLogin.click();
	}

}
