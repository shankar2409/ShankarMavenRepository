package fileRead;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriverTesting {
	@DataProvider(name = "exceldata")
	public Object[][] data() {
		Object[][] d = new Object[2][2];
		d[0][0] = "username1";
		d[0][1] = "passsword1";
		d[1][0] = "username2";
		d[1][1] = "password2";
		return d;
	}
	@Test(dataProvider = "exceldata")
	public void facbook(String user,String pass) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.quit();
	}
	

}
