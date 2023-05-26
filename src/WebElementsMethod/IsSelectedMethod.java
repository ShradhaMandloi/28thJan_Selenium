package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(4000);
		
		WebElement s=d.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		boolean result=s.isSelected();
		System.out.println(result);

//		OR
//		boolean result=d.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
//		System.out.println(result);

		if(result) {
		System.out.println("radio button is selected");
	}
	else {
		System.out.println("radio button is not selected");
	}
		
		
		
	}

}
