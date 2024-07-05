package abstraction;

public class Jasmine extends Plant {
	void color()
	{
		System.out.println("Jasmines are white");
	}
	
public static void main(String[] args) {
		
		Plant obj=new Jasmine();//upcasting - creating an object for parent using the help of child. Can't create obj for abstract class.
		Plant obj2=new Rose();
		obj.color();
		obj2.color();
	}
}
