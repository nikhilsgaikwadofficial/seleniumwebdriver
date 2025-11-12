package NikhilPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class MyFirstCase {

	public static void main(String[] args) {
		//ChromeDriver D=new ChromeDriver();
		 WebDriver wb=new ChromeDriver();
		wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String act_title=wb.getTitle();
		System.out.println(wb.getTitle());
		if(act_title.equals("YouTube"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//wb.close();
		 

	}

}
