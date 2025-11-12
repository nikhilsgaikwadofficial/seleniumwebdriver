package NikhilPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com/register");
		
		//URL myurl=new URL("https://demo.nopcommerce.com/register");
		//driver.navigate().to(myurl);
		
		driver.navigate().to("https://demo.nopcommerce.com/register");
		Thread.sleep(3000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
	}

}
