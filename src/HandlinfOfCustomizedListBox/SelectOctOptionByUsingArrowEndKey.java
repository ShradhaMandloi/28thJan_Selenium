package HandlinfOfCustomizedListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectOctOptionByUsingArrowEndKey {

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
		
		//step4 navigate to 1st option using end key i.e dec 
		A.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		//step5
		for(int i=1; i<=2;i++) {
			A.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(2000);	
		}
		//step6
		A.sendKeys(Keys.ENTER).perform();
		
		
	}

}
