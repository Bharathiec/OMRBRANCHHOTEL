package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class MyBookingPage extends BaseClass {

	public static String orderId;

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This class is used to capture locators of My Booking page and following
	 *      POM design pattern
	 */

	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='search']")
	private WebElement txtSearch;

	@FindBy(xpath = "//button[text()='Edit']")
	private WebElement btnEdit;

	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement btnCancel;

	@FindBy(name = "check_in")
	private WebElement txtCheckinchange;

	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement btnConfirm;

	@FindBy(xpath = "//li[text()='Booking updated successfully']")
	private WebElement textMsgBookingUpdated;

	@FindBy(xpath = "//li[text()='Your booking cancelled successfully']")
	private WebElement textMsgBookingCancelled;

	@FindBy(id = "bookings")
	private WebElement textBookings;

	@FindBy(xpath = "//div[@class='room-code']")
	private WebElement textorderid;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private WebElement txtPrice;

	@FindBy(xpath = "//a[@target='_blank']/h5")
	private WebElement txtHotel;
	
	@FindBy(xpath = "//div[@class='room-code']")
	private WebElement existingorderid;

	
	

	public static String getOrderId() {
		return orderId;
	}

	public WebElement getExistingorderid() {
		return existingorderid;
	}

	public WebElement getTextorderid() {
		return textorderid;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getTxtCheckinchange() {
		return txtCheckinchange;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getTextMsgBookingUpdated() {
		return textMsgBookingUpdated;
	}

	public WebElement getTextMsgBookingCancelled() {
		return textMsgBookingCancelled;
	}

	public WebElement getTextBookings() {
		return textBookings;
	}

	public WebElement getTxtPrice() {
		return txtPrice;
	}

	public WebElement getTxtHotel() {
		return txtHotel;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to edit and change the checkin date
	 */

	public void editAndChangeCheckinDate(String updatedCheckIn) {

		btnClick(getBtnEdit());
	jsInsert(getTxtCheckinchange(), updatedCheckIn);
		btnClick(getBtnConfirm());

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get booking page Success message
	 * @return Which will return actBookingPageSuccessPage as a string
	 */

	public String bookingPageSuccessMsg() {

		String txtBooking = getText(getTextBookings());
		String actBookingPageSuccessPage = txtBooking.substring(0, 8);
		System.out.println(actBookingPageSuccessPage);
		return actBookingPageSuccessPage;

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get booking updated success message
	 * @return Which will return actBookingUpdatedSuccessMsg as a string
	 */

	public String bookingUpdatedSuccessMsg() {

		String actBookingUpdatedSuccessMsg = getText(getTextMsgBookingUpdated());
		return actBookingUpdatedSuccessMsg;

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get booking cancel Success message
	 * @return Which will return actBookingCancelMsg as a string
	 */

	public String bookingCancelSuccessMsg() {

		String actBookingCancelMsg = getText(getTextMsgBookingCancelled());
		return actBookingCancelMsg;

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to verify hotel name
	 * @return Which will return verifyHotelName as a boolean
	 */

	public boolean verifyHotelName() {

		String bookedHotel = getText(getTxtHotel());
		String bookedHotelName = bookedHotel.substring(0, 21);
		boolean verifyHotelName = bookedHotelName.equalsIgnoreCase(SelectHotelPage.hotelName);
		return verifyHotelName;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to verify hotel price
	 * @return Which will return verifyHotelPrice as a boolean
	 */

	public boolean verifyHotelPrize() {

		String bookedHotelPrice = getText(getTxtPrice());
		String bookedHotelPrize = bookedHotelPrice.replace("Rs", "$");
		boolean verifyHotelPrice = bookedHotelPrize.equalsIgnoreCase(SelectHotelPage.hotelPrize);
		return verifyHotelPrice;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to verify orderid
	 * @return Which will return verifyOrderId as a boolean
	 */
	public boolean verifyOrderId() {

		String bookedOrderid = getText(getTextorderid());
		String bookedOrderId = bookedOrderid.substring(1);
		boolean verifyOrderId = bookedOrderId.equalsIgnoreCase(BookingConfirmationPage.orderId);
		return verifyOrderId;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to search for generated orderid
	 */

	public void searchForGeneratedOrderId() {

		insertValue(getTxtSearch(), BookingConfirmationPage.orderId);

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to cancel orderid
	 */
	public void cancelOrderId() {

		btnClick(getBtnCancel());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to search for Existing orderid
	 */

	public void searchForExisitingOrderId(String existOrderid) {

		insertValue(getTxtSearch(), existOrderid);

	}
	public boolean verifyExistingOrderId(String existOrderid) {
		String existOrderId1 = getText(getExistingorderid()).substring(1);
		System.out.println(existOrderId1);
		boolean existngOrderId = existOrderId1.equals(existOrderid);
		return existngOrderId;
		

	}
}