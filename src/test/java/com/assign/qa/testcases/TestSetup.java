package com.assign.qa.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.assign.qa.base.TestBase;

/**
* @author Ramesh Reddy K 
*
*  Mar 03, 2021
*/

public class TestSetup extends TestBase {

	@BeforeSuite
	public void setUp() {
		readPropertyFile();
		driverInitialization();
		setExtentReport();
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
		driver.quit();
	}	
}
