package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.GeneralUtilities;

public class ManageCategoryPage {
	
	WebDriver driver;
	GeneralUtilities genUtility = new GeneralUtilities();
	FileUploadUtility fileUploadUtility = new FileUploadUtility();
	
	String CategoryValue;
	
	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[@class='col-sm-12']/a[1]")
	WebElement newCategoryButton;
	@FindBy (xpath="//input[@name='category']")
	WebElement categoryField;
	@FindBy (id="134-selectable")
	WebElement group;
	@FindBy (id="main_img")
	WebElement chooseImageButton;
	@FindBy (xpath="//button[@name='create']")
	WebElement categorySaveButton;
	@FindBy (xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement categoryAddSuccessAlertMessage;
	
	public void clickNewCategoryButton()
	{
		newCategoryButton.click();
	}
	public void enterCategory()
	{
		CategoryValue="NewCategory"+genUtility.generateCurrentDateAndTime();
		genUtility.sendKeyFunction(categoryField, CategoryValue);
	}
	
	public void selectGroup()
	{
		group.click();
	}
	
	public void uploadFile(String filePath)
	{
		
		fileUploadUtility.fileUploadbySendKeys(driver, chooseImageButton, filePath);
	}
	
	public void clickSave()
	{
		categorySaveButton.click();
	}
	
	public String checkCategoryAddSuccess()
	{
		return categoryAddSuccessAlertMessage.getText();
	}

}
