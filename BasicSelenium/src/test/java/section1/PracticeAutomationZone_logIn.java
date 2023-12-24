package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomationZone_logIn {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// access
		driver.get("https://practicetestautomation.com/practice-test-login/");

		// login username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");

		// login password
		WebElement ele = driver.findElement(By.xpath("//input[@name='password']"));
	ele.sendKeys("Password123");
//		ele.submit();

		// submit
//		driver.findElement(By.xpath("//button[@class='btn']")).click();
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		driver.findElement(By.xpath("//button[contains(@id,'submit')]")).click();

//		driver.quit();
	//button[text()=
		
		

	}
}
