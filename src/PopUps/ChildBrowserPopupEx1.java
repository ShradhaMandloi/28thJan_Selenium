package PopUps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupEx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.xpath("//img[@alt='Fashion']")).click();
		
		Set<String> allids = d.getWindowHandles();
		ArrayList<String> a1=new ArrayList<>(allids);
		
		d.switchTo().window(a1.get(1));
		
		d.findElement(By.xpath("(//p[text()='Shop Now'])[1]")).click();
	
		Thread.sleep(2000);
		
		d.switchTo().window(a1.get(0));
		
	//	Thread.sleep(2000);
		
	//	d.findElement(By.xpath(null))
		
	}

}
