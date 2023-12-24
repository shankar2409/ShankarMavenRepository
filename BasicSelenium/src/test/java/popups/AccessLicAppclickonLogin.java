package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * open chrome browser access lic application click on loginbutton print the
 * text from alert popup click on cancel
 */
public class AccessLicAppclickonLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://licindia.in/apply-now");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("[class='login1']")).click();
		Alert popup=driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.dismiss();
		driver.switchTo().newWindow(WindowType.TAB);
	}
}
