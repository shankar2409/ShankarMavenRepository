package javasele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class multiplebrowsers {
	WebDriver driver=new ChromeDriver();
	@Test(priority=4,dependsOnMethods = "demo1",invocationCount = 1)
	public void demo() {
		
		driver.get("https://www.amazon.in/");
		driver.quit();
	}
	@Test(priority=3,dependsOnMethods = "demo2",invocationCount = 1)
	public void demo1() {
	
		driver.get("https://www.w3schools.com/");
		
	}
	@Test(priority=2,dependsOnMethods = "demo3",invocationCount = 1)
	public void demo2() {
		
		 driver.get("https://www.youtube.com/");
		 
	}
	@Test(priority=1,dependsOnMethods = "demo4",invocationCount = 1)
	public void demo3() {
		
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@Test(priority=0,invocationCount = 1)
	public void demo4() {
		 driver.get("https://www.flipkart.com/");
		
	}
	
}
@Test
 class multiplebrowsers1 {
	WebDriver driver=new ChromeDriver();
	@Test(priority=4,dependsOnMethods = "demo1",invocationCount = 1)
	public void demo() {
		
		driver.get("https://www.amazon.in/");
		driver.quit();
	}
	@Test(priority=3,dependsOnMethods = "demo2",invocationCount = 1)
	public void demo1() {
	
		driver.get("https://www.w3schools.com/");
		
	}
	@Test(priority=2,dependsOnMethods = "demo3",invocationCount = 1)
	public void demo2() {
		
		 driver.get("https://www.youtube.com/");
		 
	}
	@Test(priority=1,dependsOnMethods = "demo4",invocationCount = 1)
	public void demo3() {
		
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@Test(priority=0,invocationCount = 1)
	public void demo4() {
		 driver.get("https://www.flipkart.com/");
		
	}
	
}
