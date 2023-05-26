package Screenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
	
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File dest= new File("C:\\Users\\DC\\Desktop\\screenshot\\abc.jpg");
		
		FileHandler.copy(src, dest);
	
	}

}
