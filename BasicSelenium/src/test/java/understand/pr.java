package understand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pr {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/books?pagesize=12");
		Thread.sleep(10000);
		WebElement ele1=driver.findElement(By.id("products-orderby"));
		Select se1=new Select(ele1);
		se1.selectByVisibleText("Created on");
		
		WebElement ele = driver.findElement(By.cssSelector("[id='products-pagesize']"));
		Select se = new Select(ele);
		se.selectByIndex(1);
		
	}
}
