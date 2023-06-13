package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_DependsOnMethod2 {

	@Test
	public void login1() {
		
		Reporter.log("Running Login1", true);
	}
	@Test
	public void login2() {
		
		Reporter.log("Running Login2", true);
	}
	
	@Test(dependsOnMethods = {"login1","login2"})
	public void logout() {
	
		Reporter.log("Running Logout", true);
	}
}
