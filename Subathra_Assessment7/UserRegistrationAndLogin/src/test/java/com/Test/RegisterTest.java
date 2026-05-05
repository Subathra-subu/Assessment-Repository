package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Utilities.Input;

public class RegisterTest extends BaseTest {
	
  @Test(dataProvider = "validData",dataProviderClass=Input.class)
  public void validRegister(String registername,String registeremail,String regpass,String regfirstName,String reglastName,String regaddress,String regstate,String regcity,String regzip,String regmobile ) {
	  
	  register_Page.register(registername,registeremail,regpass,regfirstName,reglastName,regaddress,regstate,regcity,regzip,regmobile);
	  
	  String actual_message = register_Page.getSuccessMessage();
	  
	  Assert.assertEquals(actual_message,"ACCOUNT CREATED!");
	  
	  System.out.println("Account created");
  }
  
  @Test(dataProvider = "InvalidData",dataProviderClass=Input.class)
	  
	  public void validRegister(String registername,String registeremail) {
	 
	  register_Page.inValidregister(registername,registeremail);
	  
	  String actual = register_Page.alertMessage();
	  
	  Assert.assertEquals(actual,"Email Address already exist!");
	  
	  System.out.println("Email Already exsist");
  }
}
