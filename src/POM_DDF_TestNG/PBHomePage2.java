package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage2 {
	@FindBy(xpath ="//div[text()='My Account']" )private WebElement myAcc;
	WebDriver d1;
	
	public PBHomePage2(WebDriver d) {
		
		PageFactory.initElements(d, this);
		d1=d;
	}
	public void openDDoptionOfMyAccount() {
		
		Actions A= new Actions(d1);
		A.moveToElement(myAcc).perform();
	}
	
}
