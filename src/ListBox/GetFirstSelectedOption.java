package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement month=d.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(month);
//		WebElement s1=s.getFirstSelectedOption();
//		String text= s1.getText();
//		System.out.println(text);
		
		String text=s.getFirstSelectedOption().getText();
		System.out.println(text);
	
	}

}
