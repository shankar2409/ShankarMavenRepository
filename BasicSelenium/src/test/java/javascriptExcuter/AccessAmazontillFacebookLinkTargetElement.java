package javascriptExcuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open chrome browser
 * access amazon
 * scroll the webpage till facebook link
 */
public class AccessAmazontillFacebookLinkTargetElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.location=arguments[0]","https://www.amazon.in/");
	WebElement facebook=driver.findElement(By.xpath("//a[.='Facebook']"));
	
	int y=facebook.getLocation().getY();
	
	js.executeScript("window.scrollBy(0,"+y+");");
	
//	js.executeScript("window.scrollBy(arguments[0].scrollIntoView())", facebook);
}
}
