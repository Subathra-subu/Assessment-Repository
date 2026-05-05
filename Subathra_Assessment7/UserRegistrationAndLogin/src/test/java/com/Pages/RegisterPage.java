package com.Pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterPage extends BasePage{
	
	BasePage basePage;
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath="//input[@name='name']")
	public WebElement name;
	
	@FindBy (xpath="//input[@name='name']/following-sibling::input[1]")
	public WebElement email;
	
	@FindBy (xpath="//button[text()='Signup']")
	public WebElement signUp;
	
	@FindBy (css="#password")
	public WebElement password;
	
	@FindBy (css="#first_name")
	public WebElement firstName;
	
	@FindBy (css="#last_name")
	public WebElement lastName;
	
	@FindBy (css="#address1")
	public WebElement address;
	
	@FindBy (css="#state")
	public WebElement state;
	
	@FindBy (css="#city")
	public WebElement city;
	
	@FindBy (css="#zipcode")
	public WebElement zipCode;
	
	@FindBy (css="#mobile_number")
	public WebElement mobile;
	
	@FindBy(xpath="//button[text()='Create Account']")
	public WebElement submit;
	
	@FindBy (xpath="//b[text()='Account Created!']")
	public WebElement successMessage;
	
	@FindBy (xpath = "//p[text()='Email Address already exist!']")
	public WebElement errorMessage;
	
	
	
	
	
	public void register(String registername,String registeremail,String regpass,String regfirstName,String reglastName,String regaddress,String regstate,String regcity,String regzip,String regmobile) {
		
		basePage = new BasePage(driver);
		
		basePage.clickSignupOrLogin();
		
		name.sendKeys(registername);
		email.sendKeys(registeremail);
		signUp.click();
		
		wait.until(ExpectedConditions.visibilityOf(password));
		
		password.sendKeys(regpass);
		firstName.sendKeys(regfirstName);
		lastName.sendKeys(reglastName);
		address.sendKeys(regaddress);
		state.sendKeys(regstate);
		city.sendKeys(regcity);
		zipCode.sendKeys(regzip);
		mobile.sendKeys(regmobile);
		
		submit.click();

	}
	
	public String getSuccessMessage() {
		
		wait.until(ExpectedConditions.visibilityOf(successMessage));
		
		return successMessage.getText();
		
	}
	
	public void inValidregister(String regname,String mail) {
		
		
		basePage = new BasePage(driver);
		
		basePage.clickSignupOrLogin();
		
		name.sendKeys(regname);
		email.sendKeys(mail);
		signUp.click();
		
	}
	
	public String alertMessage() {
		
		wait.until(ExpectedConditions.visibilityOf(errorMessage));
		
		return errorMessage.getText();
	}
	
		
	
	

	
}
