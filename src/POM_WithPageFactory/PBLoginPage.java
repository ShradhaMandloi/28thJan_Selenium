package POM_WithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage {
	
	//declaration
	@FindBy(xpath ="//a[text()='Sign in']") private WebElement signIN; ////private WebElement signIN=driver.findElement(By.xpath(""))
	
	//initializtion
	public PBLoginPage(WebDriver d) {
	
		PageFactory.initElements(d, this);  //diffClassName.methodname(webDriver_Object, this_Keyword);
	}
	//usage
	public void clickOnPBLoginPageSignIn() {
		
		signIN.click();
	}
	
	
}
