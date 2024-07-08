package exceptionhandling;
//exception that occurs when string is attempted to be converted to number.
public class NumberFormatExceptionProgram {

	public static void main(String[] args) {
	
		/*String str="hello";
		 int num=Integer.parseInt(str);
		 System.out.println(num);*///Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
		
		try
		{
		 String str="hello";
		 int num=Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);	
			System.out.println("Exception Handled");		
		}

	}

}
