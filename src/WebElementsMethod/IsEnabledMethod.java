package WebElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		boolean b=d.findElement(By.xpath("(//button[@type='submit'])[1]")).isEnabled();
		System.out.println(b);
		
		if(b) {
			System.out.println("button is enable");
		}
		else {
			System.out.println("button is disabled");
		}
		
	}

}
