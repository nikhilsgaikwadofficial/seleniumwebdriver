package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-37ojcbg/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//for UN
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		//for pass
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//login
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//click on userlist
		driver.findElement(By.xpath("//div[normalize-space()='Users']")).click();
		//click on create user
		driver.findElement(By.xpath("//span[normalize-space()='Create New User']")).click();
		//for username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Test Engineer");
		//for pass
		driver.findElement(By.xpath("//input[@name='passwordText'] ")).sendKeys("Nik123");
		//retype
		driver.findElement(By.xpath("//input[@name='passwordTextRetype'] ")).sendKeys("Nik123");
		//for firstname
		driver.findElement(By.xpath("//input[@name='firstName'] ")).sendKeys("Nikhil");
		//lasst
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Gaikwad");
		//for phn
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1256966666");
		//
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		//
		driver.findElement(By.xpath("//select[@name='userGroupId']")).sendKeys("testing");
		//
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//
	String success=	driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
	System.out.println(success);
	//String errormsg=driver.findElement(By.xpath("id=\'ErrorsTable\'")).getText();
	//System.out.println(errormsg);
	}

}
////input[@name='username']
////input[@name='passwordText']  //input[@name='passwordTextRetype']
////input[@name='firstName']
//input[@name='phone']
//input[@name='lastName']
//input[@name='email']
//select[@name='userGroupId']
//input[@type='submit']