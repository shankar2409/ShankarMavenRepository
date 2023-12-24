package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countTheNoOfLinksAndImages_AMAZON {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links= driver.findElements(By.xpath("//a|//img"));
		
		int count=0;
		for(WebElement r:links)
		{
			count++;
		}
		System.out.println(count);
		
		int size=links.size();
		System.out.println(size);
	}
}
