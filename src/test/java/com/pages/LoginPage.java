package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This class is used to capture locators of Login Page and following POM
	 *      design pattern
	 */

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUser;
	@FindBy(id = "pass")
	private WebElement txtPass;
	@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
	private WebElement btnLogin;

	@FindBy(id = "errorMessage")
	private WebElement errMsg;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getErrMsg() {
		return errMsg;
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to perform login functionality
	 * @param emailAddress
	 *            and password should be passed as a string
	 */

	public void loginPage(String UserName, String Password) throws InterruptedException {

		insertValue(getTxtUser(), UserName);
		insertValue(getTxtPass(), Password);
		btnClick(getBtnLogin());
	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to perform login functionality using Enter key
	 * @param emailAddress
	 *            and password should be passed as a string
	 */

	public void loginEnterKey(String UserName, String Password) throws AWTException {

		insertValue(getTxtUser(), UserName);
		insertValue(getTxtPass(), Password);
		enterKey();

	}

	/**
	 * @author Bharathi
	 * @since 15/05/2023
	 * @see This method is used to get login error message
	 * @return Which will return actLoginErrorMsg as a string
	 */

	public String getLoginErrorMsg() {

		String actLoginErrorMsg = getText(getErrMsg());
		return actLoginErrorMsg;

	}

}
