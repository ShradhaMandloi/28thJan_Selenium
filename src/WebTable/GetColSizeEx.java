package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetColSizeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/DC/Desktop/Htmlsample5.html");
		
		int colsize=d.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println(colsize);
		
		//for header size
		int hedsize=d.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		System.out.println(hedsize);
		
	}	
}
