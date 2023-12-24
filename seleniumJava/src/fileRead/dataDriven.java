package fileRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDriven {
	@DataProvider(name = "exceldata")
	public Object[][] data() throws Exception {
		FileInputStream fi = new FileInputStream("C:\\Users\\HP\\Desktop\\Book1.xlsx");
		Workbook wk = WorkbookFactory.create(fi);
		Sheet s = wk.getSheet("Sheet1");
		int rowsize = s.getPhysicalNumberOfRows();
		int coloumsize = s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d = new Object[rowsize][coloumsize];

		for (int i = 0; i < rowsize; i++) {
			
			for (int j = 0; j < coloumsize; j++) {
				String result = wk.getSheet("sheet1").getRow(i).getCell(j).toString();
				d[i][j]=result;
			}
		}
		return d;
	}

	@Test(dataProvider = "exceldata",enabled = false)
	public void facbook(String user, String pass) {
		WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.quit();
	}
	@Test(dataProvider = "exceldata")
	public void read(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
	}

}
