package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utilities.Input;

public class LoginTest extends BaseTest{
  @Test(dataProvider = "validLoginData",dataProviderClass=Input.class)
  public void validLogin(String email,String password) {
	  
	  login_Page.login(email,password);
	  
	  String actual = login_Page.getText();
	  
	  Assert.assertEquals(actual,"Logout");
	  
	  System.out.println("Login successfull!!");
	  
  }
  
  
 @Test(dataProvider = "InValidLoginData",dataProviderClass=Input.class) 
 public void InValidLogin(String email,String password) {
	  
	  login_Page.login(email,password);
	  
	  String actual = login_Page.getInvalidMessage();
	  
	  Assert.assertEquals(actual,"Your email or password is incorrect!");
	  
	  System.out.println("Invalid Email");
	  
  }
}
