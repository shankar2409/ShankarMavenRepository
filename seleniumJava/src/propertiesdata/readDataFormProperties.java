package propertiesdata;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class readDataFormProperties {
	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream("E:\\java\\seleniumJava\\excel\\data.properties");
		Properties p=new Properties();
		p.load(f);
//		String url=p.getProperty("amazonUrl");
//		System.out.println(p.getProperty("amazonUrl"));
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("flipkartUrl"));
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(p.getProperty("amazonUrl"));
		
	}
}
