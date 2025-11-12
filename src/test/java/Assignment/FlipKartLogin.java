package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartLogin {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.flipkart.com");
	        
	       // driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
	        //driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	     

	    
	     driver.findElement(By.name("q")).sendKeys("iPhone 16 Pro Max");
	        driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
	        
	        String text=driver.findElement(By.xpath("//span[normalize-space()='Page 1 of 2']")).getText();

	       // text.substring((text.indexof(""))
	        Thread.sleep(3000); // wait for results to load

	   
	    
	}

}
//span[normalize-space()='Page 1 of 2']