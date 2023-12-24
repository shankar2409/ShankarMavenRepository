package javasele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstClass {
	@Test
	public void testGoogle() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("w3schools",Keys.ENTER);
		Reporter.log(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
	@Test
	public void testFacebook() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("w3schools",Keys.ENTER);
		Reporter.log(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
}
