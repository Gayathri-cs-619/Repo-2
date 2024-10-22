package elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;
import utilities.WaitUtility;

public class ManageCategoryPage {

	WebDriver driver;
	GeneralUtilities genUtility = new GeneralUtilities();
	WaitUtility w = new WaitUtility();

	String CategoryValue;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='col-sm-12']/a[1]")
	WebElement newCategoryButton;
	@FindBy(xpath = "//input[@name='category']")
	WebElement categoryField;
	@FindBy(id = "134-selectable")
	WebElement group;
	@FindBy(id = "main_img")
	WebElement chooseImageButton;
	@FindBy(xpath = "//button[@name='create']")
	WebElement categorySaveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement categoryAddSuccessAlertMessage;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[1]")
	List<WebElement> categoryTableCol1;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[4]/a[2]")
	List<WebElement> categoryTableDeleteButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement categoryDeleteSuccessAlertMessage;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[4]/a[1]")
	List<WebElement> categoryTableEditButton;
	@FindBy(name = "update")
	WebElement categoryUpdateButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement categoryUpdateSuccessAlertMessage;

	public void clickNewCategoryButton() {
		newCategoryButton.click();
	}

	public void enterCategory() {
		CategoryValue = "NewCategory" + genUtility.generateCurrentDateAndTime();
		genUtility.sendKeyFunction(categoryField, CategoryValue);
	}

	public void selectGroup() {
		group.click();
	}

	public void uploadFile(String filePath) {

		genUtility.fileUploadbySendKeys(driver, chooseImageButton, filePath);
	}

	public void clickSave() {
		categorySaveButton.click();
	}

	public String checkCategoryAddSuccess() {
		return categoryAddSuccessAlertMessage.getText();
	}

	public void scrolltoLocation(int hori, int vert) throws InterruptedException {
		// w.implicitWaitForSeconds(driver, 3);
		genUtility.scrollFunction(driver, hori, vert);
		// w.implicitWaitForSeconds(driver, 3);
	}

	public void deleteSpecificCategory() throws InterruptedException {

		for (int i = 0; i < categoryTableCol1.size(); i++) {

			if (categoryTableCol1.get(i).getText().contains("NewCategory")) {
				w.implicitWaitForSeconds(driver, 3);
				categoryTableDeleteButton.get(i).click();
				genUtility.alertAccept(driver);

				break;
			}
		}
	}

	public boolean checkForDeleteSuccessMessage() {
		String alertActual = categoryDeleteSuccessAlertMessage.getText();
		String alertExpected = "Category Deleted Successfully";
		boolean value = alertActual.contains(alertExpected);
		return value;
	}
	
	public void editSpecificCategory() throws InterruptedException {

		for (int i = 0; i < categoryTableCol1.size(); i++) {

			if (categoryTableCol1.get(i).getText().contains("NewCategory")) {
				w.implicitWaitForSeconds(driver, 3);
				categoryTableEditButton.get(i).click();
				break;
			}
		}
	}

	public void editCategoryValue() {
		String originalCategoryValue=categoryField.getText();
		genUtility.sendKeyFunction(categoryField, originalCategoryValue.concat("-edited"));
		
	}
	
	public void clickUpdate() {
		categoryUpdateButton.click();
	}
	
	public boolean checkForUpdateSuccessMessage() {
		String alertActual = categoryUpdateSuccessAlertMessage.getText();
		String alertExpected = "Category Updated Successfully";
		boolean value = alertActual.contains(alertExpected);
		return value;
	}

}
