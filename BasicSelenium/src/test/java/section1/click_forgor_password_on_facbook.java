package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_forgor_password_on_facbook {
	public void faceBook() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(4000);
		
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		WebElement element= driver.findElement(By.partialLinkText("Forgotten"));
		
		String tagName=element.getTagName();
		System.out.println(tagName);
		
		String attribute=element.getAttribute("href");
		System.out.println(attribute);
		
		String text=element.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}
}
