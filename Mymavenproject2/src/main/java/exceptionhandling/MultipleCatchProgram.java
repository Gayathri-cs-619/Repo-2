package exceptionhandling;

public class MultipleCatchProgram {

	public static void main(String[] args) {
		try
		{
			int a =10/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);	
			System.out.println("Exception Handled");
		}
		catch(ArithmeticException e)//this one will ONLY be executed.
		{
			System.out.println(e);	
			System.out.println("Exception Handled");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);	
			System.out.println("Exception Handled");
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);	
			System.out.println("Exception Handled");
		}

	}

}
