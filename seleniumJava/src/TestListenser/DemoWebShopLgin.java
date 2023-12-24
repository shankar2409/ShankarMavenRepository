package TestListenser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class DemoWebShopLgin {
	@Test
	public void Login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		String expected=driver.findElement(By.linkText("Log in")).getText();
		driver.findElement(By.id("Email")).sendKeys("shankarraman1998@gmail.com");
		driver.findElement(By.id("shan@1234")).sendKeys("shan@1234");
		String actual=driver.findElement(By.partialLinkText("shankarraman")).getText();
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		Assert.assertEquals(expected,actual);
		
	}
}
