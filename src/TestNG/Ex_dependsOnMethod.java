package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_dependsOnMethod {
	
	@Test
	public void login() {
		
		Reporter.log("Running Login", true);
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
	
		Reporter.log("Running Logout", true);
	}
}
