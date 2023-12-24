package TestListenser;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("testcase finished");
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("testcase started");	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcase failed");
	}

}
