package section2;

import java.time.Duration;
import java.awt.Robot ;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_amazon_search {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.SHIFT,"apple",Keys.NULL,"iphone 15",Keys.ENTER);
		driver.quit();
	}
}
