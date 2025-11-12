package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 {
	@BeforeMethod
	void login() {
		System.out.println("this is login");
	}
	@Test(priority=1)
	void search() {
		System.out.println("this is search");
	}
	@AfterMethod
	void logout() {
		System.out.println("this is logout ");
	}
	
	@Test(priority=2)
	void AdvSearch() {System.out.println("this is Advn Search");}

}
