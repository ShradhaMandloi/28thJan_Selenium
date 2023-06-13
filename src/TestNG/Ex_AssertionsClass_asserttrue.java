package TestNG;

import org.testng.annotations.Test;
import org.testng.Assert;


public class Ex_AssertionsClass_asserttrue {
	
	@Test
	public void TC3() {
		
		boolean actresult=false;
		Assert.assertTrue(actresult,"Failed TC");
		
		boolean result=false;
		Assert.assertTrue(result,"Failed TC");
	}
}
