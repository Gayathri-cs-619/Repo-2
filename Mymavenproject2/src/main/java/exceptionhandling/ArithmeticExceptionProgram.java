package exceptionhandling;

public class ArithmeticExceptionProgram {

	public static void main(String[] args) {
		/*int a=5/0;
		System.out.println(a);*///Run time Exception in thread "main" java.lang.ArithmeticException: / by zero
		try
		{
			int a=5/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{	
			System.out.println(e);	
			System.out.println("Exception Handled");		
		}
		finally //will execute irrespective of whether exception is handled or not. 
		//i.e, even if "catch" didn't execute
		{
			System.out.println("hello world");	
		}

	}

}
