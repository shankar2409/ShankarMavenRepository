package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open the browser
 * open new window licindia
 * again new window hdfcindia
 */
public class SwitchTheNewWindow {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.licindia.in/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.hdfcbank.com");
}
}
