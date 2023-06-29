package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_Parallel1 {
	@Test
	public void openFacebookBrowser() throws InterruptedException {
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
		
		Thread.sleep(2000);
		d.close();
	}
	
}
