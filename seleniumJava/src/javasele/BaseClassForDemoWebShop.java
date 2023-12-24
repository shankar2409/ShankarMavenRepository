package javasele;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClassForDemoWebShop {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shankarraman1998@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("shankar@1234");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		Reporter.log("login succesful");
	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("logout sucessfull");
	}
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		//open the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@AfterClass
  public void afterClass() {
		//close the browser
	  driver.quit();
  }

	@BeforeTest
	public void beforeTest() {
		Reporter.log("connection to the database");
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("disconect to the database");
	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("connection to the server");
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("disconnect to the server");
	}

}
