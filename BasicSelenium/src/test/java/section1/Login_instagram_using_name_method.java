package section1;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_instagram_using_name_method {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		URL u=new URL("https://www.instagram.com/");
		driver.navigate().to(u);
	//	driver.navigate().to("https://www.instagram.com/");
		
		Thread.sleep(10000);
		
		WebElement ele=driver.findElement(By.name("username"));
		
		ele.sendKeys("9698422141");
		
		
		WebElement ele1=driver.findElement(By.name("password"));
		
		ele1.sendKeys("mallika");
		
		ele1.submit();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}
}
