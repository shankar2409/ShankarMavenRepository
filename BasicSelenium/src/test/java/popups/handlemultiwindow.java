package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlemultiwindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("[class='Pke_EE']")).sendKeys("iphone 15",Keys.ENTER);
		driver.findElement(By.xpath("//div[.='APPLE iPhone 15 (Blue, 128 GB)']")).click();
		String parentId=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(parentId.equals(id))
			{
				driver.switchTo().window(id);
			}
		}
//		driver.findElement(By.xpath("//button[.='Read More']")).click();
		
		
	
	}
}
