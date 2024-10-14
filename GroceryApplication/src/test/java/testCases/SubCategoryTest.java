package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.SubCategoryPage;

public class SubCategoryTest extends BaseClass {

	LoginPage lp;
	HomePage hp;
	SubCategoryPage scp;

	@Test(dataProvider = "data-provider-1", dataProviderClass = LoginPageTest.class,enabled=false)
	public void addNewSubCategory(String userName, String password) {

		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		scp = new SubCategoryPage(driver);
		lp.loginwithValidCredentials(userName, password);
		hp.clickSubCategoryLink();
		scp.clickNewButton();
		scp.selectCategory(2);
		scp.entersubCategoryText();
		scp.clickSubCategorySave();
		// scp.subCategorySaveStatus();
		Assert.assertEquals(scp.subCategorySaveStatus(), true, "Add failure");
		hp.clickSubCategoryLink();
		Assert.assertEquals(scp.findCategoryTableNewValue(), true, Constant.scp_addNewSubCategoryAlert);
		
		//below code is to cleanup/delete the data entered in this test run
		if (scp.findCategoryTableNewValue()==true)
		{
			String deleteAlertText=scp.deleteAddedSubCategory();
			if (deleteAlertText.contains("Sub Category Deleted Successfully"))
			{
				System.out.println("Delete success");
			}
			else
			{
				System.out.println("Delete failure");
			}
		}
		
		
	}
	
	@Test(dataProvider = "data-provider-1", dataProviderClass = LoginPageTest.class)
	public void deleteCategoryTableNewValue(String userName, String password) {

		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		scp = new SubCategoryPage(driver);
		lp.loginwithValidCredentials(userName, password);
		hp.clickSubCategoryLink();
		//need to make it per the added element. how can we find the added element between 2 tests?call based on fixed number and delete
		String subCategory =scp.readTableElement(1,1);
		String category =scp.readTableElement(1,2);
		/*String Expected = "Sub Category Deleted Successfully";//another method
		String alertDel = sc.readAlert();
		boolean value = alertDel.contains(Expected);
		assertTrue(value);*/
		String alertActual=scp.deleteSpecificSubCategory(subCategory);
		String alertExpected="×\n"
				+ "Alert!\n"
				+ "Sub Category Deleted Successfully";
		Assert.assertEquals(alertActual, alertExpected, Constant.scp_deleteCategoryTableNewValue);
		scp.clickSearchButton();
		Assert.assertEquals(scp.searchSubCategory(category,subCategory), true, Constant.scp_deleteCategoryTableandsearchforthesame);

	}
	
	
}

