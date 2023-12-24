package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("Shankarraman1998@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("9678579576",Keys.ENTER);
		
//		driver.findElement(By.id("loginbutton")).clic
	}
}
