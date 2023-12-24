package section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_ProductName {
	public static void main(String[] args) throws Exception {
		File f=new File("E:\\seleniumOutput//iphoneNames.txt");
		FileOutputStream fout = null;
		try {
			 fout=new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Access
		driver.get("https://www.flipkart.com/");
		
		//close the popup window
		WebElement ele=driver.findElement(By.cssSelector("span._30XB9F"));
		if(ele.isDisplayed())
		{
			ele.click();
		}
		
		//search textField and pass data
		driver.findElement(By.cssSelector("div[class=\"_2SmNnR\"] [class=\"Pke_EE\"]")).sendKeys("iphone 15");
		//click search button
		driver.findElement(By.cssSelector("button._2iLD__")).click();
		List<WebElement>  names=driver.findElements(By.cssSelector("div[class='_4rR01T']"));
		
		List<WebElement> price=driver.findElements(By.cssSelector("div[class*='_30jeq3 _']"));
		
		ArrayList<String> mobile=new ArrayList<String>();
		ArrayList< String > prices=new ArrayList<String>();
		for(WebElement r:price)
		{
			prices.add(r.getText());
		}
		for(WebElement r:names)
		{
			mobile.add(r.getText());
		}
		
		for(int i=0;i<=mobile.size()-1;i++)
		{
			String b=mobile.get(i)+" : "+prices.get(i);
			byte[] c=b.getBytes();
			fout.write(c);
			fout.write('\n');
		}
		fout.flush();
		fout.close();
		System.out.println("done..");
		driver.quit();
	}
}
