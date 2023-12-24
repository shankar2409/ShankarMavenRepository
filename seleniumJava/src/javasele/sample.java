package javasele;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample extends BaseClass{
	
	@Test(priority = 1,invocationCount = 1,threadPoolSize = 2)
	public void login() {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		Reporter.log("shankar");	
		Reporter.log("test class",true);
		
	}

//	@Test(priority = 1,invocationCount = 1)
//	public void login() {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.flipkart.com/");	
//	}
//	@Test(priority = 0,invocationCount = 1,dependsOnMethods = "login")
//	public void register() {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.");	
//		driver.findElement(By.linkText("sfjg")).click();
//	}
}
