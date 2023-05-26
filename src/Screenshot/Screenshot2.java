package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		String RS=RandomString.make(2);
	
		File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		File dest= new File("C:\\Users\\DC\\Desktop\\screenshot\\image"+RS+".jpg");
		
		FileHandler.copy(src, dest);
		
	}

}
