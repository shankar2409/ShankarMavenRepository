package section2;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.cssSelector("input#username")).sendKeys("student");
	}
}
