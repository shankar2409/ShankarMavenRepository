package section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_autoSugesstion1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("iphone 15");
		
		Thread.sleep(2000);
		
		List<WebElement> elements=driver.findElements(By.cssSelector("[class*='s-suggestion s-s']"));
		
		
		for(WebElement r:elements)
		{
			if(r.getText().equals(" pro max"))
			{
				r.click();
				break;
			}
		}
		
	
		
	}
}
