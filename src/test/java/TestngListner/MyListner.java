package TestngListner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener
{   
	public void onStart(ITestContext context) {
		System.out.println("Test excetuion started.......");
	}
		public void onTestStart(ITestResult result) {
			System.out.println("Tests started.....");
			
			
		}
	public	void onTestSuccess(ITestResult result) {
		System.out.println("test Passed...");
		
	}
	public void onTesFailure(ITestResult result) {
		System.out.println("Test failed...");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped...");
	}
	
	public void onTestFinish(ITestContext context) {
		System.out.println("Test finished....");
		
	}
	
	
	
	
}
