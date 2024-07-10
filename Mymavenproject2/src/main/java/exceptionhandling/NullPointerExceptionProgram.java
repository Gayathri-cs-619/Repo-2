package exceptionhandling;

public class NullPointerExceptionProgram {

	
	public static void main(String[] args) {
		
		/*String str = null;
		System.out.println(str);//will run
		if(str.equals("Gayathri") )
//gets exception in above line
//Exception in thread "main" java.lang.NullPointerException:
//Cannot invoke "String.equals(Object)" because "str" is null
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are NOT same");
		}
		System.out.println(str);//wont run*/
		try
		{
			String str = null;
			System.out.println(str);//will run
			if(str.equals("Gayathri") )
			{
				System.out.println("Strings are same");
			}
			else
			{
				System.out.println("Strings are NOT same");
			}
			//System.out.println(str);//THIS STMT DIDNT RUN. "IF" LOOP Will get exited , but shudnt this run???
			//It didnt run as its inside the try block. You should have kept it outside.
			//here, try block encounters exception and goes to catch block.
		}
		catch(NullPointerException e)
		{
			System.out.println(e);	
			System.out.println("Exception Handled");
		
		}
		
	}

}
