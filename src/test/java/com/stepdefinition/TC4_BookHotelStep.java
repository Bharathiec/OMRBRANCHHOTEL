package com.stepdefinition;



import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC4_BookHotelStep {
	PageObjectManager pom = new PageObjectManager();

	@When("User enter the guest details {string},{string},{string},{string} and {string}")
	public void user_enter_the_guest_details_and(String SelectSalutation, String FirstName, String LastName,
			String MobileNo, String Email) {
		pom.getBookHotelPage().addGuestDetails(SelectSalutation, FirstName, LastName, MobileNo, Email);

	}

	@When("User add the gst details {string},{string} and {string}")
	public void user_add_the_gst_details_and(String EnterRegistrationNo, String EnterCompanyName,
			String EnterCompanyAddress) {
		pom.getBookHotelPage().addGstDetails(EnterRegistrationNo, EnterCompanyName, EnterCompanyAddress);
		pom.getBookHotelPage().btnNextGuest();

	}

	@When("User add the special request {string}")
	public void user_add_the_special_request(String data) {
		pom.getBookHotelPage().addSpecialRequest(data);
	

	}

	@When("User proceed the payment option {string}")
	public void user_proceed_the_payment_option(String cardType, DataTable dataTable) {

		pom.getBookHotelPage().addPayment(cardType, dataTable);
	}

	@Then("User should verify the booking confirmation after payment with success message {string} and save the {string}")
	public void user_should_verify_the_booking_confirmation_after_payment_with_success_message_and_save_the(
			String cardType, String dataTable) {

	}

	/*@Then("User should verify that booked hotel is same as selected hotel")
	public void user_should_verify_that_booked_hotel_is_same_as_selected_hotel() {
		
Assert.assertTrue("verify selected hotel is booked",pom.getBookingConfirmationPage().verifySelectedHotel());
	}*/
	
	
	@Then("User should verify selected hotel is booked")
	public void user_should_verify_selected_hotel_is_booked() {
		//Assert.assertTrue("verify  hotel is booked", pom.getBookingConfirmationPage().verifySelectedHotel());
  
	}




	@Then("User Should verify error message after clicking next button {string},{string},{string},{string},{string}, and {string}")
	public void user_should_verify_error_message_after_clicking_next_button_and(String string, String string2,
			String string3, String string4, String string5, String string6) {

	}

	@When("User add the gst details {string},{string} and {string} and User click the next special request button")
	public void user_add_the_gst_details_and_and_user_click_the_next_special_request_button(String EnterRegistrationNo,
			String EnterCompanyName, String EnterCompanyAddress) {
		pom.getBookHotelPage().addGstDetails(EnterRegistrationNo, EnterCompanyName, EnterCompanyAddress);
		pom.getBookHotelPage().btnNextGuest();
		pom.getBookHotelPage().clickNextSplRequestButton();

	}

	@When("User enter the guest details {string},{string},{string},{string} and {string} and User click the next button")
	public void user_enter_the_guest_details_and_and_user_click_the_next_button(String SelectSalutation,
			String FirstName, String LastName, String MobileNo, String Email) {
		pom.getBookHotelPage().addGuestDetails(SelectSalutation, FirstName, LastName, MobileNo, Email);
		pom.getBookHotelPage().btnNextGuest();

	}

	@When("User enter the guest details {string},{string},{string},{string} and {string} and User click next button and next special request button")
	public void user_enter_the_guest_details_and_and_user_click_next_button_and_next_special_request_button(
			String SelectSalutation, String FirstName, String LastName, String MobileNo, String Email) {
		pom.getBookHotelPage().addGuestDetails(SelectSalutation, FirstName, LastName, MobileNo, Email);
		pom.getBookHotelPage().btnNextGuest();
		pom.getBookHotelPage().clickNextSplRequestButton();

	}
		@Then("User should verify the booking confirmation after payment with success message {string} and save the Order Id")
	public void user_should_verify_the_booking_confirmation_after_payment_with_success_message_and_save_the_order_id(String expBookingSuccesMessage) {
			Assert.assertEquals("verify success message after book hotel", expBookingSuccesMessage, pom.getBookingConfirmationPage().bookHotelSuccessMsg());
	    
	}




}
