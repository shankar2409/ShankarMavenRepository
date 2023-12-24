package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 class HOverMsg_OHrm {
	WebDriver driver;

	public void accessApplication() {
		driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Access the Oange HRM application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	public void login() throws Exception {
		// provide userName
		driver.findElement(By.cssSelector("input[class*='o'][name*='u']")).sendKeys("admin");

		// provide password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

		Thread.sleep(2000);
		// click login button
		driver.findElement(By.cssSelector("button[class*='o']")).click();
	}

	/**
	 * by using this method you can get the attribute value of the H-Over messages
	 * 
	 * @return
	 */
	public String getAttribute() {
		WebElement ele = driver.findElement(By.xpath("//button[contains(@title,'As')]"));
		String attributeValue=ele.getAttribute("title");
		return attributeValue;
	}

}
public class HOver_meassages_OrangeHRMApplication{
	public static void main(String[] args) throws Exception {
		HOverMsg_OHrm h=new HOverMsg_OHrm();
		
		h.accessApplication();
		h.login();
		System.out.println(h.getAttribute());
	}
}
