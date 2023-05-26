package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysAndFindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		
	//	d.findElement(By.xpath("//input[@id='email']")).sendKeys("shradha");  //1st way
		
		WebElement UN= d.findElement(By.xpath("//input[@id='email']"));    // 2nd way 
		UN.sendKeys("Shradha");
	}

}
