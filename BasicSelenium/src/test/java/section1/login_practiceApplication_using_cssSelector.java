package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*public class login_practiceApplication_using_cssSelector {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("student");;
		
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("Password123");;
		
		driver.findElement(By.cssSelector("[class*='bt']")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class*='wp-block-button_']")).click();
		
		driver.quit();
		
		
	}
}
*/

public class login_practiceApplication_using_cssSelector {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practicetestautomation.com/practice-test-login/");

		driver.findElement(By.cssSelector("input#username")).sendKeys("student");
		;

		driver.findElement(By.cssSelector("[type='password']")).sendKeys("Password123");
		;

		driver.findElement(By.cssSelector("[class*='bt']")).click();

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[class*='wp-block-button_']")).click();

		driver.quit();
	}
}