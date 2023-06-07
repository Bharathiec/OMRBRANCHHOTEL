package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@ChangeBooking2"),features = "src\\test\\resources\\Features\\TC5_ChangeBooking.feature", glue = "com.stepdefinition",monochrome=true, dryRun = false)
public class TestRunnerClass extends BaseClass {

	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		// String path = System.getProperty("user.dir");
		Reporting.generateJvmReport(getProjectPath() + getPropertyFileValue("jsonpath"));
	}
}
