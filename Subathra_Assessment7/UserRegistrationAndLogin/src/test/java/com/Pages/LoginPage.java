package com.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	BasePage basePage;
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath="//input[@data-qa='login-email']")
	public WebElement email;
	
	@FindBy (xpath="//input[@name=\"password\"]")
	public WebElement password;
	
	@FindBy (xpath="//button[text()='Login']")
	public WebElement loginButton;
	
	@FindBy (xpath="//a[text()=' Logout']")
	public WebElement logout;
	
	@FindBy (xpath="//p[text()='Your email or password is incorrect!']")
	public WebElement invalid;
	
	
	
	public void login(String log_email,String log_pass) {
		
		basePage = new BasePage(driver);
		
		basePage.clickSignupOrLogin();
	
		wait.until(ExpectedConditions.visibilityOf(email));
		
		email.sendKeys(log_email);
		password.sendKeys(log_pass);
		loginButton.click();
	
	}
	
	public String getText() {
		
		wait.until(ExpectedConditions.visibilityOf(logout));
		return logout.getText();
	}
	
	
	public String getInvalidMessage() {
		
		return invalid.getText();
	}
	
	

}
