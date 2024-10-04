package basicTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BeforeAndAfterAnnotation {
  @Test
  public void testCase01() {
	  System.out.println("testCase01");
  }
  @Test(groups="smoke")
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

}
