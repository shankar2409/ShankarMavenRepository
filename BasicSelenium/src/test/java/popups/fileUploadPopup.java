package popups;
import java.time.Duration;

import org.openqa.selenium.By;
/*
 * open the chrome browser
 * access internet application
 * url:https://the-internet.herokuapp.com/upload
 * upload the file
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class fileUploadPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\HP\\Desktop\\jira access URL.txt");
		driver.quit();
	}
}
