package TestNg.pack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class C2 {
	@Test
	void xyz() {
		System.out.println("this is xyz from c2");
	}
	@AfterMethod
void at() {System.out.println("this is After method....");}
}
