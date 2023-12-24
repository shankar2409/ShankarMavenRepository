package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Iphone {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
		
		
		WebElement element=driver.findElement(By.id("data-csa-c-slot-id=\"nav_cs_4\""));
		
		element.sendKeys("iphone 15");
		
		element=driver.findElement(By.id("nav-search-submit-button"));
		
		element.click();
		
	}

}
