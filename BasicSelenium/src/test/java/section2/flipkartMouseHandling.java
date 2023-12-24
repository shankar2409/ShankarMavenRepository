package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartMouseHandling {
	WebDriver driver;
	Actions act;
	public void access(String URL) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
	}
	public void handlePopUP()
	{
		driver.findElement(By.cssSelector("[class*='XB']")).click();
		
	}
	public void clickFashionModule()
	{
		WebElement ele= driver.findElement(By.cssSelector("[aria-label='Fashion']"));
		act=new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement ele1=driver.findElement(By.xpath("//a[.='Women Ethnic']"));
		act.click(ele1).perform();
		
	}
	public void clickLogin()
	{
		WebElement ele=driver.findElement(By.linkText("Login"));
		act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public static void main(String[] args) {
		flipkartMouseHandling fk=new flipkartMouseHandling();
		
		fk.access("https://www.flipkart.com/");
		fk.handlePopUP();
		fk.clickLogin();
	}
	

}
