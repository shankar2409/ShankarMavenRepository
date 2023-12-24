 package parametersAndlisteners;

import propertiesdata.POMDemoWEbShopRegispage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass extends testlistener {
	WebDriver driver;
	static String email="shankarraman32@gmail.com";
	static String password="shan@1234";
	@BeforeMethod
	public void beforeMethod() {
		POMDemoWEbShopRegispage register=new POMDemoWEbShopRegispage(driver);
		register.getRegister().click();
		 String url=driver.getCurrentUrl();
		 register.getMaleGender();
		register.getFirstName().sendKeys("shankar");
		register.getLastName().sendKeys("R");
		register.getEmail().sendKeys(email);
		register.getPassowrd().sendKeys(password);
		register.getConfirmPassword().sendKeys("shan@1234");
		register.getRegisterButton().click();
		String currentUrl=driver.getCurrentUrl();
		if (!(url.equals(currentUrl))) {
			driver.findElement(By.linkText("Log out"));
		} else {
			Reporter.log("registration not donee..");
		}
	}

	@AfterMethod
	public void afterMethod() {
	}

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.get("https://demowebshop.tricentis.com/login");

		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--disable-notifications");
			driver = new FirefoxDriver(options);
			driver.get("https://demowebshop.tricentis.com/login");
		} else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--disable-notifications");
			driver = new EdgeDriver();
			driver.get("https://demowebshop.tricentis.com/login");
		} else {
			throw new WebDriverException();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("connection to the database");
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("disconnect to the database");
	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("connection to the server");
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("disconnection to the server");
	}

}
