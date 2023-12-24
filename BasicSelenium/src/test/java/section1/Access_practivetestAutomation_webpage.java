package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access_practivetestAutomation_webpage {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("Password123");
		
		Thread.sleep(3000);
		driver.findElement(By.className("btn")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
	}

}
