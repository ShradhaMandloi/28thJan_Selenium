package HandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksFromWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		
	List<WebElement> allinks=	d.findElements(By.xpath("//a"));
	System.out.println(allinks.size());

	for(WebElement s1:allinks) {
		
		System.out.println(s1.getText());
	}
	
	}

}
