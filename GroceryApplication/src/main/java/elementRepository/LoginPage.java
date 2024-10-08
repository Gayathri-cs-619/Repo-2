package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	public void loginwithValidCredentials(String userName, String password) {
		gu.sendKeyFunction(userNameField, userName);
		// userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		loginButton.click();
	}

	public String readInvalidMessage() {
		return invalidUserAlert.getText();
	}

	public void loginwithInvalidCredentials(String userName, String password) {
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		loginButton.click();
	}

}
