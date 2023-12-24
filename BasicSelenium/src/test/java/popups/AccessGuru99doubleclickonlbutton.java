package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * open the chrome browser access guru 99 demo site URL:
 * https://demo.guru99.com/test/simple_context_menu.html double clickon link
 * handle alert popup and print the text
 */
public class AccessGuru99doubleclickonlbutton {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		WebElement doubleclick=driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		
		act.doubleClick(doubleclick);
		js.executeScript("alert();");
		Alert popup=driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
	}
}
