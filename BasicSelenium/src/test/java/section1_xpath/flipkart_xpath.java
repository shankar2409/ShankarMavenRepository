package section1_xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_xpath {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//div[@class='_2SmNnR']/input")).sendKeys("iphone 15");
}
}
////li[@class='linked-list__item  has-children ']/descendant::button[@class='linked-list__dropdown-label js-dropdown-btn']