package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open chrome browser
 * access inter application
 * URL: https://the-internet.herokuapp.com/javascript_alerts
 * click on "click for js prompt"
 * handle prompt popup
 * 
 */
public class internetappHandlePromptPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement ele = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
		ele.click();
		Alert popup = driver.switchTo().alert();
		popup.sendKeys("i am a software engineer");
		System.out.println(popup.getText());
		popup.accept();
		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());
		driver.quit();

	}
}
