package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open the chromeBrowser
 * access internet application
 * URL:http://ww1.the-internet-herokuapp.com/
 */
public class SwitchToFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("tinymce"));
		System.out.println(element.getText());
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[.='File']")).click();
	}
}
