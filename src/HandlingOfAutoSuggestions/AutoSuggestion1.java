package HandlingOfAutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		
		d.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(500);
		
		List<WebElement> Alloptions=d.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		String ExpText="redmi note 10";
		for(WebElement A :Alloptions){
			
		String ActText=A.getText();
		if(ActText.equals(ExpText))
		{
			A.click();
			break;
		}
		}
		
	}

}
