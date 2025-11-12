package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimePage {
	WebDriver driver;
	//Constructor
	
	 ActitimePage(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Locators
	 
	 @FindBy(xpath="//input[@placeholder='username']")
	 		WebElement userName_loc;
	 
	 @FindBy(xpath="//input[@placeholder='Password']")
	 WebElement password_loc;
	 
	 @FindBy(xpath="//div[normalize-space()='Login']")
	 WebElement loginbtn_loc;
	 @FindBy(css = "#topnav .label")
	 List<WebElement> tabName_loc;
	 
	 
  /* By userName_loc=By.xpath("//input[@placeholder='Username']");
   By password_loc=By.xpath("//input[@placeholder='Password']");
   By loginbtn_loc=By.xpath("//div[normalize-space()='Login']");
   By tabName=By.cssSelector("#topnav .label");
   */
   //pages action
   
   public void setuserName(String user) {
	   userName_loc.sendKeys(user);
   }
   public void setpassword(String pwd) {
	   password_loc.sendKeys(pwd);
   }
   public void clicklogin() {
	   loginbtn_loc.click();
   }
 public List<String> settabName(){
	 tabName_loc.get(0);
	return null;
 }
	 
}
