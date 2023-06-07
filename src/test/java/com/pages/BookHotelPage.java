package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.datatable.DataTable;

public class BookHotelPage extends BaseClass {
	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This class is used to capture locators of Book Hotel and following POM
	 *      design pattern
	 */

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "own")
	private WebElement rdoMyself;

	@FindBy(id = "user_title")
	private WebElement ddnSalutaion;

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "user_phone")
	private WebElement txtPhoneNo;

	@FindBy(id = "user_email")
	private WebElement txtEmailId;

	@FindBy(id = "gst")
	private WebElement chkGST;

	@FindBy(id = "gst_registration")
	private WebElement txtRegNo;

	@FindBy(id = "company_name")
	private WebElement txtCompanyName;

	@FindBy(id = "company_address")
	private WebElement txtCompanyAddress;

	@FindBy(id = "step1next")
	private WebElement btnNextGuest;

	@FindBy(id = "invalid-booking_for")
	private WebElement errorMsgBookingFor;

	@FindBy(id = "invalid-title")
	private WebElement errorMsgSalutation;

	@FindBy(id = "invalid-first_name")
	private WebElement errorMsgFirstName;

	@FindBy(id = "invalid-last_name")
	private WebElement errorMsgLastName;

	@FindBy(id = "invalid-phone")
	private WebElement errorMsgphone;

	@FindBy(id = "invalid-email")
	private WebElement errorMsgEmail;

	@FindBy(id = "late")
	private WebElement chkLateCheckin;

	@FindBy(id = "other_request")
	private WebElement txtOtherRequest;

	@FindBy(id = "step2next")
	private WebElement btnNextSplRequest;

	@FindBy(xpath = "//div[@class='credit-card pm']")
	private WebElement btnCradPayment;

	@FindBy(id = "payment_type")
	private WebElement ddnPaymentType;

	@FindBy(id = "card_type")
	private WebElement ddnCardType;

	@FindBy(id = "card_no")
	private WebElement txtCardNo;

	@FindBy(id = "card_name")
	private WebElement txtCardName;

	@FindBy(id = "card_month")
	private WebElement ddnCardMonth;

	@FindBy(id = "card_year")
	private WebElement ddnCardYear;

	@FindBy(id = "cvv")
	private WebElement txtCvv;

	@FindBy(id = "submitBtn")
	private WebElement btnSubmit;

	@FindBy(xpath = "//div[@class='row']")
	private WebElement textBookHotel;

	public WebElement getRdoMyself() {
		return rdoMyself;
	}

	public WebElement getDdnSalutaion() {
		return ddnSalutaion;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPhoneNo() {
		return txtPhoneNo;
	}

	public WebElement getTxtEmailId() {
		return txtEmailId;
	}

	public WebElement getChkGST() {
		return chkGST;
	}

	public WebElement getTxtRegNo() {
		return txtRegNo;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtCompanyAddress() {
		return txtCompanyAddress;
	}

	public WebElement getBtnNextGuest() {
		return btnNextGuest;
	}

	public WebElement getErrorMsgBookingFor() {
		return errorMsgBookingFor;
	}

	public WebElement getErrorMsgSalutation() {
		return errorMsgSalutation;
	}

	public WebElement getErrorMsgFirstName() {
		return errorMsgFirstName;
	}

	public WebElement getErrorMsgLastName() {
		return errorMsgLastName;
	}

	public WebElement getErrorMsgphone() {
		return errorMsgphone;
	}

	public WebElement getErrorMsgEmail() {
		return errorMsgEmail;
	}

	public WebElement getChkLateCheckin() {
		return chkLateCheckin;
	}

	public WebElement getTxtOtherRequest() {
		return txtOtherRequest;
	}

	public WebElement getBtnNextSplRequest() {
		return btnNextSplRequest;
	}

	public WebElement getBtnCradPayment() {
		return btnCradPayment;
	}

	public WebElement getDdnPaymentType() {
		return ddnPaymentType;
	}

	public WebElement getDdnCardType() {
		return ddnCardType;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtCardName() {
		return txtCardName;
	}

	public WebElement getDdnCardMonth() {
		return ddnCardMonth;
	}

	public WebElement getDdnCardYear() {
		return ddnCardYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getTextBookHotel() {
		return textBookHotel;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @param salutation,firstName,lastName,mobileNo
	 *            and emailAddress should be passed as a String
	 * @see This method is used to enter Guest details in book hotel page
	 */

	public void addGuestDetails(String SelectSalutation, String FirstName, String LastName, String MobileNo,
			String Email) {
		btnClick(getRdoMyself());
		insertValue(getDdnSalutaion(), SelectSalutation);
		insertValue(getTxtFirstName(), FirstName);
		insertValue(getTxtLastName(), LastName);
		insertValue(getTxtPhoneNo(), MobileNo);
		insertValue(getTxtEmailId(), Email);
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to click next guest button
	 * @return
	 */
	public void btnNextGuest() {
		btnClick(getBtnNextGuest());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @param regNo,companyName
	 *            and companyAddress should be passed as a String
	 * @see This method is used to enter GST details in book hotel page
	 */

	public void addGstDetails(String EnterRegistrationNo, String EnterCompanyName, String EnterCompanyAddress) {
		btnClick(getChkGST());
		insertValue(getTxtRegNo(), EnterRegistrationNo);
		insertValue(getTxtCompanyName(), EnterCompanyName);
		insertValue(getTxtCompanyAddress(), EnterCompanyAddress);

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @param specialRequest
	 *            should be passed as a String
	 * @see This method is used to enter special request details in book hotel page
	 */

	public void addSpecialRequest(String data) {
		btnClick(getChkLateCheckin());
		btnClick(getTxtOtherRequest());
		insertValue(getTxtOtherRequest(), data);
		btnClick(getBtnNextSplRequest());

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to click next button without enter any guest details
	 * @return
	 */
	public void clickNextSplRequestButton() {
		btnClick(getBtnNextSplRequest());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to click submit
	 * @return
	 */

	public void btnSubmit() {
		btnClick(getBtnSubmit());

	}

	public String getErrorBooking() {
		return getText(getRdoMyself());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get salutaion error message in book hotel page
	 * @return Which will return actSalutationErrorMsg as a String
	 */

	public String getErrorSalutation() {
		return getText(getErrorMsgSalutation());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get FirstName error message in book hotel page
	 * @return Which will return actFirstNameErrorMsg as a String
	 */

	public String getErrorFirstName() {
		return getText(getErrorMsgFirstName());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get LastName error message in book hotel page
	 * @return Which will return actLastNameErrorMsg as a String
	 */

	public String getErrorLastName() {
		return getText(getErrorMsgLastName());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get MobileNo error message in book hotel page
	 * @return Which will return actMobileNoErrorMsg as a String
	 */

	public String getErrorMobileNo() {
		return getText(getErrorMsgphone());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get Email error message in book hotel page
	 * @return Which will return actErrorMsgEmail as a String
	 */

	public String getErrorEmail() {
		return getText(getErrorMsgEmail());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @param cardType
	 *            should be passed as a String and dataTable should be passed as a
	 *            DataTable
	 * @see This method is used to enter payment details in book hotel page
	 */

	public void addPayment(String cardType, DataTable dataTable) {
		btnClick(getBtnCradPayment());
		switch (cardType) {

		case "Debit Card":
			insertValue(getDdnPaymentType(), cardType);
			List<Map<String, String>> dCardDetails = dataTable.asMaps();
			// getting cDebit card details

			Map<String, String> s = dCardDetails.get(0);
			selectText(getDdnCardType(), s.get("CardType"));
			insertValue(getTxtCardNo(), s.get("CardNumber"));
			insertValue(getTxtCardName(), s.get("CardHolderName"));
			selectText(getDdnCardMonth(), s.get("Month"));
			selectText(getDdnCardYear(), s.get("Year"));
			insertValue(getTxtCvv(), s.get("Cvv"));

		case "Credit Card":
			insertValue(getDdnPaymentType(), cardType);
			List<Map<String, String>> cCardDetails = dataTable.asMaps();
			// getting Credit card details

			Map<String, String> t = cCardDetails.get(4);
			selectText(getDdnCardType(), t.get("CardType"));
			insertValue(getTxtCardNo(), t.get("CardNumber"));
			insertValue(getTxtCardName(), t.get("CardHolderName"));
			selectText(getDdnCardMonth(), t.get("Month"));
			selectText(getDdnCardYear(), t.get("Year"));
			insertValue(getTxtCvv(), t.get("Cvv"));
			break;
		default:
			break;

		}
		btnClick(getBtnSubmit());

	}
	
	public String bookHotelSuccessMsg() {
String bookHotel = getText(getTextBookHotel());
String actBookHotelSuccessMsg = bookHotel.substring(0, 10);
return actBookHotelSuccessMsg;
	}

}