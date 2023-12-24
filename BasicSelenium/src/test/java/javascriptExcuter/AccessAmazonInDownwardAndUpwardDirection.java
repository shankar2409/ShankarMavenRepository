package javascriptExcuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open the chrome browser
 * access amazon 
 * perform random scrolling in downward and upward direction
 */
public class AccessAmazonInDownwardAndUpwardDirection {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
		js.executeScript("window.scrollBy(0,1000)" );
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-1000)");
	}
}
