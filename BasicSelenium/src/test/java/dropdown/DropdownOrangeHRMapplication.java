package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOrangeHRMapplication {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Access the Oange HRM application
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"password",Keys.ENTER);
		// provide userName
		
		//driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[@class=\"small\"]//a[contains(@href,'index.php?module=Ac')]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		WebElement ele= driver.findElement(By.cssSelector("select[name=\"industry\"]"));
		Select se=new Select(ele);
//		se.selectByIndex(2);
		se.selectByValue("Banking");
		

	}
}
