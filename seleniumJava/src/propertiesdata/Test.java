package propertiesdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
@org.testng.annotations.Test
public void testcase() throws Exception {
	FileInputStream fis=new FileInputStream("E:\\java\\seleniumJava\\excel\\data.properties");
	Properties p=new Properties();
	p.load(fis);
			
	WebDriver driver=new ChromeDriver();
	driver.get(p.getProperty("DemoWebShop"));
	PomRegisterPage prp=new PomRegisterPage(driver);
	prp.getRegisLink().click();

	
}
}
