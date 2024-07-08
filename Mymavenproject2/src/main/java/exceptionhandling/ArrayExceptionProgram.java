package exceptionhandling;

public class ArrayExceptionProgram {

	public static void main(String[] args) {
		/*int a[]=new int[5];
		a[7]=5;*/
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
		try
		{
			int a[]=new int[5];
			a[7]=5;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);	
			System.out.println("Exception Handled");
		}

	}

}
