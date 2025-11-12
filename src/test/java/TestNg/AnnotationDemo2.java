package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	@BeforeClass
	void login() {
		System.out.println("this is login");
	}
	@AfterClass
	void logout() {
		System.out.println("this is logout ");
	}
@Test
	void search() {
		System.out.println("this is search");
	}
	@Test
	void AdvSearch() {System.out.println("this is Advn Search");}

	}

