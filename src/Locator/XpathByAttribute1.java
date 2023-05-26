package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d= new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("Women Accessories");
		d.navigate().to("https://www.facebook.com/");
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("shradha");
		d.findElement(By.xpath("//input[@id='pass']")).sendKeys("ABCDEF");
		d.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
	}

}
