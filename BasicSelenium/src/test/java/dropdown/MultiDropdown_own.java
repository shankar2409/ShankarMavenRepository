package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdown_own {
	//the check dropdown is single or multiple dropdown
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("C:\\Users\\HP\\Desktop\\New folder\\dropdown.html");
		
		WebElement ele= driver.findElement(By.id("Movies"));
		Select se=new Select(ele);
		System.out.println(se.isMultiple());
		driver.quit();
		
		
	}
}
