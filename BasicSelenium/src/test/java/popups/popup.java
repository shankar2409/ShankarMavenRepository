package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
/**
 * open chrome browser
 * access amazon
 * create alert popup
 * handle popup
 */
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.amazon.in/");
		
		
		//to switch access driver level to popup level(default alert,confirmation popup,prompt popup)
		
		//traditional way
		TargetLocator tg=driver.switchTo();
		Alert act=tg.alert();
		//optimized way
		
		
		
		
		//to handle alert popup
		js.executeScript("alert();");
		Alert popup = driver.switchTo().alert();
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		popup.accept();
		
		Thread.sleep(2000);
		
		//to handle confirmation popup
		js.executeScript("confirm();");
		Thread.sleep(2000);
		popup.dismiss();
		Thread.sleep(2000);
		
		
		//to handle prompt popup
		js.executeScript("prompt();");
		Thread.sleep(2000);
		popup.sendKeys("hiii everyone");
		System.out.println(popup.getText());
		Thread.sleep(2000);
		popup.accept();
		
		
	}
}
