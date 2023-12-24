package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
 * open the chrome browser 
 * access selenium website
 * URL:https://selenium08.blogspot.com/2019/11/selenium-iframe.html
 * click on 'free mock test'
 * handle notification popup
 * pass the phone number.
 */
public class assignment {
		public static void main(String[] args) throws shankarException {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
			WebElement frame = driver.findElement(By.cssSelector("[name='iframe_a']"));
//			[name='iframe_a']
			driver.switchTo().frame(frame);
			driver.findElement(By.xpath("//div[@class='td-a-rec td-a-rec-id-header  ']/descendant::a[text()='Free Mock Tests']")).click();
//			String parentId = driver.getWindowHandle();
			Set<String> allId = driver.getWindowHandles();
			for(String id:allId)
			{
				String Url=driver.switchTo().window(id).getCurrentUrl();
				if(Url.contains("freshersnow"))
				{
					break;
				}
			}
//			driver.switchTo().alert().accept();
			
			try {
				driver.switchTo().alert().accept();
			}
			catch(Exception e)
			{
				System.out.println(new  shankarException("you should weather the notification is displayed"));
			}
			driver.findElement(By.cssSelector("[type='number']")).sendKeys("9692212791",Keys.ENTER);
		}
	
}
class shankarException extends Exception{
	
	//private static final long serialVersionUID = 1L;
	public shankarException() {
	}
	/**
	 * it is a coustomized exception
	 */
	shankarException(String s)
	{
		super(s);
	}
}

