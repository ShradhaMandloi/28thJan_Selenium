package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_Parallel1 {

	public void openFacebookBrowser() throws InterruptedException {
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		d.close();
	}
	
}
