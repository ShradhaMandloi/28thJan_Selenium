package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleSelectForMultipleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/DC/Desktop/xyz.html");
		
		WebElement Country=d.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s= new Select(Country);
		boolean result=s.isMultiple();
		System.out.println(result);
		
		if(result) {
			System.out.println("List box is multiple select table");
		}
		else {
			System.out.println("List box is single select table");
		}
	}

}
