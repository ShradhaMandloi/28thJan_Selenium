package POM_WithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage {

	@FindBy(xpath ="//input[@name='password']") private WebElement pwd;
	@FindBy(xpath ="//span[text()='Sign in']") private WebElement signIn;
	
	public PBPwdPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	public void inpPBPwdPage() {
		
		pwd.sendKeys("Lokesh@123");
	}
	public void clickOnSign() {
		
		signIn.click();
	}
	
}
