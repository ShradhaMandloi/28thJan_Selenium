package WebDriverMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class MaximizeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		d.manage().window().maximize();
//				Options s=d.manage();
//				Window s2= s.window();
//				s2.maximize();
				
		
	}

}
