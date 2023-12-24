package ActionsClass;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassPerformAmazon {
	WebDriver driver;
	WebElement Laptops;
	Actions act;
	public void AccessAmazon(String URL)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	public void clickMobiles()
	{
		driver.findElement(By.xpath("//a[.='Mobiles']")).click();
		
	}
	public void mouseOverLaptops() throws AWTException, InterruptedException {
	 Laptops=driver.findElement(By.xpath("//span[normalize-space(text())='Laptops & Accessories']"));
	 act=new Actions(driver);
	 Thread.sleep(2000);
	 act.moveToElement(Laptops).perform();
	 Thread.sleep(2000);
	 WebElement Dell=driver.findElement(By.xpath("//a[.='Dell']/parent::li//following-sibling::li/a[.='HP']"));
	//a[.='Dell']/parent::li//following-sibling::li/a[.='HP']
	 Thread.sleep(2000);
	 act.click(Dell).perform();
	} 
	public void SortBylowtohigh() throws Exception
	{
		WebElement sort= driver.findElement(By.xpath("//span[contains(@id,'a-autoid-0-a')]"));
		sort.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	public static void main(String[] args) throws Exception {
		ActionsClassPerformAmazon ref=new ActionsClassPerformAmazon();
		
		ref.AccessAmazon("https://www.amazon.in/");
		ref.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ref.clickMobiles();
		ref.mouseOverLaptops();
		Thread.sleep(5000);
		ref.SortBylowtohigh();
		Thread.sleep(5000);
		
		ref.driver.quit();
	}
}
