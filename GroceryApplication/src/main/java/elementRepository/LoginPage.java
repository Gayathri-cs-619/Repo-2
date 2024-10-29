package elementRepository;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtility;
import utilities.GeneralUtilities;

public class LoginPage {

	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// with page factory-init elements(Static element of page factory. 'This'
												// parameter is current class instance.
	}
	// without pagefactory
	// By UserNameField=By.name("username");
	// WebElement element=driver.findElement(UserNameField).click();

	@FindBy(name = "username")
	WebElement userNameField;
	@FindBy(name = "password")
	WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement loginButton;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	WebElement invalidUserAlert;

	public HomePage performLogin(String userName, String password) {
		gu.sendKeyFunctionforString(userNameField, userName);
		passwordField.sendKeys(password);
		loginButton.click();
		return new HomePage(driver);
		//returning an object for HomePage, like hp. return type of that object is HomePage [HomePage hp=new HomePage();]like String 
	}

	public String readInvalidMessage() {
		return invalidUserAlert.getText();
	}

}
