package POM_WithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAccPage {

	@FindBy(xpath ="//span[text()=' My profile ']")private WebElement myProfile;
	
	public PBMyAccPage(WebDriver d) {
		
		PageFactory.initElements(d, this);
	}
	public void clickOnMyProfile() {
		
		myProfile.click();
	}
	
	
}
