package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownUsingRobotClass {
	public static void main(String[] args) throws AWTException, Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin", Keys.TAB, "admin123", Keys.ENTER);

		driver.findElement(By.cssSelector("[href*='/web/index.php/a']")).click();

		WebElement ele = driver.findElement(By.xpath("//label[.='User Role']//parent::div/following-sibling::div//i"));
		ele.click();

		Robot r = new Robot();
		r.delay(3000);
//		for(int i=0;i<=0/2;i++)
//		{
//			r.keyPress(KeyEvent.VK_DOWN);
//		}
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		driver.quit();
	}
}
