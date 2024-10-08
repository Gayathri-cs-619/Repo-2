package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class HomePage {

	WebDriver driver;
	GeneralUtilities genUtility = new GeneralUtilities();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='7rmart supermarket']")
	WebElement heading;
	@FindBy(xpath = "//nav/ul/li/a/p[text()='Sub Category']")
	WebElement subCategoryLink;

	public String readHeading() {
		return heading.getText();
	}

	public void clickSubCategoryLink() {

		subCategoryLink.click();

	}

}
