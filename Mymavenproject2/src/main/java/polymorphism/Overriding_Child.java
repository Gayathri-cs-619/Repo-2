package polymorphism;

//preview to super keyword learning. Without super keyword, only the child class value will print.

public class Overriding_Child extends Overriding_Parent {
	public void task1(int a)
	{
		System.out.println("I am the child and parameter value is :"+a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overriding_Child obj=new Overriding_Child();
		obj.task1(1);
		obj.task1(2);
	}

}
