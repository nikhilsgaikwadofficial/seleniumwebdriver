package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	WebElement drpcntry=	driver.findElement(By.xpath("//select[@id='country']"));
		Select s=new Select(drpcntry);
		
		s.selectByVisibleText("United Kingdom");
		Thread.sleep(2000);
		s.selectByValue("canada");
		Thread.sleep(2000);
		s.selectByIndex(6);
		
		//select all option
	List<WebElement> option=s.getOptions();
	System.out.println("Number of option"+ option.size());
	for(int i=0; i<option.size(); i++) {
		System.out.println(option.get(i).getText());
	}
	}

}
