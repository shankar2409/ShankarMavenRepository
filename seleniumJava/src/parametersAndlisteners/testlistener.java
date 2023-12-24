package parametersAndlisteners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class testlistener implements ITestListener {
	WebDriver driver;
	@Override
	public void onTestFailure(ITestResult result) {
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File desinations=new File("./seleniumJava/screenshots");
//		try {
//			Files.copy(source, desinations);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		Reporter.log("test execution failed");
	}

	@Override
	public void onStart(ITestContext context) {
	Reporter.log("test excution started");
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("test excution Finished");
	}
	
}
