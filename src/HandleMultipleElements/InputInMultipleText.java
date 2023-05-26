package HandleMultipleElements;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputInMultipleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d= new ChromeDriver();
		d.get("file:///C:/Users/DC/Desktop/abc.html");
		
		List<WebElement>	MultipleCheckbox=d.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement s1:MultipleCheckbox) {
			
			s1.click();
			Thread.sleep(500);
	
		}
		
		List<WebElement> MultipleInputs=d.findElements(By.xpath("//input[@type='text']"));
		System.out.println(MultipleInputs.size());
	
		String a[]= {"Lokesh","Shradha"};
		for(int i=0; i<=a.length-1;i++) {
		
			WebElement A=MultipleInputs.get(i);
			A.sendKeys(a[i]);
			Thread.sleep(500);
	}
	
	
	}

}
