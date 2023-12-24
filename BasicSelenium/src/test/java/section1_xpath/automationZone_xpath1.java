package section1_xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationZone_xpath1 {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		
		System.out.println(driver.findElement(By.xpath("//p[@id='a' and @name='a']")).getText());
		
		System.out.println(driver.findElement(By.xpath("(//p[@id='b'])[1]")).getText());
		
		System.out.println(driver.findElement(By.xpath("(//p[@name='b'])[last()]")).getText());
		
		System.out.println(driver.findElement(By.xpath("(//p[@name='b'])[position()=1]")).getText());
		
		
		
	//	   
		
		
//		driver.findElement(By.xpath(""))
		driver.quit();
	}
}
