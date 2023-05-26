package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // wait mention at once to switch from one page to other page instead of thread.sleep() 
		
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		
		
		
		
	}

}
