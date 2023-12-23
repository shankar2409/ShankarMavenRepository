package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationPage extends BasePage {
	@FindBy(linkText = "Register")
	private WebElement register;
	@FindBy(id = "FirstName")
	private WebElement firstName;

	public registrationPage() {
		// TODO Auto-generated constructor stub
	}
	public registrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "LastName")
	private WebElement lastName;
	@FindBy(id = "Email")
	private WebElement email;
	@FindBy(id = "Password")
	private WebElement passowrd;
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPassword;
	@FindBy(id = "register-button")
	private WebElement registerButton;
	@FindBy(xpath = "//label[text()='Male']/parent::div/child::input")
	private WebElement maleGender;
	@FindBy(xpath = "//label[text()='Female']/parent::div/child::input")
	private WebElement FemaleGender;

	public WebElement getMaleGender() {
		return maleGender;
	}

	public void setMaleGender(WebElement maleGender) {
		this.maleGender = maleGender;
	}

	public WebElement getFemaleGender() {
		return FemaleGender;
	}

	public void setFemaleGender(WebElement femaleGender) {
		FemaleGender = femaleGender;
	}

	public WebElement getRegister() {
		return register;
	}

	public void setRegister(WebElement register) {
		this.register = register;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(WebElement passowrd) {
		this.passowrd = passowrd;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(WebElement conformPassword) {
		this.confirmPassword = conformPassword;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

}
