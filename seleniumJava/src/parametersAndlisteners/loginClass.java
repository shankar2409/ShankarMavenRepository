package parametersAndlisteners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(testlistener.class)
public class loginClass extends BaseClass {
	LoginForDemoWebShop login;
//	WebDriver driver;
	@Test(priority = 0)
	public void login() {
//		driver=new ChromeDriver();
		login=new LoginForDemoWebShop(driver);
		String expected = login.getLoginClick().getText();
		login.getLoginClick().click();
		login.getEmailLogin().sendKeys(BaseClass.email);
		login.getPasswordLogin().sendKeys(BaseClass.password);
		login.getLoginButton().click();
		String actual=login.getLogoutClick().getText();
		SoftAssert sa=new SoftAssert();
		sa.assertNotEquals(expected, actual);
		sa.assertAll();
		login.getLogoutClick().click();
	}
	@Test(dependsOnMethods = "login",priority = 1,enabled = false)
	public void logout() {
		LoginForDemoWebShop logout=new LoginForDemoWebShop(driver);
		logout.getLogoutClick().click();
	}
	
}
