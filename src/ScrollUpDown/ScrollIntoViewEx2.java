package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewEx2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		WebElement find=d.findElement(By.xpath("//h1[text()='Flipkart: The One-stop Shopping Destination']"));
		
		//Thread.sleep(2000);
		
		((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView(true);",find);
		
		Thread.sleep(2000);
		
		WebElement mobile=d.findElement(By.xpath("//div[text()='Mobiles']"));
		
		((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView(true);",mobile);
		
		Thread.sleep(2000);
	}
}
