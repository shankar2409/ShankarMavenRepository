package popups;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open the chromebrowser
 * open new tab using newWindow method
 * access flipkart
 * open a new tab usoing javascript 
 * access youtube
 */
public class openNewTabUsingJSandNewWindow {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https:/www.naukri.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https:www.flipkart.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("open('https://www.youtube.com/')");
}
}
