package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC1_LoginStep extends  BaseClass {
	
	PageObjectManager pom=new PageObjectManager();
	
	@Given("User is on the omrbranch hotel page")
	public void user_is_on_the_omrbranch_hotel_page() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browser"));
		launchUrl(getPropertyFileValue("url"));
		
		implicitWait();
	   
	}
	@When("User login {string} and {string}")
	public void user_login_and(String UserName, String Password) throws InterruptedException    {
	
		pom.getLoginPage().loginPage(UserName, Password);
	    	}
	

		@When("User login with EnterKey {string} and {string}")
	public void user_login_with_enter_key_and(String UserName, String Password) throws AWTException  {
			
			pom.getLoginPage().loginEnterKey(UserName, Password);
	    
	}
	
		



	
	
	@Then("User should verify after login error message {string}")
	public void user_should_verify_after_login_error_message(String expLoginErrorMsg) {
	
	Assert.assertTrue(expLoginErrorMsg, pom.getLoginPage().getLoginErrorMsg().contains(expLoginErrorMsg));
	//Assert.assertTrue(expLoginErrorMsg, pom.getLoginPage().getLoginErrorMsg().contains(expLoginErrorMsg)); 
	
	}




	
}
