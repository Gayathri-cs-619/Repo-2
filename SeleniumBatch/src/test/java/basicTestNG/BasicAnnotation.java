package basicTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BasicAnnotation {
  @Test(groups="smoke")
  public void testCase01() {
	  System.out.println("testCase01");
  }
  
  @Test
  public void testCase02() {
	  System.out.println("testCase02");
  }
  
  @Test
  public void testCase03() {
	  System.out.println("testCase03");
  } 

  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after Suite");
  }
  
  @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
	return new Object[][] {{2, 3 ,"Ramu"}, {5, 7,"Isha"}, {4,8,"Ishaan"}};
	}

}
