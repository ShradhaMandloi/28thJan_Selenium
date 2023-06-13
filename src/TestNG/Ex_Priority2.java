package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_Priority2 {
	
	@Test							//default priority=0
	public void TC2() {
		
		Reporter.log("Running TC2", true);
	}
	
	@Test(priority=-2)					//-ve priority
	public void TC1() {
	
		Reporter.log("Running TC1", true);
	}
	
	@Test(priority=3)					//duplicate priority
	public void TC3() {
		
		Reporter.log("Running TC3", true);
	}
	
	@Test(priority=3)					//duplicate priority
	public void TC5() {
		
		Reporter.log("Running TC5", true);
	}
	
	
}
