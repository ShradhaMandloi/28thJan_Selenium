package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(4000);
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
		d.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
		d.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9874563215");
		d.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("ASDFG");
	
	}

}
