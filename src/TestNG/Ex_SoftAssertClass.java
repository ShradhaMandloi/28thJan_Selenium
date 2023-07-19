package TestNG;



import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex_SoftAssertClass {

	@Test
	public void TC5() {
		SoftAssert soft= new SoftAssert();
		
		String actresult="hello";
		String expresult="hi";
		
		soft.assertEquals(actresult, expresult, "Failed TC");
		
		
		boolean result=false;
		soft.assertTrue(result,"Failed TC");
		
		soft.assertAll();
	}
	public void TC6() {
		SoftAssert soft= new SoftAssert();
		
		String actresult="hello";
		String expresult="hello";
		
		soft.assertEquals(actresult, expresult, "Failed TC");
		
		
		boolean result=true;
		soft.assertTrue(result,"Failed TC");
		
		soft.assertAll();
	}
}
