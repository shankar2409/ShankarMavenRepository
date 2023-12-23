package generic;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseTest extends UtilityMethods{
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(@Optional("chrome") String browser) throws IOException {
		switch (browser.toLowerCase()) {
		case "chrome":{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUTS_WAIT));
			String demo_url = getpropertyFileDate();
			driver.get(URL);
			break;
		}
		case "firefox":
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUTS_WAIT));
			String demo_url = getpropertyFileDate();
			driver.get(demo_url);
			break;
		}
		case "edge":{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUTS_WAIT));
			String demo_url = getpropertyFileDate();
			driver.get(demo_url);
		}
			
			

		default:
			break;
		}
	}
	public void main() {
		
	}
}
