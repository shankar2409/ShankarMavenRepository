package parametersAndlisteners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginForDemoWebShop {
	public  LoginForDemoWebShop(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Log in")
	private WebElement loginClick;
	@FindBy(id = "Email")
	private WebElement emailLogin;
	@FindBy(id = "Password")
	private WebElement passwordLogin;
	@FindBy(css = "[class*='login-button']")
	private WebElement loginButton;
	@FindBy(linkText = "Log out")
	private WebElement logoutClick;
	
	public WebElement getLogoutClick() {
		return logoutClick;
	}
	public void setLogoutClick(WebElement logoutClick) {
		this.logoutClick = logoutClick;
	}
	public WebElement getLoginClick() {
		return loginClick;
	}
	public void setLoginClick(WebElement loginClick) {
		this.loginClick = loginClick;
	}
	public WebElement getEmailLogin() {
		return emailLogin;
	}
	public void setEmailLogin(WebElement emailLogin) {
		this.emailLogin = emailLogin;
	}
	public WebElement getPasswordLogin() {
		return passwordLogin;
	}
	public void setPasswordLogin(WebElement passwordLogin) {
		this.passwordLogin = passwordLogin;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
}
