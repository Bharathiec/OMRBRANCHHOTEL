package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep {
	
	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String expLoginSuccessMsg) {
		
		Assert.assertEquals(expLoginSuccessMsg,pom.getExploreHotelPage().successLoginMsg());
	}

}
