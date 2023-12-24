package classTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment {
	WebDriver driver;

	public void AccessApp(String URL) {
		// access the chrome driver
		driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// synchorazation --wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// access appliation
		driver.get(URL);

	}

	public void clickTestWebcam() {
		driver.findElement(By.cssSelector("[href*='webcamtests']")).click();
		// switch the window
		//String parentId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			String url = driver.switchTo().window(id).getCurrentUrl();
			if (url.contains("https://webcamtests.com/")) {
				break;
			}
		}
	}
	public void clickonStartCamera()
	{
		driver.findElement(By.xpath("//button[contains(text(),'C')]")).click();
	}
	public static void main(String[] args) {
		Assessment as=new Assessment();
		as.AccessApp("https://mictests.com/");
		as.clickTestWebcam();
		as.clickonStartCamera();
	}
}
