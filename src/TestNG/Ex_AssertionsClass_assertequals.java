package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex_AssertionsClass_assertequals {
	
	@Test
	public void TC1() {
		
		String actresult="hi";
		String expresult="hi";
		Assert.assertEquals(actresult, expresult,"Failed TC");  //classname.method
	}                 // "Failed TC" msg will be print only in case of test case failure
	
}
