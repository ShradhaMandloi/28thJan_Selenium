package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		System.out.println("...............................");
		Thread.sleep(500);
		
		//step1
		WebElement doubleclick= d.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		
		//step2
		Actions A= new Actions(d);
		
		//step3
//		A.moveToElement(doubleclick).perform();
//		A.doubleClick().perform();
//		
//		A.moveToElement(doubleclick).doubleClick().perform();
		
		A.doubleClick(doubleclick).perform();
	}

}
