package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import elementRepository.HomePage;
import elementRepository.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
  @Test(dataProvider="data-provider-1")
  public void verifyLoginWithValidCredentials(String userName,String password) {
	  lp=new LoginPage(driver);
	  hp=new HomePage(driver);
	  lp.loginwithValidCredentials(userName,password);
	  String actualHeading=hp.readHeading();
	  String expectedHeading="7rmart supermarket";
	  System.out.println(actualHeading);
	  Assert.assertEquals(actualHeading, expectedHeading,":Heading text not as expected");
	 
  }
  
  @Test
  public void verifyLoginWithInvalidCredentials() {
	  lp=new LoginPage(driver);
	  hp=new HomePage(driver);
	  lp.loginwithInvalidCredentials("Gayathri","randomuser");
	  String actualMessage=lp.readInvalidMessage();
	  String expectedMessage="Alert!";
	  System.out.println(actualMessage);
	  Assert.assertEquals(actualMessage, expectedMessage,":Invalid user error message not as expected");
  }
  
  @DataProvider (name = "data-provider-1")
	public Object[][] dpMethod(){
	return new Object[][] {{"admin","admin" }};
	}
}
