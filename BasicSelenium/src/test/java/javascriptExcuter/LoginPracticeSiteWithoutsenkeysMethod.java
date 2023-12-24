package javascriptExcuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * open the chromeBrowser access practice automation tool login application
 * without sendkeys method
 * 
 */
public class LoginPracticeSiteWithoutsenkeysMethod {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			js.executeScript("window.location=arguments[0]", "https://practicetestautomation.com/practice-test-login/");
			// to find the location of the username textfield
			js.executeScript("document.getElementById(\"username\").value=\"student\";\r\n" + "");
			js.executeScript("document.querySelector(\"[name='password']\").value=\"Password123\";\r\n" + "");
		} catch (Exception e) {
			System.out.println("exception is handled    ---->name of Exception :" + e.getMessage());
			driver.quit();
		}
		js.executeScript("document.querySelector(\"[class='btn']\").click();");
		driver.quit();

		driver.get("https:www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0]",ele);*/
		driver.get("https:www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;

	}
}
