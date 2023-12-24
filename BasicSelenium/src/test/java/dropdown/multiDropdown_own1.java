package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiDropdown_own1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("C:\\Users\\HP\\Desktop\\New folder\\dropdown.html");

		WebElement ele = driver.findElement(By.id("Movies"));
		Select se = new Select(ele);
		if (se.isMultiple()) {
			List<WebElement> elee=se.getOptions();
			for(int i=0;i<=elee.size()-1;i++)
			{
				se.selectByIndex(i);
			}
		} else {
				System.out.println("it is not a multiple dropdown");
		}
	
		
		/*List<WebElement> allopt=se.getOptions();
		for(WebElement r:allopt)
		{
			r.click();
		}*/

	}
}
