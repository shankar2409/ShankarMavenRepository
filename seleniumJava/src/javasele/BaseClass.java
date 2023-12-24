package javasele;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("connection to the server ", true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("connection to the database ", true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("open the browser ", true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("login ", true);
	}
	
	@AfterClass
	public void AfterClass() {
		Reporter.log("close the browser ", true);
	}
	@AfterTest
	public void AfterTest() {
		Reporter.log("connection out to the database ", true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("disconnect the server ", true);
	}
	
}
