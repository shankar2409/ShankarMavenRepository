package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open the chrome browser
 * acccess internet site
 * URL:https://the-internet-herokuapp.com/basic_auth
 * handle authentication popup
 */
public class AuthenticationPopup {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
}
}
