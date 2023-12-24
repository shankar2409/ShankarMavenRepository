package javascriptExcuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * open chrome browser access amazon without get and navigate method 
 * access flipkart without get and navigate method
 * goback to amazon without navigate method
 * goforward to flipkart without navigate method
 * refresh the webpage without get and navigate method
 * 
 * 
 * goback javascript ---->history.back(0);
 * goforward javascript  ---->history.forward(0);
 * refresh the webpage  --->history.go(0);
 */


public class ForwardBackwardRefreshWithoutNavigateMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.location=arguments[0]","https://www.amazon.in");
	js.executeScript("window.location=arguments[0]","https://www.flipkart.com");
	js.executeScript("history.back(0)");
	js.executeScript("history.forward(0)");
	js.executeScript("history.go(0)");
}
}
