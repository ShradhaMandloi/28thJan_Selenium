package HandlinfOfCustomizedListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListBoxEx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
	
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//step1
		WebElement month=d.findElement(By.xpath("//select[@id='month']"));
		
		//step2
		Actions A= new Actions(d);
		
		//step3
		A.click(month).perform();
		Thread.sleep(2000);
		
		//step4 = navigate option 1 to top/up using arrow_up key
		A.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		A.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
		//step5= navigate option 1 to bottom using arrow_down key
		A.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		//step6=select option using enter key		
		A.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
	}

}
