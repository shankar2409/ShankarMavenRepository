package javascriptExcuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

/*open the browser
 * access amazon without get and navigate method
 * if interviewer asked mean 
 * only way to open the application in javascript 
 */
public class accessflipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.location=arguments[0]", "https://www.flipkart.com/");
	}
}