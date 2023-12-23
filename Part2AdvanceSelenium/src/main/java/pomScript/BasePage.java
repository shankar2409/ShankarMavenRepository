package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.UtilityMethods;

public class BasePage extends BaseTest {
	public BasePage() {
		
	}
	public BasePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
}
