package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowRoot1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/shadow?sublist=0");
	WebElement element = driver.findElement(By.xpath("//form[@class=\"pe-5\"]/child::div/following-sibling::div"));
	SearchContext shadow = element.getShadowRoot();
	shadow.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys("shankar");
	
	WebElement element1=driver.findElement(By.xpath("//form[@class=\"pe-5\"]/child::div/preceding-sibling::div"));
	SearchContext shadow1=element1.getShadowRoot();
	shadow1.findElement(By.cssSelector("[placeholder='Enter your username'i]")).sendKeys("shankar");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	
}
}
