package TestNG;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Ex_MultiBrowsingTesting {
	
	WebDriver d;
	@Parameters("browsername")
	@Test
	public void TC1(String browsername) throws InterruptedException {
		
		WebDriver d=null;
		if(browsername.equals("chrome")) {
			d=new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			d= new FirefoxDriver();
		}
		else if(browsername.equals("edge")) {
			d= new EdgeDriver();
		}
		
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.quit();
	}
}
