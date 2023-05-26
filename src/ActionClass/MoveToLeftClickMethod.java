package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToLeftClickMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(500);
		
		//step1
		WebElement cart= d.findElement(By.xpath("//span[text()='Cart']"));
		
		//step2
		Actions A= new Actions(d);
		
	//	Step3
		//A.moveToElement(cart).perform();
		//A.click().perform();
		
	//	A.moveToElement(cart).click().perform();
		
		A.click(cart).perform();
		
	}

}
