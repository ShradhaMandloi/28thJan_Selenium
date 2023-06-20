package POM_DDF_TestNG_BaseClass_UtilityClass;

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

public class PBLoginTest3 extends BaseClass_ToOpenBrowser{

	int a;
	PBLoginPage3 login;
	PBMobNumPage3 mobNum;
	PBPwdPage3 pwd;
	PBHomePage3 home;
	PBMyAccPage3 myAcc;
	PBProfilePage3 myprofile;
	// WebDriver d;
	Sheet sh;
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException {
		
		
//		FileInputStream file= new FileInputStream("C:\\Users\\DC\\Desktop\\exceldata\\DDF data.xlsx");
//		Sheet sh= WorkbookFactory.create(file).getSheet("DDF");
		
//		d= new ChromeDriver();
//		d.manage().window().maximize();
//		d.get("https://www.policybazaar.com/");
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
		
		initializeBrowser();
		
		 login=new PBLoginPage3(d);
		 mobNum=new PBMobNumPage3(d);
		 pwd= new PBPwdPage3(d);
		 home= new PBHomePage3(d);
		 myAcc=new PBMyAccPage3(d);
		 myprofile=new PBProfilePage3(d);
		 a=10;                      //locally initailize
		
	}
	@BeforeMethod
	public void LoginApp() throws InterruptedException, EncryptedDocumentException, IOException {
	
		System.out.println(a);
		login.clickOnPBLoginPageSignIn();
		mobNum.inpPBMobNumPage1(UtilityClass_ToGetdataFromExcelsheet.getTestData(0, 0));
		mobNum.clickOnSignInPwd();
		pwd.inpPBPwdPage1(UtilityClass_ToGetdataFromExcelsheet.getTestData(0, 1));
		pwd.clickOnSign();
		Thread.sleep(2000);
		
		
	}
	@Test
	public void VerifyFullName() throws InterruptedException, EncryptedDocumentException, IOException {
		home.openDDoptionOfMyAccount();
		Thread.sleep(2000);
		myAcc.clickPBMyAccPageMyProfile();
		myprofile.switchToChildWindow();
		//profile.verifyPBProfilePageFullName(sh.getRow(0).getCell(2).getStringCellValue());
		
		String actresult=myprofile.getPBProfilePagefullName();
		String expresult=UtilityClass_ToGetdataFromExcelsheet.getTestData(0, 2);
		Assert.assertEquals(actresult, expresult,"Failed: both results are different");
		
		
	}
	
	@AfterMethod
	public void LogoutApp() {
	
		myAcc.clickPBMyAccPageSignOut();
	
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
	
		Thread.sleep(2000);
		d.quit();
	
	}
	
}
