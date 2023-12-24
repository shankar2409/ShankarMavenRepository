package understand;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) throws IOException {
		File f=new File("E:\\seleniumOutput//htmlCodeForautomationZone.txt");
		FileOutputStream fout=new FileOutputStream(f);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://theautomationzone.blogspot.com/search/label/selenium%20practice%20page");
		String s=driver.getPageSource();
		byte[] b=s.getBytes();
		
		fout.write(b);
		fout.flush();
		fout.close();
		driver.quit();
		
		
	}
}
