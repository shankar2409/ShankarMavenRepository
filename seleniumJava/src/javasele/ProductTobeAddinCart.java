package javasele;

import org.openqa.selenium.By;
import org.openqa.selenium.cli.CliCommand;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTobeAddinCart extends BaseClassForDemoWebShop {
	@Test
	public void searchProduct() throws Exception {
		driver.findElement(By.linkText("Electronics")).click();
		driver.findElement(By.xpath("//a[normalize-space(text())='Cell phones']/parent::h2")).click();
		driver.findElement(By.linkText("Smartphone")).click();
		driver.findElement(By.id("add-to-cart-button-43")).click();
		Thread.sleep(2000);
		String ExpectedResult="SmartPhone";
		driver.findElement(By.linkText("Shopping cart")).click();
//		String actualResult=driver.findElement(By.xpath("//a[@class='product-name']/parent::td[@class='product']")).getText();
//		Assert.assertEquals(actualResult, ExpectedResult,"product mismatch");
	}
}
