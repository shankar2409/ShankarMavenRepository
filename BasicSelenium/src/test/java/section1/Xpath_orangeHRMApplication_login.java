package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_orangeHRMApplication_login {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Access the Oange HRM application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//provide userName
		driver.findElement(By.cssSelector("input[class*='o'][name*='u']")).sendKeys("admin");
		
		//provide password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		Thread.sleep(2000);
		//click login button
		driver.findElement(By.cssSelector("button[class*='o']")).click();
		
		driver.quit();
		
	}

}
