package Calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlinfOfCalender {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver d= new ChromeDriver(op);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		d.manage().window().maximize();
		d.get("https://www.redbus.in/");
		
		//source
		d.findElement(By.xpath("//input[@id='src']")).sendKeys("Pune");
		Thread.sleep(2000);
		
		//destination
		d.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		
		//open date menu
		d.findElement(By.xpath("//text[contains(text(),'Date')]")).click();
		Thread.sleep(2000);
		
		//navigate to expected month
		while(d.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText().contains("Sep")==false)
		{
			Thread.sleep(2000);
			//click on next button
			d.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click(); 
			Thread.sleep(2000);
			   	
		}
		Thread.sleep(2000);
		List<WebElement> alldates=d.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']")); 
		
		for(WebElement date: alldates) {
			if(date.getText().contains("5")) {
				date.click();
				break;
				
			}
			
		}	
		
	}
	
}
