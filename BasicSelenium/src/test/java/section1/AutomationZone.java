package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationZone {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		
//		System.out.println(driver.findElement(By.cssSelector("p[name=\"a\"]")).getText());\
		
		System.out.println(driver.findElement(By.cssSelector("[name='a'][id='a']")).getText());
	
		driver.quit();
	}

}
