package PopUps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://skpatro.github.io/demo/links/");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		
		d.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> allids=d.getWindowHandles();   //return address or id of main and child window
		ArrayList<String>A1=new ArrayList<String>(allids);
		
		d.switchTo().window(A1.get(1));     //switch to child window

		d.findElement(By.xpath("(//span[text()='Training'])[1]")).click();

		Thread.sleep(2000);
		
	//	String childWindowID=A1.get(1);
		
		d.switchTo().window(A1.get(0));     //switch to child window
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@name='New Window']")).click();

		
		
		
	}

}
