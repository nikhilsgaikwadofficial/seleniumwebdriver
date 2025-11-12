package TestNg;

import org.testng.annotations.Test;

public class FirstTestCase {
	@Test(priority=1)
	void openapp() {System.out.println("open application....");}
	@Test(priority=2)
	void loginapp() {System.out.println("Login application...");
	}
	@Test(priority=3)
	void logoutapp() {System.out.println("Logout applicatin....");}

}
