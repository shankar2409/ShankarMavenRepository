package section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prouctName_price {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[text()='✕']")).click();

		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone15");

		driver.findElement(By.xpath("//button[contains(@class,'LD')]")).click();

		List<WebElement> names = driver.findElements(By.xpath("//div[contains(@class,'rR')]"));
		
		List<WebElement> prices=driver.findElements(By.xpath("//div[contains(@class,'WH')]"));
		
		for(int i=0;i<=names.size()-1;i++)
		{
			String name=names.get(i).getText();
			String price=prices.get(i).getText();
			
			String result=name+"---->"+price;
			
			System.out.println(result);
		}

	}

}
