package ScrollUpDown;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement terms=d.findElement(By.xpath("//a[text()='Terms']"));
		
		((JavascriptExecutor)d).executeScript("arguments[0].scrollIntoView(true);",terms);
	
	}

}
