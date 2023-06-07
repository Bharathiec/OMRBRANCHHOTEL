package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ChangeBookingStep {
	
	PageObjectManager pom = new PageObjectManager();
	
	
	
	@When("User navigating to my booking page")
	public void user_navigating_to_my_booking_page() {
		pom.getBookingConfirmationPage().navigateToMyBookingFromBookingConfirmPage();
		
	    
	}
	@Then("User should verify after navigating to my booking message with success message {string}")
	public void user_should_verify_after_navigating_to_my_booking_message_with_success_message(String expBookingSuccessMsg) {
		Assert.assertEquals("verify success message navigating to my booking", expBookingSuccessMsg, pom.getMyBookingPage().bookingPageSuccessMsg());
	}
	@When("User enter the generated order id")
	public void user_enter_the_generated_order_id() {
		pom.getMyBookingPage().searchForGeneratedOrderId();
	    
	}
	@Then("User should verify the same hotel name is present")
	public void user_should_verify_the_same_hotel_name_is_present() {
		Assert.assertTrue("verify same hotel is present", pom.getMyBookingPage().verifyHotelName());
	   
	}
	@Then("User should verify the same order id is present")
	public void user_should_verify_the_same_order_id_is_present() {
		//Assert.assertTrue("verify same order id is present", pom.getMyBookingPage().verifyOrderId());

	    
	}
	@Then("User should verify the same price is present")
	public void user_should_verify_the_same_price_is_present() {
		
		Assert.assertTrue("verify same price is present", pom.getMyBookingPage().verifyHotelPrize());

	}
	@When("User edit the particular booking details and change the {string}")
	public void user_edit_the_particular_booking_details_and_change_the(String updatedCheckIn) {
		pom.getMyBookingPage().editAndChangeCheckinDate(updatedCheckIn);
	   
	}
	
	
	@When("User enter the existing order id {string}")
	public void user_enter_the_existing_order_id(String existOrderid) {
		pom.getMyBookingPage().searchForExisitingOrderId(existOrderid);
		
		

	}
	
	
	@When("User edit  the first available order id and User Change the checkindate {string}")
	public void user_edit_the_first_available_order_id_and_user_change_the_checkindate(String updatedCheckIn) {
		pom.getMyBookingPage().editAndChangeCheckinDate(updatedCheckIn);

	}



		
	
	
	@When("User Change the checkindate {string}")
	public void user_change_the_checkindate(String updatedCheckIn) {
		pom.getMyBookingPage().editAndChangeCheckinDate(updatedCheckIn);
	   
	}


	


	@Then("User should verify after change the checkindate with success message {string}")
	public void user_should_verify_after_change_the_checkindate_with_success_message(String expChangeInDateSuccessmsg) {
		Assert.assertEquals("verify success message navigating to my booking", expChangeInDateSuccessmsg, pom.getMyBookingPage().bookingUpdatedSuccessMsg());
	}



	@When("User navigating to my booking page from explore hotel page")
	public void user_navigating_to_my_booking_page_from_explore_hotel_page() {
		pom.getExploreHotelPage().navigateToMyBookingFromExploreHotel();
	    
	}






	
	
	
	
	
	
	
	
}
