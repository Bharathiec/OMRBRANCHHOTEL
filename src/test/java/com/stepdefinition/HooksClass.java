package com.stepdefinition;


import javax.xml.ws.Response;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
/**
 * @author Bharathi
 * @see this class is used to reduce the code redundancy
 * @since 02-06-2023
 *
 */

public class HooksClass extends BaseClass {
	
	Scenario scenario;
	
	@After
	public void afterScenario(Scenario sc) {
		boolean bs = scenario.isFailed();
		if (bs) {
			scenario.attach(ScreenShot(), "images/png", "Every Scenario");
		}
		quitBrowser();
	}
}
