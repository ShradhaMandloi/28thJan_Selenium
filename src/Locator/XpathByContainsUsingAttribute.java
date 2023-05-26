package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsUsingAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("XYZ");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[contains(@class,'_6luy ')]")).sendKeys("abc");
		
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
	//	d.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();


		
		
		
	}

}
