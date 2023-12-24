package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelect_open_flipkart {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		WebElement ele1= driver.findElement(By.cssSelector("[class*='30XB9F']"));
		if(ele1.isDisplayed())
		{
			ele1.click();
		}
		
		WebElement ele=driver.findElement(By.cssSelector("[class*=\"Pk\"]"));
		ele.sendKeys("iphone 15");
		driver.findElement(By.cssSelector("[class='_2iLD__']")).submit();
		
		driver.findElement(By.cssSelector("[src*='https://rukminim2.flixcart.com/fk-p-flap/50/50/image/d8']")).click();
		driver.quit();
	}

}
