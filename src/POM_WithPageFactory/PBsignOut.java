package POM_WithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBsignOut {

	@FindBy(xpath ="//span[text()='Sign out']") private WebElement signOut;
	
	public PBsignOut(WebDriver d) {
		PageFactory.initElements(d, this);
		
	}
	public void clickOnSignOut() {
		signOut.click();
	}

}
