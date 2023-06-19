package POMWithDDF;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import POM_WithPageFactory.PBHomePage;
//import POM_WithPageFactory.PBLoginPage;
//import POM_WithPageFactory.PBMobNumPage;
//import POM_WithPageFactory.PBProfilePage;
//import POM_WithPageFactory.PBPwdPage;
//import POM_WithPageFactory.PBsignOut;

public class PBLoginTest1 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file= new FileInputStream("C:\\Users\\DC\\Desktop\\exceldata\\DDF data.xlsx");
		Sheet sh= WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.policybazaar.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage1 login=new PBLoginPage1(d);
		login.clickOnPBLoginPageSignIn();
		
		PBMobNumPage1 mobNum=new PBMobNumPage1(d);
		
		String mobilenum=sh.getRow(0).getCell(0).getStringCellValue();
		mobNum.inpPBMobNumPage1(mobilenum);
		mobNum.clickOnSignInPwd();
		Thread.sleep(2000);
		
		PBPwdPage1 pwd= new PBPwdPage1(d);
		
		String password=sh.getRow(0).getCell(1).getStringCellValue();
		pwd.inpPBPwdPage1(password);
		pwd.clickOnSign();
		Thread.sleep(2000);
		
		PBHomePage1 myacc= new PBHomePage1(d);
		
		myacc.openDDoptionOfMyAccount();
		Thread.sleep(2000);
		
		PBMyAccPage1 myAcc=new PBMyAccPage1(d);
		myAcc.clickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		
		PBProfilePage1 myprofile=new PBProfilePage1(d);
		myprofile.switchToChildWindow();
		
		String expname2=sh.getRow(0).getCell(2).getStringCellValue();
		myprofile.verifyProfilePageFullName1(expname2);
		Thread.sleep(2000);
		
		d.navigate().back();
		
//		PBsignOut signOut=new PBsignOut(d);
//		signOut.clickOnSignOut();
		Thread.sleep(2000);
		
		d.quit();
		
	}
}
