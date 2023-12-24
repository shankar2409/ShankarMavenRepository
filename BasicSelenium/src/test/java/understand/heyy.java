package understand;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*open the amazon browser
 * maximize the window
 * access amazon
 * login 
*/
public class heyy {
	public static void main(String[] args) throws Throwable {
		File f=new File("E://selenium//understand.txt");
		FileOutputStream fout=new FileOutputStream(f);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("[class=\"nav-line-2 \"]")).click();
		
		WebElement emailtext=driver.findElement(By.cssSelector("[class=\"a-input-text a-span12 auth-autofocus auth-required-field\"]"));
		emailtext.sendKeys("9698422141");
		emailtext.submit();
		
		driver.findElement(By.cssSelector("[name*='pa']")).sendKeys("12345678");
		
		driver.findElement(By.cssSelector("[id*=\"signI\"]")).submit();
		
		System.out.println("windowHandle id  :"+driver.getWindowHandle());
		
		System.out.println("windowHandles id  :"+driver.getWindowHandles());
		
		System.out.println("get the title  :"+driver.getTitle());
		
		System.out.println("get the current url :"+driver.getCurrentUrl());
		System.out.println("get the page source of the webpage :"+driver.getPageSource());
//		driver.switchTo()
		
	
		
		
	}
}
