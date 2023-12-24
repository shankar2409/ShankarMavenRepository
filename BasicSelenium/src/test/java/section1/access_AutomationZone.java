package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class access_AutomationZone {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		
		 
	String	text=driver.findElement(By.cssSelector("p[class*='cLass'i]")).getText();
	
	System.out.println(text);
	}
}
