package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_TimeOut {
	
	@Test(timeOut=2000)
	public void TC2() throws InterruptedException{
		Thread.sleep(2000);
		Reporter.log("Running TC2", true);
	}
	@Test(timeOut=5000)
	public void TC1() {
		
		Reporter.log("Running TC1", true);
	}
	@Test(timeOut=2000)
	public void TC3() {
		
		Reporter.log("Running TC3", true);
	}
}
