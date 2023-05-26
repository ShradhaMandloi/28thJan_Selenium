package HandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("file:///C:/Users/DC/Desktop/abc.html");
		
	List<WebElement>MultipleCheckbox=d.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(MultipleCheckbox.size());
	
//	for(WebElement s1:MultipleCheckbox) {
//		
//		s1.click();
//		Thread.sleep(500);
//
//	}
	for(int i=0;i<=2;i++) {
		
		MultipleCheckbox.get(i).click();
	}
		
		
	}

}
