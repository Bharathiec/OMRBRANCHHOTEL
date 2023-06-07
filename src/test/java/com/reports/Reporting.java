package com.reports;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {

	public static void generateJvmReport(String jsonFile) throws FileNotFoundException, IOException {
		getProjectPath();
		getPropertyFileValue(jsonFile);
		
		/*String path = System.getProperty("user.dir");
		File f = new File(getProjectPath() + getProjectFileValue("jvmPath"));
		Configuration c = new Configuration(f, "OmrBranch Automating");
		c.addClassifications("Browser", "Chrome");
		c.addClassifications("OS", "Windows 11");
		List<String> l = new ArrayList<String>();
		l.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(l, c);
		builder.generateReports();*/

	}

}
