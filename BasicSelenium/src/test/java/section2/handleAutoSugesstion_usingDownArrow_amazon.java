package section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAutoSugesstion_usingDownArrow_amazon {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.name("twotabsearchtextbox")).sendKeys("iphone");
		Robot r=new Robot();
		
		r.delay(1000);
		
		for(int i=0;i<3;i++)
		{
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
