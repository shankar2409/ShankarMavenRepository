package javascriptExcuter;
/**
 * open the browser
 * access the amazon application
 * search the iphone 15 without sendkeys method
 */
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchIphone15withoutSedKeysMethod {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.amazon.in/");
		//document.getElementById("twotabsearchtextbox").value="iphone 15"
//		document.getElementById("nav-search-submit-button").click();
		js.executeScript("document.getElementById(\"twotabsearchtextbox\").value=\"iphone 15\"");
		Thread.sleep(2000);
		js.executeScript("document.getElementById(\"nav-search-submit-button\").click();");
		driver.quit();
	}
}
