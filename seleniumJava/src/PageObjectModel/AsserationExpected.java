package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import propertiesdata.POMDemoWEbShopRegispage;

public class AsserationExpected {
	WebDriver driver;

	@Test()
	public void As() {
		String expected = "http:/demowebShop.com";
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String actual = driver.getCurrentUrl();
//		SoftAssert wssert = new SoftAssert();
//		wssert.assertEquals(expected, actual);
		System.out.println("further continues");
//		wssert.assertAll();
	}

	@Test()
	public void Registration() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		POMDemoWEbShopRegispage ps = new POMDemoWEbShopRegispage(driver);
		WebElement RegButton = driver.findElement(By.linkText("Register"));
		String Expected = RegButton.getText();
		ps.getFirstName().sendKeys("shankar");
		ps.getLastName().sendKeys("R");
		ps.getEmail().sendKeys("shankarraman@gmail.com");
		ps.getPassowrd().sendKeys("shan@1234");
		ps.getConfirmPassword().sendKeys("shan@1234");
		ps.getRegister().click();
		String actual=driver.findElement(By.partialLinkText("shankarraman")).getText();
		Assert.assertNotEquals(Expected, actual);
		System.out.println("okk done...");
	}
}
