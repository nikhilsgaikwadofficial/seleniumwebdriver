package NikhilPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

	public static void main(String[] args) {
		ChromeDriver dv=new ChromeDriver();
		dv.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/");
		String act_title=dv.getTitle();
		if(act_title.equals("OrangeHrm-demo"))
		{ 
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}

}
