package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_AssertionsClass_assertNotequals {
	@Test
	public void TC2() {
		
		String actresult="hi";
		String expresult="hi";
		Assert.assertNotEquals(actresult, expresult,"Failed TC");  //classname.method
	}	
}
