package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(500);
		WebElement src=	d.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dest=d.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		
		Actions A= new Actions(d);
		A.dragAndDrop(src, dest).perform();
		
	//	A.moveToElement(src).clickAndHold().moveToElement(dest).release().perform();
		
		
		
		
		
	}

}
