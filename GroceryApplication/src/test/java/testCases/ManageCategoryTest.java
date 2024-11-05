package testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.ManageCategoryPage;
import elementRepository.ManageProductPage;
import elementRepository.SubCategoryPage;

public class ManageCategoryTest extends BaseClass {

	LoginPage lp;
	HomePage hp;
	ManageCategoryPage mcp;

	@Test(enabled=false)
	public void addNewCategory() throws IOException, InterruptedException {
		lp = new LoginPage(driver);
		hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
		mcp=hp.clickManageCategoryLink();
		mcp.clickNewCategoryButton();
		mcp.enterCategory();
		mcp.selectGroup();
		String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\uploadFiles\\PIC.jpg"	;
		mcp.uploadFile(filePath);
		Thread.sleep(2000);
		//mcp.scrolltoLocation(334,10000);
		Thread.sleep(2000);//this step is key to scroll success
		mcp.clickSave();
		String alertActual = mcp.checkCategoryAddSuccess();
		String alertExpected = "Category Created Successfully";
		boolean value = alertActual.contains(alertExpected);
		assertTrue(value);
		Assert.assertEquals(value, true, Constant.mcp_addNewCategoryAlert);
		hp.clickManageCategoryLink();
		mcp.deleteSpecificCategory();
		boolean deleteAlertPresence=mcp.checkForDeleteSuccessMessage();
		Assert.assertEquals(deleteAlertPresence, true, Constant.mcp_deleteSpecificCategoryAlert);
	}
	
	@Test
	public void editNewCategory() throws IOException, InterruptedException {
		lp = new LoginPage(driver);
		mcp = new ManageCategoryPage(driver);
		hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
		hp.clickManageCategoryLink();
		mcp.clickNewCategoryButton();
		mcp.enterCategory();
		mcp.selectGroup();
		String filePath=System.getProperty("user.dir")+"\\src\\test\\resources\\uploadFiles\\PIC.jpg"	;
		mcp.uploadFile(filePath);
		mcp.clickSave();
		String alertActual = mcp.checkCategoryAddSuccess();
		String alertExpected = "Category Created Successfully";
		boolean value = alertActual.contains(alertExpected);
		assertTrue(value);
		Assert.assertEquals(value, true, Constant.mcp_addNewCategoryAlert);
		hp.clickManageCategoryLink();
		mcp.editSpecificCategory();
		mcp.editCategoryValue();
		mcp.clickUpdate();
		boolean updateAlertPresence=mcp.checkForUpdateSuccessMessage();
		Assert.assertEquals(updateAlertPresence, true, Constant.mcp_updateSpecificCategoryAlert);
	}
}
