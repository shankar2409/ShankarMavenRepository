package vtiger;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Vtiger {
	WebDriver driver;

	public void AccessApp() {
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Access App
		driver.get("http://localhost:8888/");
	}

	/**
	 * using this method, able to login to Vtiger application
	 */
	public void login() {
		driver.findElement(By.cssSelector("[name='user_name']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[contains(@name,'user_password')]")).sendKeys("password");

		driver.findElement(By.cssSelector("input#submitButton")).click();
	}
	public void createOrganization()
	{
		//enter the textfield data
//		
		
		  driver.findElement(By.xpath("//a[contains(@href,'index.php?mo') and contains(.,'Org')]")).click();
		  
		  driver.findElement(By.xpath("//a[contains(@href,'index.php?module=Accounts&action=EditView&ret')]")).click();
		  
		  driver.findElement(By.cssSelector("[class='detailedViewTextBox'][name='accountname']")).sendKeys("shankar");
		  
		 driver.findElement(By.cssSelector("[title='Save [Alt+S]']")).click();
		 
		 
		  
	
	}
}

public class Create_Oraganisation {
	public static void main(String[] args) {
		Vtiger v = new Vtiger();
	
		v.AccessApp();
		v.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		v.login();
		v.createOrganization();
		
		v.driver.quit();
	}
}