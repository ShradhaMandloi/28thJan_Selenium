package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFromFrameToMainFrameAndParentFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame 
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
	//	d.switchTo().frame("iframeResult");  // second way to switch on frame
	
		d.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(500);
	
		d.switchTo().defaultContent();  // for main frame 
		//d.switchTo().parentFrame();  // for immediate parent frame in nested window case/nested frame case 
	
		d.findElement(By.xpath("//a[@id='menuButton']")).click();
	}

}
