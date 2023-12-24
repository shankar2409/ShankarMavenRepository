package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectDropdownOneByOne {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/dropdown.html");
		
		WebElement ele= driver.findElement(By.id("Movies"));
		
		Select se=new Select(ele);
		
		if(se.isMultiple())
		{
			List<WebElement> allopt=se.getOptions();
			for(WebElement r:allopt)
			{
				r.click();
			}
		}
		se.deselectByIndex(0);
		Thread.sleep(2000);
		se.deselectByValue("shan");
		Thread.sleep(2000);
		se.deselectByVisibleText("Kgf");
		Thread.sleep(2000);
		se.deselectAll();
	}
}
