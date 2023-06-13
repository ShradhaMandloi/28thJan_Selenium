package FrameWork;



import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExOfWithoutDDF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.policybazaar.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Click on sign btn from home page
		d.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		
		//enter mob number
		d.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9827413575");
		
		//click on enter password btn
		d.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		Thread.sleep(2000);
		
		//enter password
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("Lokesh@123");
		
		//click on sign in btn
		d.findElement(By.xpath("//span[text()='Sign in']")).click();
		Thread.sleep(2000);
		
		//open my account dropdown 
		WebElement	A=d.findElement(By.xpath("//div[text()='My Account']"));
		Actions A1=new Actions(d);
		A1.moveToElement(A).perform();
		Thread.sleep(2000);
		
		//click on my profile btn
		d.findElement(By.xpath("//span[text()=' My profile ']")).click();
		Thread.sleep(2000);
		
		//switch to child window
		Set<String> allIds=d.getWindowHandles();
		ArrayList<String> ar= new ArrayList<String>(allIds);
		d.switchTo().window(ar.get(1));
		Thread.sleep(2000);

		//enter full name
		String actText=	d.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		String expText="Shradha Mandloi";
		
		if(actText.equals(expText)) {
			System.out.println("TC Pass");
		}
		else {
			System.out.println("TC Fail");
		}
		
		Thread.sleep(2000);
		d.quit();
		
		
		
		
	}

}
