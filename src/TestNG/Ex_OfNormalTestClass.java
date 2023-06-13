package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_OfNormalTestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		d.close();
	}

}
