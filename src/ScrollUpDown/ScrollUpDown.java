package ScrollUpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		//step 1= scroll down
		((JavascriptExecutor)d).executeScript("window.scrollBy(0,350)");
		
		Thread.sleep(2000);
		//step2= scroll up
		((JavascriptExecutor)d).executeScript("window.scrollBy(0,-100)");
		
//		//step 3= scroll right
//		((JavascriptExecutor)d).executeScript("window.scrollBy(100,0)");
//		
//		//step4= scroll left
//		((JavascriptExecutor)d).executeScript("window.scrollBy(-50,0)");
	}

}
