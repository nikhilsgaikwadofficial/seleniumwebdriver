package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazePrice {

	public static void main(String[] args) { 
	WebDriver driver=new ChromeDriver();
	driver.get("https://blazedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.manage().window().maximize();
	WebElement drpCntry=driver.findElement(By.xpath("//select[@name='fromPort']"));
	Select drpcountry=new Select(drpCntry);
	drpcountry.selectByValue("Boston");
	WebElement dest=driver.findElement(By.xpath("//select[@name='toPort']"));
	Select destination=new Select(dest);
	destination.selectByIndex(2);
	driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	//int rows=driver.findElements(By.xpath("//table[@class=\"table\"]//tr")).size();
	int rows=driver.findElements(By.tagName("tr")).size();
	System.out.println("Number of rows +" + rows);
	//total no. of columns
	int cols=driver.findElements(By.xpath("//table[@class=\"table\"]//th")).size();
	System.out.println(cols);
	//driver.findElement(By.xpath("//td[normalize-space()='$200.98']"));
	//driver.findElement(By.cssSelector("body > div:nth-child(2) > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)")).click();
	
	}

}
////select[@name='fromPort']