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
	  hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
	  mp=hp.clickManageProductLink();
	  boolean foundProduct = mp.changeStockLevel("Carrot");
	  Assert.assertEquals(foundProduct, true, Constant.mp_findProductFailure);
	  if (foundProduct==true)
		  Assert.assertEquals(mp.verifyProductStatusChangeAlert(), true, Constant.mp_ProductStatusChangeAlert);
		  
  }
}
