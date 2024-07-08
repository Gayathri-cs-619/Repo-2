package exceptionhandling;

public class ArithmeticExceptionProgram {

	public static void main(String[] args) {
		/*int a=5/0;
		System.out.println(a);*///Run time Exception in thread "main" java.lang.ArithmeticException: / by zero
		try
		{
			int a=5/0;
		}
		catch(ArithmeticException e)
		{	
			System.out.println(e);	
			System.out.println("Exception Handled");		
		}

	}

}
