package popups;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * open the chrome browser
 * access flipkart
 * search iphone 15
 * click on the first product
 * print the product name
 */
public class handlemultiplechildwindow {
	WebDriver driver;
	
	public void AccessApp() throws Exception
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]","https://www.flipkart.com/");
		
		
	}
	public void searchProduct()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.cssSelector("[class='30XB9F']")).click();
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("iphone 15",Keys.ENTER);
//		driver.findElement(By.cssSelector("[class='L0Z3Pu']")).click();
		
	}
	int count=0;
	String ParentId;
	Set<String>  allId;

	public void selectProduct()
	{
		 ParentId=driver.getWindowHandle();
		List<WebElement> products = driver.findElements(By.cssSelector("[class='_4rR01T']"));
		for(WebElement r:products)
		{
			r.click();
			driver.switchTo().window(ParentId);
			count++;
			if(count>=3)
			{
				break;
			}
		}
		allId=driver.getWindowHandles();
	}
	public void switchWindowUsingTitle()
	{
		
		for(String id:allId)
		{
			String title=driver.switchTo().window(id).getTitle();
			System.out.println(title);
			
			if(title.contains("256"))
			{
				break;
			}
		}
	}
	public void switchWindowUsingUrl()
	{
		for(String id:allId)
		{
			String Url=driver.switchTo().window(id).getCurrentUrl();
			if(Url.contains("128"))
			{
				break;
			}
		}
	}
	public void switchWindowUsingId()
	{
		for(String id:allId)
		{
			if(!(ParentId.equals(id)))
					{
				break;
					}
		}
	}
	
	public static void main(String[] args) throws Exception {
		handlemultiplechildwindow hmc=new handlemultiplechildwindow();
		hmc.AccessApp();
		Thread.sleep(5000);
		hmc.searchProduct();
		hmc.selectProduct();
		Scanner s=new Scanner(System.in);
		System.out.println("1 --->Access child window through URl");
		System.out.println("2  --->Access child window through Title");
		System.out.println("3 --->Access child window through WindowId");
		int num=s.nextInt();
		switch (num) {
		case 1:
			{
				hmc.switchWindowUsingId();
				System.out.println(hmc.driver.getCurrentUrl());
				
			}
			break;
		case 2:
		{
			
			hmc.switchWindowUsingUrl();
			System.out.println(hmc.driver.getCurrentUrl());
			
		}
		break;
		case 3:
		{
			hmc.switchWindowUsingTitle();
			System.out.println(hmc.driver.getCurrentUrl());
		}
		
		
	
		
		
		
		
	}
	}}
