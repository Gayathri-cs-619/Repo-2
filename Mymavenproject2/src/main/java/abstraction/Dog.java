package abstraction;

public class Dog extends Animal {
	
	void run() //implementation of abstract (dont't use abstract keyword here)
	{
		System.out.println("Running");
		a=6;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		//Dog obj=new Dog();
		Animal obj=new Dog();//upcasting - creating an object for parent using the help of child. Can't create obj for abstract class.
		obj.run();
		obj.jump();
		
	}

}
