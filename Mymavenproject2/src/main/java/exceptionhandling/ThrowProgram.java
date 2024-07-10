package exceptionhandling;

public class ThrowProgram {
	public void verification(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not eligible");//this will throw exception and program wont proceed.
		}
		else
		{
			System.out.println("Person is eligible");
		}
	}
	
	public static void main(String[] args) {
		ThrowProgram obj=new ThrowProgram();
		obj.verification(15);
		
		System.out.println("PROGRAM PROCEEDS");

	}

}
