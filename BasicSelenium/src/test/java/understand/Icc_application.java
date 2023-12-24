package understand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icc_application {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.icc-cricket.com/live-cricket/mens-results");
		
		driver.findElement(By.xpath("//nav[contains(@id,'m') and contains(.,'T')]")).click();
	}
}
