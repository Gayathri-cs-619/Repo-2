package basicTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {
	@Test
	@Parameters({"Parameter1","Parameter2"})
	public void parameterFunction(int a , String b) {
		System.out.println(a);
		System.out.println(b);
	}
}
