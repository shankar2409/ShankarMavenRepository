package javascriptExcuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * open the chromebrowser
 * access amazon
 * search iphone 15
 * scroll upto "slate" element in filters options
 */
public class AccessAmazonTillTheElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15",Keys.ENTER);
		WebElement location=driver.findElement(By.xpath("//span[.='Slate']"));
		
		int loc=location.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+loc+")");
		
	}
}
