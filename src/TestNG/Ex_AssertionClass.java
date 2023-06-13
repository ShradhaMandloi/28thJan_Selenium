package TestNG;

import org.testng.Assert;

import org.testng.annotations.Test;

public class Ex_AssertionClass {
	@Test
	public void TC5() {
		String actresult="hi";
		String expresult="hi";
		
		Assert.assertEquals(actresult, expresult, "Failed TC");
		
		
		boolean result=false;
		Assert.assertTrue(result,"Failed TC");
	}
}
