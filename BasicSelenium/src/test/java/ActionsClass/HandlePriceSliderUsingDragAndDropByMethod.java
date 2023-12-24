package ActionsClass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlePriceSliderUsingDragAndDropByMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
//		WebElement popup=driver.findElement(By.cssSelector(""
		
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("iphone 15",Keys.ENTER);
		
		WebElement slider=driver.findElement(By.cssSelector("[class=\"_31Kbhn _28DFQy\"]>[class=\"_3FdLqY\"]"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 20, 0).perform();
	}
}
