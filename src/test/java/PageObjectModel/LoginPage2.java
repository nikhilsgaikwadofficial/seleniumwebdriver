package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	WebDriver driver;
	LoginPage2(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Locators
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement UserName_loc1;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password_loc;
	
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn_loc;
	
	//Pages
	public void userName(String user) {
		UserName_loc1.sendKeys(user);;
	}
	public void setPassword(String pwd) {
		password_loc.sendKeys(pwd);;
	}
	public void clicklogin() {
		loginbtn_loc.click();
	}
	
}
