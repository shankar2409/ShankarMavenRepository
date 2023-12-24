package qcom_application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resetpassword {
	WebDriver driver;
	
	String Username;
	String password;
	String currPassword;
	String newPassword;
	String confirmPassword;
	public resetpassword( String username, String password, String currPassword, String newPassword,
			String confirmPassword) {
		super();
		Username = username;
		this.password = password;
		this.currPassword = currPassword;
		this.newPassword = newPassword;
		this.confirmPassword = confirmPassword;
	}
	
	
	public void accessApplication(String URL)
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(URL);
	
	}
	public void loginApp() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='My account']")).click();
		driver.findElement(By.cssSelector("[id='edit-name']")).sendKeys("shankar",Keys.TAB,"123456",Keys.ENTER);
		Thread.sleep(2000);
		
	}
	public void editPassword()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[.='Edit']")).click();
		driver.findElement(By.cssSelector("[id='edit-current-pass']")).sendKeys(currPassword);
		
		driver.findElement(By.cssSelector("[id='edit-pass-pass1']")).sendKeys(newPassword);
		driver.findElement(By.cssSelector("[id='edit-pass-pass2']")).sendKeys(confirmPassword);
		driver.findElement(By.cssSelector("[id='edit-submit']")).click();
		
	}
	public static void main(String[] args) throws Exception {
		resetpassword rp=new resetpassword("shankar", "123456","123456","1234567890", "1234567890");
		rp.accessApplication("http://106.51.87.167:9002/");
		rp.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		rp.loginApp();
		rp.editPassword();
		rp.loginApp();
	}

	
}
