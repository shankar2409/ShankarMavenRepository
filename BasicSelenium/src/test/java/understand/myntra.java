package understand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.cssSelector("[class='desktop-searchBar']")).sendKeys("mobile cases");
		driver.findElement(By.xpath("//a[contains(@class,'desktop-s')]")).click();
	}
}
