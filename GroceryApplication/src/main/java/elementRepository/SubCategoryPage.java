package elementRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	WebElement categoryTableCell1;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr[1]/td[5]/a[2]")
	WebElement categoryFirstDeleteButton;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr/td[1]")
	List<WebElement> categoryTableCol1Values;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr/td")
	public
	List<WebElement> categoryTableElements;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']//tbody//tr/td[5]/a[2]")
	List<WebElement> categoryDeleteButtons;
	@FindBy(xpath = "//div/div/div[@class='alert alert-success alert-dismissible']")
	WebElement subCategoryDeleteSuccessAlert;
	@FindBy(xpath = "//section/div/a[2]")
	WebElement searchButton;
	@FindBy(xpath = "//select[@id='un']")
	WebElement categoryDropdownInSearchPage;
	@FindBy(xpath = "//input[@name='ut']")
	WebElement subCategoryFieldInSearchPage;
	@FindBy(xpath = "//button[@name='Search']")
	WebElement subCategorySearchButton;
	@FindBy(xpath = "//table/tbody/tr/td/span/center")
	WebElement subCategoryResultBody;
	
	
	public void clickNewButton() {

		newButton.click();
	}
	
	public void clickSearchButton() {

		searchButton.click();
	}
	
	public boolean searchSubCategory(String category,String subCategory) {

		//genUtility.dropDownselectionByValue(categoryDropdownInSearchPage, category);
		genUtility.dropDownselectionByVisibleText(categoryDropdownInSearchPage, category);
		
		genUtility.sendKeyFunctionforString(subCategoryFieldInSearchPage, subCategory);
		subCategorySearchButton.click();

		if (subCategoryResultBody.getText().contains("RESULT NOT FOUND"))
			return true;
		else
			return false;
	}
	
	

	public void selectCategory(int index) {

		genUtility.selectDropdownWithIndex(categorydropdown, index);
	}

	public void entersubCategoryText() {
		String subCategoryValue="678996"+genUtility.randon(1000);
		this.subCategoryValue=subCategoryValue;
		genUtility.sendKeyFunctionforString(subCategoryText, subCategoryValue);
		
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

		String subCategoryDerivedValue = categoryTableCell1.getText();
		
		if (subCategoryDerivedValue.equals(this.subCategoryValue))

			return true;

		else
			return false;
	}

	
	public String deleteFirstSubCategory() {

		categoryFirstDeleteButton.click();
		String deleteAlertText=genUtility.getAlertText(driver);
		genUtility.alertAccept(driver);
		return deleteAlertText;
		
		
	}
	
	public String readTableElement(int row,int col)
	{
		
		WebElement tableCelleach
		=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-sm']//tbody//tr["+row+"]/td["+col+"]"));
		return tableCelleach.getText();
	}
	
	public String deleteAddedSubCategory() {
		String deleteAlertText="null";

		for (int k=0;k<categoryTableCol1Values.size();k++)
		{
			if (categoryTableCol1Values.get(k).getText().equals(subCategoryValue))
					{
					categoryDeleteButtons.get(k).click();
					genUtility.alertAccept(driver);
					break;
					}
			
		}
		deleteAlertText=subCategoryDeleteSuccessAlert.getText();
		return deleteAlertText;
	}
	
	public String deleteSpecificSubCategory(String subCategory) {
		String deleteAlertText="null";

		for (int k=0;k<categoryTableCol1Values.size();k++)
		{
			if (categoryTableCol1Values.get(k).getText().equals(subCategory))
					{
					categoryDeleteButtons.get(k).click();
					genUtility.alertAccept(driver);
					break;
					}
			
		}
		deleteAlertText=subCategoryDeleteSuccessAlert.getText();
		return deleteAlertText;
	}

	
}
