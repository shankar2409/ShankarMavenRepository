package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger_signoutApp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin", Keys.TAB, "password", Keys.ENTER);

		WebElement ele = driver.findElement(By.cssSelector("[src*='themes/softed/images/us']"));

		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();

		driver.findElement(By.linkText("Sign Out")).click();
		
		WebElement ele1=driver.findElement(By.linkText("Sign Out"));
	
		act.click(ele1).perform();
	}
}
