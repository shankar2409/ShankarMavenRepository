package javascriptExcuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarTillTheElement {
	static WebElement ele;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15",Keys.ENTER);
		
		
		for(;;)
		{
			try {
				ele=driver.findElement(By.xpath("//span[.='Slate']"));
				
				System.out.println(ele.getText());
			}
			catch (Exception e) {
				js.executeScript("window.scrollBy(0,200)",ele);
			}
		}
	}
}
