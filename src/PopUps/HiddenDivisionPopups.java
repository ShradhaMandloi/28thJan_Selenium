package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc");
	
	}

}
