package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddUser {
	
	    WebDriver driver;
	    Wait wait;

	    @BeforeClass
	    public void setUp(){
	        driver =new ChromeDriver();
	        driver.get("https://kanishkaerp.com/society-management-admin-frontend/#/login");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	    }
	    @Test(priority = 1)
	    public void login() throws InterruptedException {
	        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test.superadmin@ksoftpl.com");
	        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("KSPL@123");
	        driver.findElement(By.xpath("//button[@role='button']")).click();
	        Thread.sleep(5000);
	        Assert.assertEquals(driver.getTitle(),"Society Management");

	    }

	    @Test(priority = 2)
	    public void committeMgmt(){
	        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement committe=driver.findElement(By.xpath("//mat-nav-list[@routerlink='view-user-list']"));
	        WebElement clickCommitte = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(committe));
	        clickCommitte.click();

	        WebElement addUser= driver.findElement(By.xpath("//button[contains(text(), 'Add User')]"));
	        WebElement clickAddUser = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(addUser));
	        clickAddUser.click();
	        String act_user = driver.findElement(By.xpath("//div[@class='top-view-subtitle']")).getText();

	        Assert.assertEquals(act_user,"Add User");
	    }
	    @Test(priority = 3)
	    public void createUser(){
	        WebElement name=driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']"));
	        name.click();
	        name.sendKeys("Nikhil");

	        WebElement email= driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']"));
	        email.click();
	        email.sendKeys("abc@gmail.com");

	        WebElement pwd= driver.findElement(By.xpath("//input[@placeholder='Password']"));
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();",pwd);
	        js.executeScript("arguments[0].value='abc@123';",pwd);

	        WebElement mob=driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No.']"));
	        mob.click();
	        mob.sendKeys("1122334455");

	        WebElement role=driver.findElement(By.xpath("//select[@name='role']"));
	        Select select= new Select(role);
	        select.selectByVisibleText(" Staff ");

	        driver.findElement(By.xpath("//button[text()=' Submit ']"));
	    }


	}
	




