package Checkbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
	List<WebElement> checkbox = driver.findElements(By.xpath("(//input[@type='checkbox'])[last()]"));
	
	for(WebElement r: checkbox) 
	{
		r.click();
		
	}

	}

}
