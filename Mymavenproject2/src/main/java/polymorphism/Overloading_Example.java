package polymorphism;

public class Overloading_Example {

	public void work1(int a , int b)
	{
		int c=a+b;
		System.out.println("Sum of provided numbers is "+ c);
	}
	
	public void work2(char a, char b)
	{
		System.out.println("Provided characters are "+ a+ " and "+b);
	}
	
	public void work3(String a, double b)
	{
		System.out.println(a+" got "+b+" kgs of rice");
	}
	
	
	public static void main(String[] args)
	{
		Overloading_Example obj=new Overloading_Example();
		obj.work1(1,2);
		obj.work2('a','b');
		obj.work3("Syama",1.5);
	}
}
