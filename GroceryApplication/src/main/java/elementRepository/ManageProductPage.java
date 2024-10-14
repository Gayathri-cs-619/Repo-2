package elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageProductPage {
	WebDriver driver;
	GeneralUtilities genUtility = new GeneralUtilities();

	public ManageProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[1]")
	List<WebElement> productTitleList;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[6]/a[1]")
	List<WebElement> stockPresent;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement productStatusChangeAlert;

	public boolean changeStockLevel(String product) {
		int statusflag = 0;

		for (int i = 0; i < productTitleList.size(); i++) {
			if (productTitleList.get(i).getText().contains(product)) {
				stockPresent.get(i).click();
				statusflag = 1;
				break;
			}

		}
		if (statusflag == 1)
			return true;
		else
			return false;

	}

	public boolean verifyProductStatusChangeAlert() {
		int alertflag = 0;
		String alertMessage = productStatusChangeAlert.getText();

		if (alertMessage.contains("Changed Successfully")) {
			alertflag = 1;
		}
		if (alertflag == 1)
			return true;
		else
			return false;
	}
}
