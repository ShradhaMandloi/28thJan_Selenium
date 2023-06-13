package POMWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage1 {
	@FindBy(xpath ="(//input[@type='number'])[2]") private WebElement mobnum;
	@FindBy(xpath ="(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPwd;

	//second way of initialization of private elements
	
//	 private WebElement mobNum;
//	 private WebElement signInWithPwd;
//	
//	
//	public PBMobNumPage1(WebDriver driver)
//	{
//		mobNum=driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]"));
//		signInWithPwd=driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]"));		
//	}
	
	public PBMobNumPage1(WebDriver d) {
		
		PageFactory.initElements(d, this);
	}
	public void inpPBMobNumPage1(String mobilenum) {
		
		mobnum.sendKeys(mobilenum);
	}
	public void clickOnSignInPwd() {
		signInWithPwd.click();
	}
}
