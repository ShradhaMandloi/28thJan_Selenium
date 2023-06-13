package POM_WithPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.policybazaar.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		PBLoginPage login=new PBLoginPage(d);
		login.clickOnPBLoginPageSignIn();
		
		PBMobNumPage mobnum=new PBMobNumPage(d);
		mobnum.inpPBMobNumPage();
		mobnum.clickOnSignInPwd();
		Thread.sleep(2000);
		
		PBPwdPage pwd= new PBPwdPage(d);
		pwd.inpPBPwdPage();
		pwd.clickOnSign();
		Thread.sleep(2000);
		
		PBHomePage myacc= new PBHomePage(d);
		myacc.openDDoptionOfMyAccount();
		Thread.sleep(2000);
		
		PBProfilePage myprofile=new PBProfilePage(d);
		myprofile.switchToChildWindow();
		myprofile.verifyProfilePageFullName();
		Thread.sleep(2000);
		
		d.navigate().back();
		
		PBsignOut signOut=new PBsignOut(d);
		signOut.clickOnSignOut();
		Thread.sleep(2000);
		
		d.quit();
		
	}

}
