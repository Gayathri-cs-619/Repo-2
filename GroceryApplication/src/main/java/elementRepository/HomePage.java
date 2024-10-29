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
	@FindBy(xpath = "//div[@class='small-box bg-info']/a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']")
	WebElement manageProductLink;
	@FindBy(xpath = "//p[text()='Manage Category']")
	WebElement manageCategoryLink;
	@FindBy(xpath = "//li/a/p[text()='Manage Contact'][1]")
	WebElement manageContactLink;
	@FindBy (xpath="//li/a/p[text()='Manage News']")
	WebElement manageNewsLink;

	public String readHeading() {
		return heading.getText();
	}

	public SubCategoryPage clickSubCategoryLink() {
		subCategoryLink.click();
		return new SubCategoryPage(driver);
	}

	public ManageProductPage clickManageProductLink() {
		manageProductLink.click();
		return new ManageProductPage(driver);
	}

	public ManageCategoryPage clickManageCategoryLink() {
		manageCategoryLink.click();
		return new ManageCategoryPage(driver);
	}

	public ManageContactPage clickManageContactLink() {
		manageContactLink.click();
		return new ManageContactPage(driver);
	}
	
	public ManageNewsPage clickManageNewsLink() {
		manageNewsLink.click();
		return new ManageNewsPage(driver);
	}

}
