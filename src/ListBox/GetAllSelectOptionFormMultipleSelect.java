package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectOptionFormMultipleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/DC/Desktop/xyz.html");
		
		WebElement Country=d.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s= new Select(Country);
		s.selectByVisibleText("India");
		s.selectByVisibleText("Italy");
		List<WebElement> text=s.getAllSelectedOptions(); //Only get text value of selected option 

		// List<WebElement> text=s.getOptions();  // get all option of list
	
		System.out.println(text.size());
		
		for(WebElement a:text) {
			System.out.println(a.getText());
		}
	}

}
