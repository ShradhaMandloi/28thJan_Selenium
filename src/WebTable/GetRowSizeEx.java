package WebTable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetRowSizeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("C:\\Users\\DC\\Desktop\\screenshot/Htmlsample5.html");
//		
//		List<WebElement> allrows=d.findElements(By.xpath("//table[@id='1234']//tr"));
//		int size= allrows.size();
//		System.out.println(size);
		
		int rowsize=d.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println(rowsize);
	}

}
