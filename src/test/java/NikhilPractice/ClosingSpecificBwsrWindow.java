package NikhilPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBwsrWindow {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		 Set <String> windowIds=driver.getWindowHandles();
		 for(String windid:windowIds) {
			 String title=driver.switchTo().window(windid).getTitle();
			 System.out.println(title);
			 if(title.equals("OrangeHRM")) {
				 driver.close();
			 }
		 }
	}

}
