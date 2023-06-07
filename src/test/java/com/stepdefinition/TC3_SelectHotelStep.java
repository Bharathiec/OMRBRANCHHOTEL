package com.stepdefinition;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep {
	PageObjectManager pom = new PageObjectManager();
	@When("User select first hotel name and click continue and  save the hotel,price")
	public void user_select_first_hotel_name_and_click_continue_and_save_the_hotel_price() {
		pom.getSelectHotelPage().selectFirstHotelAndSave();
		pom.getSelectHotelPage().btnClickContinue();
		
	
	    
	}
	@Then("User should verify after accept the alert with success message  {string}")
	public void user_should_verify_after_accept_the_alert_with_success_message(String expAcceptSuccessMsg) {
		pom.getSelectHotelPage().acceptBookHotelAlert();
	  
	}


	
	
	@Then("User should verify after dismiss the alert with success message  {string}")
	public void user_should_verify_after_dismiss_the_alert_with_success_message(String expDismissSuccessMsg) {
		pom.getSelectHotelPage().dismissBookHotelAlert();
	}
	
	@Then("User Click radio button after search hotel")
	public void user_click_radio_button_after_search_hotel() {
	   
	}
	@Then("User should verify the sorting hotel price list from low to high after click radio button")
	public void user_should_verify_the_sorting_hotel_price_list_from_low_to_high_after_click_radio_button() {
		pom.getSelectHotelPage().clickRadioLowToHigh();
	}
	
	
	@Then("User should verify the sorting hotel price list from high to low after click radio button")
	public void user_should_verify_the_sorting_hotel_price_list_from_high_to_low_after_click_radio_button() {
		pom.getSelectHotelPage().clickRadioHighToLow();
	   
	}

	
	@Then("User should verify all hotel name ends with same selected filtered {string}")
	public void user_should_verify_all_hotel_name_ends_with_same_selected_filtered(String roomType) {
	    
	}









}
