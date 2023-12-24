package section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_the_Links_count {
	WebDriver driver;
	public void AccessInstagram(){
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		int count=0;
		
		List<WebElement> wb=driver.findElements(By.tagName("a"));
		
		for(WebElement e:wb)
		{
			String s=e.getAttribute("href");
			count++;
			
		}
		System.out.println(count);
		driver.quit();
		
	}
	public static void main(String[] args)
	{
		Find_the_Links_count d=new Find_the_Links_count();
		d.AccessInstagram();
	}
}
