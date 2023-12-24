package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropUsingClickAndHoldMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		
		WebElement ele= driver.findElement(By.id("draggable"));
		Actions act=new Actions(driver);
		act.clickAndHold(ele).perform();
		WebElement drop=driver.findElement(By.id("droppable"));
		act.release(drop).perform();
	}
}
