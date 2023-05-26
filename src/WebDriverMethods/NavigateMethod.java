package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
	//	d.get("https://www.flipkart.com/");
		
		d.navigate().to("https://www.flipkart.com/");   //also open to browser but diff is it has some additional features 
		Thread.sleep(2000);
		d.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().refresh();



	}

}
