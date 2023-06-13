package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex_EmailableReport {

	@Test
	public void TC1() {
		
		//System.out.println("Tc1 test case");
		Reporter.log("Tc1 test case",false);   //diffclassname.methodname("Message", true);
		
		
	} 
	@Test
	public void TC2() {
		
		//System.out.println("Tc2 test case");
		Reporter.log("Tc1 test case",false);
	}
	
}
