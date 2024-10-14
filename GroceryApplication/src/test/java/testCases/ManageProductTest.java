package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.ManageProductPage;

public class ManageProductTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	ManageProductPage mp;
  @Test
  public void changeStockStatus() throws IOException {
	  lp=new LoginPage(driver);
	  hp=new HomePage(driver);
	  mp=new ManageProductPage(driver);
	  String userName=lp.loginUser(1,0);
	  String password=lp.loginPassWord(1,1);
	  lp.loginwithValidCredentials(userName,password);
	  hp.clickManageProductLink();
	  boolean foundProduct = mp.changeStockLevel("Carrot");
	  Assert.assertEquals(foundProduct, true, Constant.mp_findProductFailure);
	  if (foundProduct==true)
		  Assert.assertEquals(mp.verifyProductStatusChangeAlert(), true, Constant.mp_ProductStatusChangeAlert);
		  
  }
}
