package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	void testTitle() {
		String Exp_title="Opencart";
		String Act_title="Opencart";
		
		/*if(Exp_title.equals(Act_title)) {
			System.out.println("test passed");
		}
		else {
			System.out.println("Test failed");
		}*/
		
		//Assert.assertEquals(Exp_title, Act_title);
		if(Exp_title.equals(Act_title)) {
        Assert.assertTrue(true);
}
	else {
		System.out.println("Test failed");
		Assert.assertTrue(false);
	}
	}

}
