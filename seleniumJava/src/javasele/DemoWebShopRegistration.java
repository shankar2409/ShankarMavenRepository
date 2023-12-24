package javasele;

import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShopRegistration {
	@Test(dataProvider = "registrationDemoWebShop", priority = 1)
	public void registration(String firstname, String lastname, String email, String password, String conformPass) {
		try {
			driver.findElement(By.linkText("Register")).click();
			String currentURL = driver.getCurrentUrl();
			driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input")).click();
			driver.findElement(By.id("FirstName")).sendKeys(firstname);
			driver.findElement(By.id("LastName")).sendKeys(lastname);
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.id("ConfirmPassword")).sendKeys(conformPass);
			driver.findElement(By.id("register-button")).click();
			String newURL = driver.getCurrentUrl();
			if (currentURL.equals(newURL)) {
				driver.findElement(By.linkText("Register")).click();
			} else {
				driver.findElement(By.linkText("Log out")).click();
			}
			System.out.println("done....");
		} catch (Exception e) {
			System.out.println(" Registration Exception Handled");
		}

	}

	WebDriver driver;

	@Test(priority = 0)
	public void Access() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@DataProvider(name = "registrationDemoWebShop")
	public Object[][] readData() throws Exception {
		FileInputStream fis = new FileInputStream("E:\\java\\seleniumJava\\excel\\demoWebShop.xlsx");
		Workbook wk = WorkbookFactory.create(fis);
		Sheet sheet = wk.getSheet("Sheet1");
		int columnNo = sheet.getRow(0).getPhysicalNumberOfCells();
		int rowNo = sheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[rowNo][columnNo];
		for (int i = 1, temp = 0; i < rowNo; i++, temp++) {
//			int temp1=0;
			for (int j = 0; j < columnNo; j++) {
				try {
					String d = sheet.getRow(i).getCell(j).toString();
					if (d != null) {
						data[i][j] = d;
					}
				} catch (Exception e) {
					continue;
				}
			}

		}

		return data;

	}

	@Test(dataProvider = "login", priority = 2, dependsOnMethods = "registration")
	public void login(String email, String password) throws InterruptedException {
		try {
			driver.findElement(By.linkText("Log in")).click();
			String text = driver.findElement(By.linkText("Log in")).getText();
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
//					driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
			String newText = driver.findElement(By.linkText("Log out")).getText();
			if (text.equals(newText)) {
				driver.findElement(By.linkText("Log in")).click();

			} else {
				driver.findElement(By.linkText("Log out")).click();

			}

		} catch (Exception e) {
			System.out.println("Login Exception Handled" + e.toString());
		} finally {
			Thread.sleep(2000);
		}
	}

	@DataProvider(name = "login")
	public Object[][] loginApp() throws Exception {
		FileInputStream fis = new FileInputStream("E:\\java\\seleniumJava\\excel\\demoWebShop.xlsx");
		Workbook wk = WorkbookFactory.create(fis);
		Sheet sheet = wk.getSheet("Sheet1");
		// System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		int rowNo = sheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[rowNo][2];

		for (int i = 1, temp = 0; i < rowNo; i++, temp++) {
			int temp1 = 0;
			int columnNo = sheet.getRow(i).getPhysicalNumberOfCells();
			for (int j = 0; j < columnNo; j++) {

				if ((j == 2 || j == 3)) {
					try {
						String d = sheet.getRow(i).getCell(j).getStringCellValue();
						if (d != null) {
							data[temp][temp1++] = d;
						}

					} catch (Exception e) {
						continue;
					}
				} else {
					continue;
				}
			}
		}
//		for(int i=0;i<data.length;i++) {
//			for(int j=0;j<data[i].length;j++) {
//				System.out.print(data[i][j]+" ");
//			}
//			System.out.println();
//		}
		return data;
	}

//	WebDriver driver;

	@Test(priority = 0, enabled = false)
	public void Accessq() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@Test(priority = 2, enabled = false)
	public void closeBrow() {
		driver.quit();
	}
}
