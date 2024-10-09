package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class SubCategoryPage {
	WebDriver driver;
	GeneralUtilities genUtility = new GeneralUtilities();

	String subCategoryValue;
	
	public SubCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//section/div/a[1]")
	WebElement newButton;
	@FindBy(xpath = "//select[@id='cat_id']")
	WebElement categorydropdown;
	@FindBy(xpath = "//input[@id='subcategory']")
	WebElement subCategoryText;
	@FindBy(xpath = "//button[@name='create']")
	WebElement subCategorySaveButton;
	@FindBy(xpath = "//div/div[@class='col-sm-12']/div")
	WebElement subCategorySaveGeneralAlert;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement subCategorySaveSuccessAlert;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement subCategorySaveFailureAlert;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]/td[1]")
	WebElement categoryTableCol1;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]/td[5]/a[2]")
	WebElement categoryDeleteButton;
	
	public void clickNewButton() {

		newButton.click();
	}

	public void selectCategory() {

		genUtility.selectDropdownWithIndex(categorydropdown, 2);
	}

	public void entersubCategoryText() {
		String subCategoryValue="678996"+genUtility.randon(1000);
		this.subCategoryValue=subCategoryValue;
		genUtility.sendKeyFunction(subCategoryText, subCategoryValue);
		
	}

	public void clickSubCategorySave() {

		subCategorySaveButton.click();
	}

	public boolean subCategorySaveStatus() {
		String alertMessage = subCategorySaveGeneralAlert.getText();

		if (alertMessage.contains("Created Successfully")) {
			return true;
		} else if (alertMessage.contains("already exists")) {
			return false;
		} else {
			return false;
		}

		/*
		 * Alert! Sub Category already exists. Alert! Sub Category Created Successfully
		 */
	}

	public boolean findCategoryTableNewValue() {

		String subCategoryDerivedValue = categoryTableCol1.getText();
		
		if (subCategoryDerivedValue.equals(this.subCategoryValue))

			return true;

		else
			return false;
	}

	
	public void deleteSubCategory() {

		categoryDeleteButton.click();
		genUtility.alertAccept(driver);
	}

	
}
