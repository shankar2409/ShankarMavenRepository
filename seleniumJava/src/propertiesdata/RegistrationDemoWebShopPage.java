package propertiesdata;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationDemoWebShopPage {
	WebDriver driver;

	@Test(dataProvider = "registration", priority = 1)
	public void registration(String fn, String ln, String email, String pw, String cps,String gender) throws Exception {
		try {
			PomRegisterPage prp = new PomRegisterPage(driver);
			prp.getRegisLink().click();
//			p.setProperty("firstName", "vignesh");
			POMDemoWEbShopRegispage prp1 = new POMDemoWEbShopRegispage(driver);
			String currentURL = driver.getCurrentUrl();
			if (gender.equals("Male")) {
				prp1.getMaleGender().click();
			}
			else {
				prp1.getFemaleGender().click();
			}
			Thread.sleep(2000);
			prp1.getFirstName().sendKeys(fn);
			prp1.getLastName().sendKeys(ln);
			prp1.getEmail().sendKeys(email);
			prp1.getPassowrd().sendKeys(pw);
			prp1.getConfirmPassword().sendKeys(cps);
			prp1.getRegister().click();
			String newURL = driver.getCurrentUrl();
			if (currentURL.equals(newURL)) {
				driver.findElement(By.linkText("Register")).click();
			} else {
				driver.findElement(By.linkText("Log out")).click();
			}
		} catch (Exception e) {
			System.out.println("Exception Handled" + e.toString());
		}

	}

	@DataProvider(name = "registration")
	public String[][] registrationData() throws Exception {
		FileInputStream dataRead = new FileInputStream("E:\\java\\seleniumJava\\excel\\demoWebShop1.xlsx");
		Workbook wk = WorkbookFactory.create(dataRead);
		Sheet sheet = wk.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount  = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
//		System.out.println(columnCount + " " + rowCount);
		String[][] d = new String[rowCount][columnCount];
		int temp = 0;
		for (int i = 1; i < rowCount; i++, ++temp) {
			int temp1 = 0;
			for (int j = 0; j < columnCount; j++) {
				try {
					String data = sheet.getRow(i).getCell(j).toString();
//					System.out.println(data);

					d[temp][temp1++] = data;
				} catch (Exception e) {
					System.out.println("exception");
					continue;
				}
			}
//			System.out.println(Arrays.toString(d[0]));
		}
		return d;
	}

	@Test(priority = 0)
	public void Access() throws Exception {
		FileInputStream fis = new FileInputStream("E:\\java\\seleniumJava\\excel\\data.properties");
		Properties p = new Properties();
		p.load(fis);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("DemoWebShop"));
//		System.out.println(p.getProperty("DemoWebShop"));
	}
	@Test(priority = 2)
	public void logout() {
		driver.quit();
	}
}
