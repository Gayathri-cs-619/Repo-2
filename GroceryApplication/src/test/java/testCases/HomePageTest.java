package testCases;

import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;

public class HomePageTest extends BaseClass{
	
	LoginPage lp;
	HomePage hp;
	
  @Test(dataProvider="data-provider-1",dataProviderClass=LoginPageTest.class)
  public void clickSubCategoryLink(String userName,String password) {
	  
	  lp=new LoginPage(driver);
	  hp=lp.performLogin(userName,password);
	  hp.clickSubCategoryLink();
	  
  }
}
