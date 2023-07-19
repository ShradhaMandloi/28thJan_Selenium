package Calender;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver d= new ChromeDriver(op);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		d.manage().window().maximize();
		d.get("https://www.redbus.in/");
	}
}
