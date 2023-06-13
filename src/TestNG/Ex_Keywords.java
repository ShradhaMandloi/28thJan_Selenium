package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_Keywords {

	@Test(invocationCount=5)
	public void TC1() {
		
		Reporter.log("Running TC1", true);
	}
	
	
}
