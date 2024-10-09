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
		Assert.assertEquals(scp.subCategorySaveStatus(), true, "Add failure");
		hp.clickSubCategoryLink();
		Assert.assertEquals(scp.findCategoryTableNewValue(), true, "Cant find the added value");
																		

	}
	
	@Test(dataProvider = "data-provider-1", dataProviderClass = LoginPageTest.class)
	public void deleteCategoryTableNewValue(String userName, String password) {

		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		scp = new SubCategoryPage(driver);
		lp.loginwithValidCredentials(userName, password);
		hp.clickSubCategoryLink();
		scp.deleteSubCategory();//need to make it per the added element. how can we find the added element between 2 tests?
		

	}

}
