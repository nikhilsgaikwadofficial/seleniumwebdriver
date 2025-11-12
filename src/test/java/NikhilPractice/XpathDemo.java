package NikhilPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
	
      WebDriver dv=new ChromeDriver();
      dv.get("https://eclipse-javadoc:%E2%98%82=seleniumwebdriver/C:%5C/Users%5C/LENOVO%5C/.m2%5C/repository%5C/org%5C/seleniumhq%5C/selenium%5C/selenium-chrome-driver%5C/4.32.0%5C/selenium-chrome-driver-4.32.0.jar=/maven.pomderived=/true=/=/maven.groupId=/org.seleniumhq.selenium=/=/maven.artifactId=/selenium-chrome-driver=/=/maven.version=/4.32.0=/=/maven.scope=/compile=/=/maven.pomderived=/true=/%3Corgdemo.opencart.com/");
      dv.manage().window().maximize();
      
	}

}
