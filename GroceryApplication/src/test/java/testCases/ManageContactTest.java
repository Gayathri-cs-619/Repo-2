package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.ManageCategoryPage;
import elementRepository.ManageContactPage;

public class ManageContactTest extends BaseClass{
	
	LoginPage lp;
	HomePage hp;
	ManageContactPage mcontactp;
  @Test
  public void verifyManageContactPageheader() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
	  mcontactp=hp.clickManageContactLink();
	  Assert.assertEquals(mcontactp.getHeader(),"Contact Us", Constant.mcontactp_getHeader);
  }
  
  @Test
  public void verifyManageContactPageTableHeader() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
	  mcontactp=hp.clickManageContactLink();
	  Assert.assertEquals(mcontactp.compareHeaderValues(),true,Constant.mcontactp_verifyManageContactPageTable);
  }
  
  @Test
  public void verifyManageContactPageTableRow() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
	  mcontactp=hp.clickManageContactLink();
	  Assert.assertEquals(mcontactp.checkContactRecord(),true,Constant.mcontactp_verifyContactRecords);
  }
  
  @Test
  public void verifyUpdateContact() throws IOException, InterruptedException {
	  lp=new LoginPage(driver);
	  hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
	  mcontactp=hp.clickManageContactLink();
	  mcontactp.clickEditButton();
	  mcontactp.editPhoneNumber(7890);
	  mcontactp.clickUpdateContact();
	  
  }
}
