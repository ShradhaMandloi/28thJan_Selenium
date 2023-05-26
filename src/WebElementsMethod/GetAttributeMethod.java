package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//input[@id='email']
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		Thread.sleep(2000);
		
	String text=d.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
	System.out.println(text);
	}

}
