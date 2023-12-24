package section2;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_autoSugesstion {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");

		WebElement ele = driver.findElement(By.cssSelector("[class='_30XB9F']"));

		if (ele.isDisplayed()) {
			ele.click();
		}
//		else
//			System.out.println("hii");
//		System.out.print("enter the product name  :");
//		String product = s.nextLine();
		driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("iphone 15");

		Thread.sleep(3000);

		List<WebElement> elements = driver.findElements(By.className("_3D0G9a"));
//		System.out.print("select the sugesstion list name  :");
//		String search = s.nextLine();
		for (WebElement r : elements) {
			if (r.getText().contains("pro max")) {
				r.click();
			}
		}
		driver.quit();
	}
}
