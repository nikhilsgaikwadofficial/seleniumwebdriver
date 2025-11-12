package NikhilPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://demo.nopcommerce.com/register");
		Driver.manage().window().maximize();
		
		//isDisplayed()
		//WebElement logo=Driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("display status of logo: "+logo.isDisplayed());

		//isEnabled()
	//	boolean status=Driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println("Enable status: " +status);
	
		//isSelected()
		WebElement male_rd=Driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=Driver.findElement(By.xpath("//input[@id='gender-female']"));
	
		System.out.println("Before selection......");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		System.out.println("After selection....");
		male_rd.click();
		
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		boolean newsletterstatus=Driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("newsletter  status :"+newsletterstatus);
		

		
	}

}
