package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@class='_8esa']")).click();
	}

}
