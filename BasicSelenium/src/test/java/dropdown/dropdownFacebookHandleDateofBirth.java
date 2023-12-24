package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownFacebookHandleDateofBirth {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//access
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("[data-testid*='open']")).click();
		
		WebElement ele= driver.findElement(By.cssSelector("[name='birthday_day']"));
		Select se=new Select(ele);
		se.selectByValue("24");
		WebElement ele1=driver.findElement(By.id("month"));
		Select se1=new Select(ele1);
		se1.selectByVisibleText("Mar");
		WebElement ele2=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select se2=new Select(ele2);
		se2.selectByValue("2015");
		
	}
}
