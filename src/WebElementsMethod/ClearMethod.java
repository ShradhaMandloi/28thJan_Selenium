package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		
//		d.findElement(By.xpath("//input[@id='email']")).sendKeys("shradha"); 
//		Thread.sleep(2000);
//		d.findElement(By.xpath("//input[@id='email']")).click();
//		d.findElement(By.xpath("//input[@id='email']")).sendKeys("Lokesh"); 
	
	//second approach
		
		WebElement un=d.findElement(By.xpath("//input[@id='email']"));
		un.sendKeys("Shradha");
		Thread.sleep(2000);
		un.clear();
		un.sendKeys("Lokesh");
	
	
	}
	
	

}
