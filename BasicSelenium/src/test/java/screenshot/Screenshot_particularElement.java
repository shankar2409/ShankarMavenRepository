package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_particularElement {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=search.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("./screenshot/searchIcon.png");
		Files.copy(source, destination);
	}
}
