package exceptionhandling;

public class MultipleCatchNullPointer {

	public static void main(String[] args) {
		try
		{
			String str=null;
			if(str.length() > 1)
			{
				System.out.println("Not a null string");
			}
			else
			{
				System.out.println("Null string");
			}
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);	
			System.out.println("Exception Handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);	
			System.out.println("Exception Handled");
		}
		catch(Exception e)//parent class
		{
			System.out.println(e);	
			System.out.println("Parent Exception");
		}

	}

}
