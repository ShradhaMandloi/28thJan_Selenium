package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_OFTestNgTestClass {
	
	@Test
	public void m1() throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		d.close();
		
	}

}
