package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass_ToOpenBrowser {
	WebDriver d;
	public void initializeBrowser() {
	
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.policybazaar.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
}
