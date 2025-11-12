package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActitimeTestLogin {
	WebDriver driver;

	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:82/login.do");
		driver.manage().window().maximize();
	}
	@Test
	void login() {
		ActitimePage actpg=new ActitimePage(driver);
		actpg.setuserName("admin");
		actpg.setpassword("manager");
		actpg.clicklogin();
		actpg.settabName();
		
		
	}
	@AfterClass
	void teardown() {
		driver.quit();
	}
	
}
