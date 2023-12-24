package javasele;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClassForShopperStack {
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("First Name")).sendKeys("shankar");
	driver.findElement(By.id("Last Name")).sendKeys("R");
	driver.findElement(By.xpath("//span[text()='Male']/ancestor::label/descendant::input")).click();
	driver.findElement(By.id("Phone Number")).sendKeys("9698422121");
	driver.findElement(By.id("Email Address")).sendKeys("shan@1234@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Shan@1234",Keys.TAB,"Shan@1234");
	driver.findElement(By.xpath("//a[contains(text(),'Te')]/ancestor::span/descendant::input[@id='Terms and Conditions']")).click();
//	WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Register")));
	driver.findElement(By.id("Register")).click();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("amazon logout");
  }

  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.shoppersstack.com/");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("connect the database");
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("disconnect the database");
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("connect the server");
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("server discoonection");
  }

}
