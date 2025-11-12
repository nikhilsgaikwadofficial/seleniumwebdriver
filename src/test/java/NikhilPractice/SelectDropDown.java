package NikhilPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select drop down
	WebElement	drpCntryEele=driver.findElement(By.xpath("//select[@id='country']"));
	Select drpcountry=new Select(drpCntryEele);
	
	drpcountry.selectByVisibleText("France");
	Thread.sleep(2000);
	drpcountry.selectByValue("canada");
	Thread.sleep(2000);
	drpcountry.selectByIndex(5);	
	
	// capture all dropdown option
List<WebElement> option=drpcountry.getOptions();
System.out.println("Numbers of dropdown " +option.size());	
	//printing the option
for(int i=0;i<option.size();i++) {
	System.out.println(option.get(i).getText());
}

	}

}
