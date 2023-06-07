package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TC2_ExploreHotelStep {
	PageObjectManager pom = new PageObjectManager();

	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String SelectState, String SelectCity, String RoomType, String DateofCheckIn,
			String DateofCheckOut, String NoOfRoom, String NoOfAdultsPerRoom, String NoOfChildrenPerRoom) {
		pom.getExploreHotelPage().exploreHotel(SelectState, SelectCity, RoomType, DateofCheckIn, DateofCheckOut,
				NoOfRoom, NoOfAdultsPerRoom, NoOfChildrenPerRoom);
		pom.getExploreHotelPage().exploreHotel();
	}

	@Then("User should verify after search hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String string) {
	}

	@When("User  enter only mandatory field to search hotel {string},{string},{string},{string},{string} and {string}")
	public void user_enter_only_mandatory_field_to_search_hotel_and(String SelectState, String SelectCity,
			String DateofCheckIn, String DateofCheckOut, String NoOfRoom, String NoOfAdultsPerRoom) {
		pom.getExploreHotelPage().exploreHotel(SelectState, SelectCity, DateofCheckIn, DateofCheckOut, NoOfRoom,
				NoOfAdultsPerRoom);
		pom.getExploreHotelPage().exploreHotel();
	}

	@Then("User should verify after login success message\"Welcome Bharathi\"")
	public void user_should_verify_after_login_success_message_welcome_bharathi() {

	}

	@Then("User should verify error mesaage after user select search hotel {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_error_mesaage_after_user_select_search_hotel_and(String errState, String errCity,
			String errCheckInDate, String errCheckOutDate, String errRooms, String errAdults) {

		
		pom.getExploreHotelPage().exploreHotel();
		Assert.assertTrue("verify error msg of State",pom.getExploreHotelPage().getErrorState().contains(errState));
		Assert.assertTrue("verify error msg of State",pom.getExploreHotelPage().getErrorCity().contains(errCity));
		Assert.assertTrue("verify error msg of State",pom.getExploreHotelPage().getErrorCheckIn().contains(errCheckInDate));
		Assert.assertTrue("verify error msg of State",pom.getExploreHotelPage().getErrorCheckOut().contains(errCheckOutDate));
		Assert.assertTrue("verify error msg of State",pom.getExploreHotelPage().getErrorRooms().contains(errRooms));
		Assert.assertTrue("verify error msg of State",pom.getExploreHotelPage().getErroradults().contains(errAdults));
		}

	@Then("User should verify selected {string} filter is present")
	public void user_should_verify_selected_filter_is_present(String string) {
		pom.getExploreHotelPage().selectRoomType(string);	
	}

}
