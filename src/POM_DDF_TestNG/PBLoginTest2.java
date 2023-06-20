package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest2 {

	int a;
	PBLoginPage2 login;
	PBMobNumPage2 mobNum;
	PBPwdPage2 pwd;
	PBHomePage2 home;
	PBMyAccPage2 myAcc;
	PBProfilePage2 myprofile;
	WebDriver d;
	Sheet sh;
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException {
		
		FileInputStream file= new FileInputStream("C:\\Users\\DC\\Desktop\\exceldata\\DDF data.xlsx");
		sh= WorkbookFactory.create(file).getSheet("DDF");
		
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.policybazaar.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
		 login=new PBLoginPage2(d);
		 mobNum=new PBMobNumPage2(d);
		 pwd= new PBPwdPage2(d);
		 home= new PBHomePage2(d);
		 myAcc=new PBMyAccPage2(d);
		 myprofile=new PBProfilePage2(d);
		 a=10;                      //locally initailize
		
	}
	@BeforeMethod
	public void LoginApp() throws InterruptedException {
	
		System.out.println(a);
		login.clickOnPBLoginPageSignIn();
		mobNum.inpPBMobNumPage1(sh.getRow(0).getCell(0).getStringCellValue());
		mobNum.clickOnSignInPwd();
		pwd.inpPBPwdPage1(sh.getRow(0).getCell(1).getStringCellValue());
		pwd.clickOnSign();
		Thread.sleep(2000);
		
		
	}
	@Test
	public void VerifyFullName() throws InterruptedException {
		home.openDDoptionOfMyAccount();
		Thread.sleep(2000);
		myAcc.clickPBMyAccPageMyProfile();
		myprofile.switchToChildWindow();
		//profile.verifyPBProfilePageFullName(sh.getRow(0).getCell(2).getStringCellValue());
		
		String actresult=myprofile.getPBProfilePagefullName();
		String expresult=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actresult, expresult,"Failed: both results are different");
		Thread.sleep(4000);
		
	}
	
	@AfterMethod
	public void LogoutApp() {
		myprofile.switchToChildWindow1();
		myAcc.clickPBMyAccPageSignOut();

	
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
	
		Thread.sleep(2000);
		d.quit();
	
	}
	
}
