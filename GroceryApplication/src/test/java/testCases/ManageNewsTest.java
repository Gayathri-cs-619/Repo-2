package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.HomePage;
import elementRepository.LoginPage;
import elementRepository.ManageNewsPage;

public class ManageNewsTest extends BaseClass{
	
	LoginPage lp;
	HomePage hp;
	ManageNewsPage mnp;
  @Test
  public void verifyLaunchofManageNewsPage() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
	  mnp=hp.clickManageNewsLink();
	  Assert.assertEquals(mnp.verifyTitleinNews(),"Manage News",Constant.mnp_verifyTitleinNews);
	  Assert.assertEquals(mnp.verifyHyperlinksinNews(),true,Constant.mnp_verifyHyperlinksinNews);
	  Assert.assertEquals(mnp.verifyButtonsCountinNews(),3,Constant.mnp_verifyButtonsCountinNews);
	  Assert.assertEquals(mnp.verifyButtonsinNews(),true,Constant.mnp_verifyButtonsinNews);
	  Assert.assertEquals(mnp.verifyTableHeadersinNews(),true,Constant.mnp_verifyTableHeadersinNews);
	  Assert.assertEquals(mnp.verifyTableRecordsinNews(),true,Constant.mnp_verifyTableRecordsinNews);
  }
  
  @Test
  public void verifyAddfNews() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
	  mnp=hp.clickManageNewsLink();
	  mnp.clickNewNews();
	  mnp.addNews("This is a new news");
	  Assert.assertEquals(mnp.checkForAddSuccessMessage(),true,Constant.mnp_verifyAddNews);
  }
  
  @Test
  public void verifyEditofNews() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
	  mnp=hp.clickManageNewsLink();
	  mnp.clickEditNews();
	  mnp.editNews();
	  Assert.assertEquals(mnp.checkForUpdateSuccessMessage(),true,Constant.mnp_verifyNewsEdit);
  }
  
  @Test
  public void verifySearchNews() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.performLogin(loginData(1, 0), loginData(1, 1));
	  mnp=hp.clickManageNewsLink();
	  mnp.clickSearchNews();
	  mnp.SearchNews();
	  Assert.assertEquals(mnp.readsearchresults(),0,Constant.mnp_readsearchresults);
  }
}
