package javasele;

import java.time.Duration;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demowebShopRegisteration {
	static Scanner s = new Scanner(System.in);
	WebDriver driver;
//	 static String password;
//	 static String conformPassword=password;
	static {
		System.out.println("enter the email and passowrd");
//		Random r=new Random();
//		int randomNumber = r.nextInt(1,100);
//	    UUID randomUUID = UUID.randomUUID();
//	     password=randomUUID.toString().replaceAll("_", "");
	}
	String email = s.nextLine();
	String password = s.nextLine();
	String conformPassword = s.nextLine();
	{
		while (true) {
			if (password.equals(conformPassword)) {
				break;
			} else {
				System.out.println("enter the same password as conform password");
				password = s.nextLine();
				conformPassword = s.nextLine();
			}
		}
	}

	@Test(priority = 0)
	public void AccessApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
	}
	@Test(priority = 1, dependsOnMethods = "AccessApp")
	public void registration() {
		driver.findElement(By.id("FirstName")).sendKeys("shankar");
		driver.findElement(By.id("LastName")).sendKeys("R");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.partialLinkText("shankarraman")).isDisplayed();
	}

	@Test(priority = 2, dependsOnMethods = "registration")
	public void login() {
		driver.findElement(By.cssSelector("[class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("[value='Log in']")).submit();
	}
	@Test(priority = 3, dependsOnMethods = "login")
	public void logout() {
		driver.findElement(By.cssSelector("[class='ico-logout']")).click();
	}
	@Test(priority = 4, dependsOnMethods = "logout")
	public void close() {
		driver.quit();
	}
}
