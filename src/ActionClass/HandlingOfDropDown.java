package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingOfDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(500);
		
		//step1
		WebElement more= d.findElement(By.xpath("//div[text()='More']"));
		
		//step2
		Actions A= new Actions(d);
		
		//step3
		A.moveToElement(more).perform();
		
		Thread.sleep(500);
		
		d.findElement(By.xpath("//div[text()='Advertise']")).click();
	
	
		
	}

}
