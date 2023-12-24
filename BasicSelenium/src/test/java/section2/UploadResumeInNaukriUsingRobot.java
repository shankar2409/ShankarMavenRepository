package section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeInNaukriUsingRobot {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIyr-W_qvIggMV_aVmAh3OSwQcEAAYASAAEgKg5vD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		//select the file in the System
		StringSelection ss=new StringSelection("E:\\seleniumOutput\\Serial No.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(6000);
		Robot r=new Robot();
		r.delay(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.delay(5000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//remove the resume 
		//driver.findElement(By.cssSelector("[src*='//static.naukimg.com/s/7/104/assets/images/de']")).click();
	}
}
