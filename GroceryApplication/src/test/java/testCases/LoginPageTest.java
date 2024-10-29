package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.HomePage;
import elementRepository.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	
 /* @Test(dataProvider="data-provider-1")
  public void verifyLoginWithValidCredentials(String userName,String password) throws IOException {
	  lp=new LoginPage(driver);
	  hp=new HomePage(driver);
	  lp.loginwithValidCredentials(userName,password);
	  String actualHeading=hp.readHeading();
	  String expectedHeading="7rmart supermarket";
	  System.out.println(actualHeading);
	  Assert.assertEquals(actualHeading, expectedHeading,Constant.lp_verifyLoginWithValidCredentials);
	 
  }*/
  
  @Test
  public void verifyLoginWithValidCredentials() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.performLogin(loginData(1,0),loginData(1,1));
	  String actualHeading=hp.readHeading();
	  String expectedHeading="7rmart supermarket";
	  System.out.println(actualHeading);
	  Assert.assertEquals(actualHeading, expectedHeading,Constant.lp_verifyLoginWithValidCredentials);
	 
  }
  
  @Test(enabled=false)
  public void verifyLoginWithInvalidCredentials() throws IOException {
	  lp=new LoginPage(driver);
	  lp.performLogin(loginData(2,0),loginData(2,1));
	  String actualMessage=lp.readInvalidMessage();
	  String expectedMessage="Alert!";
	  Assert.assertEquals(actualMessage, expectedMessage,Constant.lp_verifyLoginWithInValidCredentials);
  }
  
  @DataProvider (name = "data-provider-1")
	public Object[][] dpMethod(){
	return new Object[][] {{"admin","admin" }};
	}
}
