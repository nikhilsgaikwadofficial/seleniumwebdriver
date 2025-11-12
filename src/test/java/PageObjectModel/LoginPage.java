package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	//constructor
	WebDriver driver;
	LoginPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	//locators

		By UserName_loc=By.xpath("//input[@placeholder='Username']");
		By password_loc=By.xpath("//input[@placeholder='Password']");
		By loginbtn_loc=By.xpath("//button[normalize-space()='Login']");
		//By search_loc=By.xpath("//input[@placeholder='Search']");
	
	//page
		public void userName(String user) {
			driver.findElement(UserName_loc).sendKeys(user);;
		}
		public void setPassword(String pwd) {
			driver.findElement(password_loc);
		}
		public void clicklogin() {
			driver.findElement(loginbtn_loc).click();
		}
	/*	public void search() {
			driver.findElement(search_loc);
		}*/
}
