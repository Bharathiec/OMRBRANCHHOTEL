package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.velocity.runtime.directive.contrib.For;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This class is used to capture locators of Select Hotel and following POM
	 *      design pattern
	 */

	public static String hotelName;
	public static String hotelPrize;

	public SelectHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//label[@for='value_pltoh']")
	private WebElement rdoLowToHigh;

	@FindBy(xpath = "//label[@for='value_phtol']")
	private WebElement rdoHighToLow;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> textAllPrize;

	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement textHotelPrize;

	@FindBy(xpath = "(//a[text()='Continue'])[1]")
	private WebElement btnContinue;

	@FindBy(id = "room_type")
	private WebElement textRoomType;

	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement textSelectHotel;

	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites'])[1]")
	private WebElement textHotelName;

	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']")
	private List<WebElement> textAllHotelName;

	public List<WebElement> getTextAllHotelName() {
		return textAllHotelName;
	}

	public WebElement getRdoLowToHigh() {
		return rdoLowToHigh;
	}

	public WebElement getRdoHighToLow() {
		return rdoHighToLow;
	}

	public List<WebElement> getTextAllPrize() {
		return textAllPrize;
	}

	public WebElement getTextHotelPrize() {
		return textHotelPrize;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTextRoomType() {
		return textRoomType;
	}

	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}
	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get select hotel success message
	 * @return Which will return actSelecthHotelSuccessMsg as a String
	 */


	public String selectHotelSuccessMsg() {

		String actSelecthHotelSuccessMsg = getText(getTextSelectHotel());
		return actSelecthHotelSuccessMsg;

	}
		/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to select first hotel and save hotel name and prize
	 */


	public void selectFirstHotelAndSave() {

		hotelName = getText(getTextHotelName());

		hotelPrize = getText(getTextHotelPrize());

		

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to click radio button of low to high
	 */

	public void clickRadioLowToHigh() {
		btnClick(getRdoLowToHigh());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to click radio button of high to low
	 */

	public void clickRadioHighToLow() {
		btnClick(getRdoHighToLow());
	}

	/*
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to accept book hotel alert
	 */

	public void acceptBookHotelAlert() {
		alertAccept();
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to dismiss book hotel alert
	 */

	public void dismissBookHotelAlert() {
		alertDismiss();
	}


	

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to sort hotel prize low to high
	 * @return Which will return b as a boolean
	 */


	public boolean sortHotelPriceLowToHigh() {
		List<String> listBeforeSort = new ArrayList<String>();
		for (WebElement x : getTextAllPrize()) {
			String text = x.getText();
			String a = text.replace("$ ", "").replace(" ", "");
			listBeforeSort.add(a);
		}
		List<String> listAfterSort = new ArrayList<String>();
		listAfterSort.addAll(listBeforeSort);
		Collections.sort(listBeforeSort);
		boolean b = listAfterSort.equals(listBeforeSort);
		return b;

	}
	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to sort hotel prize high to low
	 * @return Which will return b as a boolean
	 */


	public boolean sortHotelPriceHighToLow() {
		List<String> listBeforeSort = new ArrayList<String>();
		for (WebElement x : getTextAllPrize()) {
			String text = x.getText();
			String a = text.replace("$ ", "").replace(" ", "");
			listBeforeSort.add(a);
		}
		List<String> listAfterSort = new ArrayList<String>();
		listAfterSort.addAll(listBeforeSort);
		Collections.sort(listBeforeSort);
		Collections.reverse(listBeforeSort);
		boolean b = listAfterSort.equals(listBeforeSort);
		return b;

	}
	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get roomType text
	 * @return Which will return textRoomType as a String
	 */


	public String getRoomType(String roomType) {
		String actRoomType = getText(getTextRoomType());
		return actRoomType;
	}
	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to verify roomType
	 * @return Which will return b as a boolean
	 */


	public boolean verifyHotelNameEndsWithSameFiltered(String roomType) {
		List<Boolean> vf = new ArrayList<Boolean>();
		for (WebElement a :  getTextAllHotelName()) {
			String hnl = getText(a);
			boolean containsHotelRoomType = hnl.contains(roomType);
			vf.add(containsHotelRoomType);

		}

		boolean checkAllRoomType = vf.contains(false);
		return checkAllRoomType;
	}
	public void btnClickContinue() {
		
		btnClick(getBtnContinue());

	}
}
