package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Play_youtube_video {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.cssSelector("[name*='sear']")).sendKeys("master song");
		
		driver.findElement(By.cssSelector("[id*='search-icon-']")).click();
	}
}
