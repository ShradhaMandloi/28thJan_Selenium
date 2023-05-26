package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/DC/Desktop/xyz.html");
		
		WebElement Country=d.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s= new Select(Country);
		
		s.selectByVisibleText("India");
		s.selectByVisibleText("Italy");
		//s.selectByIndex(0);
	//	s.selectByValue("option2");
		
		Thread.sleep(500);
		//s.deselectByIndex(0);
		//s.deselectByValue("option2");
	    s.deselectByVisibleText("India");
		s.deselectByVisibleText("Italy");
		//s.deselectAll();
	}

}
