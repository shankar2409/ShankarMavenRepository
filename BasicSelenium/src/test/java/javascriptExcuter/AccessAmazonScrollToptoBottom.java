package javascriptExcuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open the browser
 * access amazon
 * scroll the window end of the webPage
 * scroll the window top of the webPage
 */
public class AccessAmazonScrollToptoBottom {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.location=arguments[0]","https://www.amazon.in/");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBY(0.-document.body.scrollByHeight)");
	}
}
