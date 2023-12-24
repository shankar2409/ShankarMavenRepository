package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllmultiDropDownOption_own {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/dropdown.html");
		WebElement ele = driver.findElement(By.id("Movies"));
		Select se = new Select(ele);
		if (se.isMultiple()) {
			List<WebElement> allopt = se.getOptions();
			for (WebElement r : allopt) {
				r.click();
				System.out.println(r.getText());
			}
			WebElement selectedoption =se.getFirstSelectedOption();
			System.out.println(selectedoption.getText());

		}

	}
}
