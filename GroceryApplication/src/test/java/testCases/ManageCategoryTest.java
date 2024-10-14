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

public class ManageCategoryTest extends BaseClass{
	
	LoginPage lp;
	HomePage hp;
	ManageCategoryPage mcp;
  @Test
  public void addNewCategory() throws IOException, InterruptedException {
	  lp = new LoginPage(driver);
		hp = new HomePage(driver);
		mcp = new ManageCategoryPage(driver);
		String userName=lp.loginUser(1,0);
		  String password=lp.loginPassWord(1,1);
		  lp.loginwithValidCredentials(userName,password);
		  hp.clickManageCategoryLink();
		  mcp.clickNewCategoryButton();
		  mcp.enterCategory();
		  mcp.selectGroup();
		  String filePath="D:\\\\Java Session\\\\PIC.jpg";
		  mcp.uploadFile(filePath);
		 Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,4500)");
		  mcp.clickSave();
		  String alertActual=mcp.checkCategoryAddSuccess();
		  String alertExpected="Category Created Successfully";
		  boolean value = alertActual.contains(alertExpected);
		  assertTrue(value);
			Assert.assertEquals(value, true, Constant.mcp_addNewCategoryAlert);
  }
}
