package NikhilPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1 select specific checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//select multiple checkbox
		
	List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
		
	/*for(WebElement checkbox:checkboxes) {
		checkbox.click();
	}*/
	
	//for(int i=4;i<checkboxes.size();i++) {
		//checkboxes.get(i).click();
	//}
	//for first 3 checkboxes
	/*for(int i=0;i<3;i++) {
		checkboxes.get(i).click();
	}*/
	//5 unselect seleted checkboxes
	
	/*for(int i=0;i<3;i++) {
		checkboxes.get(i).click();
	}
	Thread.sleep(5000);
	
	for(int i=0; i<checkboxes.size();i++) {
		if(checkboxes.get(i).isSelected()) {
		checkboxes.get(i).click();
	}
	}
	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).click();
	WebElement female_rd=driver.findElement(By.xpath("//input[@id='female']"));	
	female_rd.click();
	System.out.println(female_rd.isSelected());
	driver.findElement(By.xpath("//input[@id='input1']")).sendKeys("nikhil");
	driver.findElement(By.xpath("//button[@id='btn1']")).click();
	*/}

}
