package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Close_Quit_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(4000);  //use to close tab after waiting for some few mili second
		 driver.close();
		 //driver.quit();
	}

}
