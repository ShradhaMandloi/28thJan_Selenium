package HandlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
	
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step1 close login window
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 9 power");
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);
		
		String ratings=	d.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		System.out.println(ratings);
		
	}

}
