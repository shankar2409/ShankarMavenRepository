package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * open chrome browser
 * access yantra application
 * handle notification popup
 */
public class HandleNotificationsPopup {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yatra.com/");
		
	}
}
