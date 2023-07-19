package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataFromTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("C:\\Users\\DC\\Desktop\\screenshot/Htmlsample5.html");
		
		String text=d.findElement(By.xpath("//table[@id='1234']//tr[2]/td[2]")).getText();
		System.out.println(text);
		
		String text1=d.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]")).getText();
		System.out.println(text1);
		
		//for header
		String text2=d.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
		System.out.println(text2);
		
	}

}
