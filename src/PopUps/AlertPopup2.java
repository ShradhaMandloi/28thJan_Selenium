package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup2 {         // switch only only time to alert interface

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/delete_customer.php");
		
		d.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
		d.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt=d.switchTo().alert();
	
		//1.gettext from alert popup
		String text=alt.getText();   //gettext method of alert interface 
		System.out.println(text);
		
		
//		//2. click on cancel button of alert popup
//		alt.dismiss();     //dismiss method of alert interface
		
		//3. click on ok button of 1st alert popup
		alt.accept();
		
		Thread.sleep(2000);
		
		//4.click on ok button of 2nd alert popup
		String text1=alt.getText();   //gettext method of alert interface 
		System.out.println(text1);
		
		alt.accept();
		
		
		
	}

}
