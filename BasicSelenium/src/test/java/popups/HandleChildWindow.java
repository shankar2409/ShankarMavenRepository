package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open the chrome browser
 * access lic india application
 * click on login Then click on 'ok' popup
 * pass the USERID
 */
public class HandleChildWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://licindia.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://licindia.in/");
		
		driver.findElement(By.cssSelector("[class='login1']")).click();
		Alert popup = driver.switchTo().alert();
		popup.accept();
		String parentId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			if (!(parentId.equals(id))) {
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.id("da_textfield-1157-inputEl")).sendKeys("9698422141", Keys.TAB, "shankar123",
				Keys.ENTER);
		
	}
}
