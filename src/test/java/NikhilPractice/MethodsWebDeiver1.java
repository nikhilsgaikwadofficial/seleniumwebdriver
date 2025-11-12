package NikhilPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MethodsWebDeiver1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wb=new ChromeDriver();
		
		//GetUrl opens the URL on the browser
		wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//get title () returns the title of current page
		System.out.println(wb.getTitle());		
		
		//Get CurrentUrl() returns Url of the page
		System.out.println(wb.getCurrentUrl());
		
		//getPageSource() -- returns Source of the page
		System.out.println(wb.getPageSource());
		
		//GetWindowHandle() -- returns id of the single browser window
		String windowid=wb.getWindowHandle();
		System.out.println("Window ID: "+windowid); //2CAFC8DB8F3454C505B2A6C24B8B37FA
		
		//GetWidowHAndles returns id's of multiple browser
		
		wb.findElement(By.linkText("OrangeHRM, Inc")).click();//open new Window
		Set<String> windowids=wb.getWindowHandles();
		System.out.println(windowids);
	}

}
