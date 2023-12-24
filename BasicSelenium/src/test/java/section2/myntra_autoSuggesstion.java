package section2;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra_autoSuggesstion {
	WebDriver driver;
	List<WebElement> elements;

	
	public void accessApp()
	{
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
	}
	
	public void searchproduct(String searchProducName,String clickSuggestList)
	{
		driver.findElement(By.className("desktop-sea")).sendKeys(searchProducName);
		
		elements=driver.findElements(By.cssSelector("[class*='desktop-suggestion nu']"));
		
		for(WebElement r:elements)
		{
			if(r.getText().contains(clickSuggestList))
			{
				r.click();
			}
		}
	}
	public void printAttributes()
	{
		
	}

}
