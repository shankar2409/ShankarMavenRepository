package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerSignoutusingActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin", Keys.TAB, "password", Keys.ENTER);

		WebElement ele = driver.findElement(By.cssSelector("[src*='themes/softed/images/us']"));
		WebElement signout=driver.findElement(By.xpath("//a[.='Sign Out']"));
	
		Actions act = new Actions(driver);
		act.moveToElement(ele).click(signout).build().perform();
		
	}
}
