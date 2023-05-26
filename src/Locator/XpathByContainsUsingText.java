package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsUsingText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		d.findElement(By.xpath("//a[contains(text(),'Page')]")).click();
		
	}

}
