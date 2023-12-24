package propertiesdata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomRegisterPage {
	@FindBy(linkText = "Register")
	private WebElement regisLink;
	PomRegisterPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public WebElement getRegisLink() {
		return regisLink;
	}

	public void setRegisLink(WebElement regisLink) {
		this.regisLink = regisLink;
	}
	
}
