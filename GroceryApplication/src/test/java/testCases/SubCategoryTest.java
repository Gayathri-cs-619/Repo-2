package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.SubCategoryPage;

public class SubCategoryTest extends BaseClass {

	LoginPage lp;
	HomePage hp;
	SubCategoryPage scp;

	@Test(dataProvider = "data-provider-1", dataProviderClass = LoginPageTest.class)
	public void addNewCategory(String userName, String password) {

		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		scp = new SubCategoryPage(driver);
		lp.loginwithValidCredentials(userName, password);
		hp.clickSubCategoryLink();
		scp.clickNewButton();
		scp.selectCategory();
		scp.entersubCategoryText();
		scp.clickSubCategorySave();
		// scp.subCategorySaveStatus();
		Assert.assertEquals(scp.subCategorySaveStatus(), true, "Pass");// how to handle already exist case? now it will
																		// show assertion error

	}
	
	@Test(dataProvider = "data-provider-1", dataProviderClass = LoginPageTest.class)
	public void verifyfindCategoryTableNewValue(String userName, String password) {

		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		scp = new SubCategoryPage(driver);
		lp.loginwithValidCredentials(userName, password);
		hp.clickSubCategoryLink();
		boolean s=scp.findCategoryTableNewValue();
		System.out.println(s);
	
		

	}

}
