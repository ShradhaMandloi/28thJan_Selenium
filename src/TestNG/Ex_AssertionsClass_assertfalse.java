package TestNG;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Ex_AssertionsClass_assertfalse {
	@Test
	public void TC3() {
		
		boolean actresult=true;
		Assert.assertFalse(actresult, "failed because actresult is true");
	}
}
