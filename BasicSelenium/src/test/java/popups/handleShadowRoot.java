package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleShadowRoot {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://books-pwakit.appspot.com/explore?q=");
//		js.executeScript("document.querySelector(\"[apptitle='BOOKS']\").shadowRoot.querySelector(\"[effects='waterfall'] app-toolbar[class='toolbar-bottom']>book-input-decorator\").querySelector(\"[slot='input']\").value=\"shankar\"");
		js.executeScript("document.querySelector(\"[apptitle='BOOKS']\").shadowRoot.querySelector(\"[effects='waterfall'] [slot='input']\").value=\"dfgh\";\r\n"
				+ "");
		WebElement element = driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']"));	
		SearchContext shadow = element.getShadowRoot();
		shadow.findElement(By.cssSelector("[effects='waterfall'] [id='input']")).sendKeys("qwertiop[asdfkl");
		}
}
