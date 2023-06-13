package POMWithDDF;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage1 {
	@FindBy(xpath ="//input[@name='personName']") private WebElement name;
	WebDriver d1;
	
	public PBProfilePage1(WebDriver d) {
		
		PageFactory.initElements(d, this);
		d1=d;
	}
	public void switchToChildWindow() {
		
		Set<String> allIds=d1.getWindowHandles();
		ArrayList<String> ar=new ArrayList<>(allIds);
		d1.switchTo().window(ar.get(1));
	}
	public void verifyProfilePageFullName1(String expname2) {
		
		String accname=name.getAttribute("value");
		
		
		if(accname.equals(expname2)) {
			
			System.out.println("TC Pass");
		}
		else {
			System.out.println("TC Fail");
		}
	}
}
