package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex_Parallel2 {
	@Test
	public void openGoogleBrowser() throws InterruptedException {
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		
		Thread.sleep(2000);
		d.close();
	}
}
