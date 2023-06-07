package com.base;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	Actions a;


	/**
	 * @author Bharathi
	 * @see To Launch a Browser
	 * @return
	 */
	/*public WebDriver launchBrowser() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		return driver;
	}*/

	public void getDriver(String browserType) {
		switch (browserType) {
		case "chrome":
			 WebDriverManager.chromedriver().setup();
			 ChromeOptions ops = new ChromeOptions();
			 ops.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(ops);
			// driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			break;

		}

	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	/**
	 * @author Bharathi
	 * @see To Maximize Window
	 * 
	 */
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	/**
	 * @author Bharathi
	 * @see To Insert a Value
	 * @param element
	 * @param data
	 * 
	 */
	public void insertValue(WebElement element, String data) {
		visibilityOfElement(element);
		element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		visibilityOfElement(element);
		element.click();
	}

	public void quitBrowser() {
		driver.quit();

	}

	public String getText(WebElement element) {
		visibilityOfElement(element);
		String text = element.getText();
		return text;
	}

	public String getPageUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;

	}

	public String getAttri(WebElement element) {
		visibilityOfElement(element);
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public WebElement findElementByXpath(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}

	public List findElementsById(String xpathExpression) {
		List<WebElement> elements = driver.findElements(By.id(xpathExpression));
		return elements;
	}

	public void mouseOverAction(WebElement element) {

		visibilityOfElement(element);
		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public void dragImage(WebElement source, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public void Select(WebElement element) {
		visibilityOfElement(element);
		a = new Actions(driver);

		a.contextClick(element).perform();
	}

	public void keyUpandDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void keyUpandDown1() throws AWTException {
		Robot r = new Robot();

		for (int i = 0; i < 12; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	

	
	
	

	public TargetLocator switchToElement() {
		TargetLocator switchTo = driver.switchTo();
		return switchTo;
	}

	public Alert switchToAlert() {
		Alert a = switchToElement().alert();
		return a;

	}

	public void alertAccept() {
		switchToAlert().accept();

	}

	public void alertDismiss() {
		switchToAlert().dismiss();

	}

	public void navigteTo(String url) {
		driver.navigate().to(url);

	}

	public void jsInsert(WebElement element, String data) {
		visibilityOfElement(element);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

	}

	public void scroolView(WebElement element) {
		visibilityOfElement(element);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scroll Into View(true)", element);

	}

	public void selectValue(WebElement element, String data) {
		visibilityOfElement(element);
		Select s = new Select(element);
		s.selectByValue(data);

	}

	public void selectText(WebElement element, String data) {
		visibilityOfElement(element);
		Select s = new Select(element);
		s.selectByVisibleText(data);

	}

	public void selectIndex(WebElement element, int data) {
		visibilityOfElement(element);
		Select s = new Select(element);
		s.selectByIndex(data);

	}

	public File scrnSht(WebElement srcFile) {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File fileSrc = tk.getScreenshotAs(OutputType.FILE);
		return fileSrc;
	}

	public void inFrame(WebElement element) {
		visibilityOfElement(element);
		driver.switchTo().frame(element);
	}

	public void outFrame() {
		driver.switchTo().defaultContent();
	}

	private String parentWind() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	private Set childWind() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String x : windowHandles) {

		}
		return windowHandles;
	}

	public WebElement wbTable() {
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> tHeading = table.findElements(By.tagName("th"));
		for (int i = 0; i < tHeading.size(); i++) {
			WebElement element = tHeading.get(i);
			System.out.println(element.getText());

		}

		return table;

	}

	public WebElement explctWait(String name) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement element = w.until(ExpectedConditions.elementToBeClickable(By.name(name)));
		return element;

	}

	public void enterKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;

	}

	public static String getPropertyFileValue(String Key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(getProjectPath() + "\\Config\\config.properties"));

		Object obj = properties.get(Key);
		String value = (String) obj;

		return value;
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public void visibilityOfElement(WebElement element) {

		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driverWait.until(ExpectedConditions.visibilityOf(element));

	}
	public byte[] ScreenShot() {
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;
		

	}

}
