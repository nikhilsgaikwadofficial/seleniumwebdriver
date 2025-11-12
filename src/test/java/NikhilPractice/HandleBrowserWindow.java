package NikhilPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		 Set <String> windowIds=driver.getWindowHandles();
		//Approach1
		 List<String> windowlist=new ArrayList(windowIds);
		 
		 String parentid=windowlist.get(0);
		 String childid=windowlist.get(1);		 
		 
		 
		 //switch to childwindowid
		 
		 driver.switchTo().window(childid);
		 System.out.println(driver.getTitle());
		 
		 //parentwindow
		
		 driver.switchTo().window(parentid);
		 System.out.println(driver.getTitle());
		
		 //Approach 2
		for(String windid:windowIds) {
			 String title=driver.switchTo().window(windid).getTitle();
		 if(title.equals("OrangeHRM")) {
			 System.out.println(driver.getCurrentUrl());
		 }
		 }
		
		
	}

}
