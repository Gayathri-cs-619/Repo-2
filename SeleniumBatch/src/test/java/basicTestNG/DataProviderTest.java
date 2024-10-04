package basicTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
  @Test(dataProvider="data-provider")
  public void testCase01(int a,int b) {
	  System.out.println(a+b);
  }
  
  @Test(dataProvider="data-provider",dataProviderClass=BasicAnnotation.class)
  public void testCase02(int a,int b, String c) {
	  System.out.println(a+b+" c");
  }
  
  @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
	return new Object[][] {{2, 3 }, {5, 7}, {4,8}};
	}
}
