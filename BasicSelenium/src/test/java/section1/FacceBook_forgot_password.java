package section1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacceBook_forgot_password {
	public void facebook()
	{
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//access the application
		driver.get("https://www.amazon.in/");
		
		//fetch the links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		//accessing all the links one by one
		int count=0;
		for(WebElement r:allLinks)
		{
			String link=r.getAttribute("href");
			System.out.println(link);
			count++;
		}
		System.out.println(count);
		
		//access the link using iterator
//		Iterator<WebElement> s1=allLinks.iterator();
//		while(s1.hasNext())
//		{
//		System.out.println(	s1.next());
//		}
//		
	}
	public static void main(String[] args) {
		FacceBook_forgot_password s=new FacceBook_forgot_password();
		
		s.facebook();
	}
}
