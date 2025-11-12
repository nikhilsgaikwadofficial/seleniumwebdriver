package NikhilPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("Numbers of rows "+rows);
		int cols=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println("Number of cols"+cols);
		
		//read specific data from row and column
	//String bookName=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText();
	//System.out.println(bookName);
	
	//for all records in the table
/*	for(int r=2;r<=rows;r++) {
		for(int c=1; c<=cols;c++) {
		String value=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
		System.out.println(value);}*/
		
		//for specific author
		for(int r=2;r<=rows;r++) {
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	if(author.equals("Mukesh")) {
		String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//tr[1]")).getText();
		System.out.println(bookName);
	
	}
		
		}
		}
	}
	
	


