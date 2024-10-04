package basicTestNG;

import org.testng.annotations.Test;

public class BasicTestNG {
  @Test(priority=-1,groups="smoke")
  public void testCase09() {
	  System.out.println("testCase09");
	  }
  @Test(priority=2)
  public void testCase02() {
	  System.out.println("testCase02");
	  }
  
  @Test(enabled=false)
  public void testCase07() {
	  System.out.println("testCase07");
	  }
  
  @Test(priority=1,enabled=false)
  public void testCase04() {
	  System.out.println("testCase04");
	  }
  
  @Test(enabled=true)
  public void testCase05() {
	  System.out.println("testCase05");
	  }
  
  
}
