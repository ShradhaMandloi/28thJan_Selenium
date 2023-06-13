package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex_Annotations {
	
	@BeforeClass
	public void OpenBrowser() {
		Reporter.log("Open Browser", true);
	}
	@BeforeMethod
	public void LoginToAp() {
		Reporter.log("Login To App", true);
	}
	@Test
	public void verifyFullName1() {
		Reporter.log("Verify Full Name", true);
	}
	@Test
	public void verifyAddress2() {
		Reporter.log("Verify Address", true);
	}
	@AfterMethod
	public void logoutFromApp() {
		Reporter.log("Logout From App", true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser", true);
	}
	
}
