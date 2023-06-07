package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ExploreHotelPage extends BaseClass {
	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This class is used to capture locators of Explore Hotel page and
	 *      following POM design pattern
	 */

	public ExploreHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement loginSuccessMsg;
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement clkMyAccount;


	@FindBy(id = "state")
	private WebElement txtState;
	@FindBy(id = "city")
	private WebElement txtCity;
	@FindBy(id = "room_type")
	private WebElement txtRoomType;

	@FindBy(name = "check_in")
	private WebElement txtCheckIn;
	@FindBy(name = "check_out")
	private WebElement txtCheckOut;
	@FindBy(id = "no_rooms")
	private WebElement txtNoOfRoom;
	@FindBy(id = "no_adults")
	private WebElement txtNoOfAdult;
	@FindBy(id = "no_child")
	private WebElement txtNoOfChild;
	@FindBy(id = "hotelsearch_iframe")
	private WebElement frame;
	@FindBy(id = "searchBtn")
	private WebElement btnSearch;
	@FindBy(id = "resetBtn")
	private WebElement btnReset;
	@FindBy(id = "hotelsearch_iframe")
	private WebElement inFrame;

	public WebElement getinFrame() {
		return inFrame;
	}

	@FindBy(id = "invalid-state")
	private WebElement errMsgState;
	@FindBy(id = "invalid-city")
	private WebElement errMsgCity;
	@FindBy(id = "invalid-check_in")
	private WebElement errMsgCheckIn;
	@FindBy(id = "invalid-check_out")
	private WebElement errMsgCheckOut;
	@FindBy(id = "invalid-no_rooms")
	private WebElement errMsgNoOfRoom;
	@FindBy(id = "invalid-no_adults")
	private WebElement errMsgNoOfAdults;

	@FindBy(xpath = "//a[text()=\"Book Hotel\"]")
	private WebElement btnHotel;

	public WebElement getBtnHotel() {
		return btnHotel;
	}

	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getTxtNoOfRoom() {
		return txtNoOfRoom;
	}

	public WebElement getTxtNoOfAdult() {
		return txtNoOfAdult;
	}

	public WebElement getTxtNoOfChild() {
		return txtNoOfChild;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getInFrame() {
		return inFrame;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}

	public WebElement getErrMsgState() {
		return errMsgState;
	}

	public WebElement getErrMsgCity() {
		return errMsgCity;
	}

	public WebElement getErrMsgCheckIn() {
		return errMsgCheckIn;
	}

	public WebElement getErrMsgCheckOut() {
		return errMsgCheckOut;
	}

	public WebElement getErrMsgNoOfRoom() {
		return errMsgNoOfRoom;
	}

	public WebElement getErrMsgNoOfAdults() {
		return errMsgNoOfAdults;
	}

	public WebElement getLoginSuccessMsg() {
		return loginSuccessMsg;
	}

	public void btnHotelBooking() {
		btnClick(getBtnHotel());

	}
	

	public WebElement getClkMyAccount() {
		return clkMyAccount;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get login success message
	 * @return Which will return actloginSuccessMsg as a String
	 */

	public String successLoginMsg() {

		String actLoginSuccessMsg = getText(getLoginSuccessMsg());
		return actLoginSuccessMsg;

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to select all the fields in explore hotel page
	 * @param selectState,selectCity,selectRoomType,checkIn,checkOut,noOfRoom,noOfAdults
	 *            and noOfChildren should be passed as a String
	 */

	public void exploreHotel(String SelectState, String SelectCity, String RoomType, String DateofCheckIn,
			String DateofCheckOut, String NoOfRoom, String NoOfAdultsPerRoom, String NoOfChildrenPerRoom) {
		btnHotelBooking();
		insertValue(getTxtState(), SelectState);
		selectText(getTxtCity(), SelectCity);
		selectText(getTxtRoomType(), RoomType);
		jsInsert(getTxtCheckIn(), DateofCheckIn);
		jsInsert(getTxtCheckOut(), DateofCheckOut);
		selectText(getTxtNoOfRoom(), NoOfRoom);
		selectText(getTxtNoOfAdult(), NoOfAdultsPerRoom);
		insertValue(getTxtNoOfChild(), NoOfChildrenPerRoom);
	}

	public void exploreHotel(String SelectState, String SelectCity, String DateofCheckIn, String DateofCheckOut,
			String NoOfRoom, String NoOfAdultsPerRoom) {
		btnHotelBooking();
		selectText(getTxtState(), SelectState);
		selectText(getTxtCity(), SelectCity);
		jsInsert(getTxtCheckIn(), DateofCheckIn);
		jsInsert(getTxtCheckOut(), DateofCheckOut);
		selectText(getTxtNoOfRoom(), NoOfRoom);
		selectText(getTxtNoOfAdult(), NoOfAdultsPerRoom);

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get state error message
	 * @return Which will return actStateErrorMsg as a String
	 */

	public String getErrorState() {
		String actStateErrMsg = getText(getErrMsgState());
		return actStateErrMsg;

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get city error message
	 * @return Which will return actCityErrorMsg as a String
	 */

	public String getErrorCity() {
		String actCityErrMsg = getText(getErrMsgCity());
		return actCityErrMsg;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get checkin error message
	 * @return Which will return actCheckinErrorMsg as a String
	 */

	public String getErrorCheckIn() {
		String actCheckInErrMsg = getText(getErrMsgCheckIn());
		return actCheckInErrMsg;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get checkout error message
	 * @return Which will return actCheckoutErrorMsg as a String
	 */

	public String getErrorCheckOut() {
		String actCheckOutErrMsg = getText(getErrMsgCheckOut());
		return actCheckOutErrMsg;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get noOfRooms error message
	 * @return Which will return actNoOfRoomsErrorMsg as a String
	 */

	public String getErrorRooms() {
		String actnoOfRoomErrMsg = getText(getErrMsgNoOfRoom());
		return actnoOfRoomErrMsg;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get noOfAdults error message
	 * @return Which will return actNoOfAdultsErrorMsg as a String
	 */

	public String getErroradults() {
		String actNoOfAdultsErrMsg = getText(getErrMsgNoOfAdults());
		return actNoOfAdultsErrMsg;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to select roomType
	 * @param selectRoomType
	 *            should be passed as a String
	 */

	public void selectRoomType(String roomType) {
		boolean b = roomType.contains("/");
		if (b) {
			String[] x = roomType.split("/");
			for (String v : x) {
				selectText(getTxtRoomType(), v);
			}

		} else {
			selectText(getTxtRoomType(), roomType);
		}

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to click search button wihtout entering any field
	 *      inexplore hotel page
	 */

	public void exploreHotel() {
		inFrame(getinFrame());
		btnClick(getBtnSearch());
		outFrame();

	}
	public void navigateToMyBookingFromExploreHotel() {
btnClick(getLoginSuccessMsg());
btnClick(getClkMyAccount());
	}
}







