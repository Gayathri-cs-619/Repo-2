package thisprograms;

public class Test_This_3
{

	Test_This_3()
	{
		//this(5);//can be used to call other constructor. In this case dont have to pass parameter from main.
		System.out.println("hai");
	}
	Test_This_3(int x)
	{	
		this();//constructor case. This function will call the default constructor. shud b fiurst stmt
		System.out.println("The integer is: "+x);   
	}
	public static void main(String[] args) 
	{
		Test_This_3 obj=new Test_This_3(5);
	}

}