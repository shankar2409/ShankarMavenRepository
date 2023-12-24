package javascriptExcuter;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class access {
	static WebDriver driver;
	static JavascriptExecutor js;

	public static void access(String URL) {
		Scanner s = new Scanner(System.in);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if (s.nextBoolean() == true) {
			driver.get(URL);
		} else {
			js = (JavascriptExecutor) driver;
		}

	}
}
