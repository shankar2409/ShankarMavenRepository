package javascriptExcuter;
/**
 * open he browser
 * access practice automation site
 * highlight username textfield
 * takescreenshot on full webpage
 */

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class  HighlightUsernameTextField{
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.location=arguments[0]","https://practicetestautomation.com/practice-test-login/");
	WebElement userName=driver.findElement(By.id("username"));
	js.executeScript("arguments[0].style.border='3px solid orange'", userName);
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("./screenshot/highlight.png");
	Files.copy(source, destination);
}	
}
