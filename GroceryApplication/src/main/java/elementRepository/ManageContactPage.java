package elementRepository;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;
import utilities.WaitUtility;

public class ManageContactPage {
	WebDriver driver;
	GeneralUtilities genUtility = new GeneralUtilities();
	WaitUtility w = new WaitUtility();

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Contact Us']")
	WebElement contactPageHeader;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/thead/tr/th")
	List<WebElement> contactTableHeaders;
	@FindBy (xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr")
	List<WebElement> contactRecord;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[6]")
	WebElement editContactButton;
	@FindBy(id="phone")
	WebElement phoneField;
	@FindBy( name ="Update")
	WebElement updateButton;
	
	public String getHeader() {
		return contactPageHeader.getText();
		
	}
	
	public boolean compareHeaderValues() {
		List<String> expectedContactHeaders=new ArrayList();
		List<String> actualContactHeaders = new ArrayList();
		expectedContactHeaders.add("Phone");
		expectedContactHeaders.add("Email");
		expectedContactHeaders.add("Address");
		expectedContactHeaders.add("Delivery_time");
		expectedContactHeaders.add("Delivery Charge Limit");
		expectedContactHeaders.add("Action");
		
		for (int i=0;i<contactTableHeaders.size();i++) {
			
			actualContactHeaders.add(contactTableHeaders.get(i).getText());
			
		}		
		boolean headerComparisonResult=actualContactHeaders.containsAll(expectedContactHeaders);
		return headerComparisonResult;	
		
	}
	
	public boolean checkContactRecord() {
		int contactCount=contactRecord.size();
		if (contactCount >= 1)
				return true;
		else
			return false;
		
	}
	
	public void clickEditButton() {
		editContactButton.click();
	}
	
	public void editPhoneNumber(int newPhoneNumber) {
		phoneField.clear();
		genUtility.sendKeyFunctionforInt(phoneField,newPhoneNumber);
		}
	
	public void clickUpdateContact() throws InterruptedException {
		genUtility.scrollFunction(driver, 0, 10000);
		w.explicitWaitForWebElement(driver, updateButton);
		updateButton.click();
		//genUtility.clickJavaScriptExecutor(updateButton, driver);
	}
}

