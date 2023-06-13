package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExOfWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileInputStream file= new FileInputStream("C:\\Users\\DC\\Desktop\\exceldata\\DDF data.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		
				WebDriver d= new ChromeDriver();
				d.manage().window().maximize();
				d.get("https://www.policybazaar.com/");
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				//Click on sign btn from home page
				d.findElement(By.xpath("//a[text()='Sign in']")).click();
		
				//enter mob number
				String mobnum=sh.getRow(0).getCell(0).getStringCellValue();
				d.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(mobnum);
				
				//click on enter password btn
				d.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
				Thread.sleep(2000);
				
				//enter password
				String pwd=sh.getRow(0).getCell(1).getStringCellValue();
				d.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
				
				//click on sign in btn
				d.findElement(By.xpath("//span[text()='Sign in']")).click();
				Thread.sleep(2000);
				
				//open my account dropdown 
				WebElement	A=d.findElement(By.xpath("//div[text()='My Account']"));
				Actions A1=new Actions(d);
				A1.moveToElement(A).perform();
				Thread.sleep(2000);
				
				//click on my profile btn
				d.findElement(By.xpath("//span[text()=' My profile ']")).click();
				Thread.sleep(2000);
				
				//switch to child window
				Set<String> allIds=d.getWindowHandles();
				ArrayList<String> ar= new ArrayList<String>(allIds);
				d.switchTo().window(ar.get(1));
				Thread.sleep(2000);

				//enter full name
				String actText=	d.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
				String expText=sh.getRow(0).getCell(2).getStringCellValue();
				
				if(actText.equals(expText)) {
					System.out.println("TC Pass");
				}
				else {
					System.out.println("TC Fail");
				}
				
				Thread.sleep(2000);
				d.quit();
				
		
	}

}
