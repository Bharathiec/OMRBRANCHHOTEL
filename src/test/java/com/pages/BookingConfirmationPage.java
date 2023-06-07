package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * @author Bharathi
 * @since 15/05/2023
 * @see This class is used to capture locators of Booking Confirmation page and
 *      following POM design pattern
 */

public class BookingConfirmationPage extends BaseClass {

	public static String orderId;

	public BookingConfirmationPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h2[@class='couppon-code']/strong")
	private WebElement textOrderId;

	@FindBy(xpath = "//h2[@class='couppon-code']")
	private WebElement textBookingconfirm;

	@FindBy(xpath = "//p[text()='Hotel ']")
	private WebElement textHotelName;

	@FindBy(xpath = "//button[text()='My Booking']")
	private WebElement btnMyBooking;

	public WebElement getTextBookingconfirm() {
		return textBookingconfirm;
	}

	public WebElement getTextOrderId() {
		return textOrderId;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getBtnMyBooking() {
		return btnMyBooking;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to save generated order id and get booking success
	 *      message
	 * @return Which will return actpBookingSuccessMsg as a String
	 */

	public String bookHotelSuccessMsg() {
		String generatedOrderId = getText(getTextOrderId());
		orderId = generatedOrderId.substring(1);
		String BookingSuccessMsg = getText(getTextBookingconfirm());
		String actBookingSuccessMsg = BookingSuccessMsg.substring(12);
		return actBookingSuccessMsg;

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to same hotel name is present
	 * @return Which will return b as a boolean
	 */

	public boolean verifySelectedHotel() {
		String bookedHotelName = getText(getTextHotelName());
		String selectedHotel = bookedHotelName.substring(6, 27);
		System.out.println(selectedHotel);
		boolean b = selectedHotel.equalsIgnoreCase(SelectHotelPage.hotelName);
		return b;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to navigate from booking confirm page to My booking
	 */

	public void navigateToMyBookingFromBookingConfirmPage() {

		btnClick(getBtnMyBooking());
	}

	
	
	
}