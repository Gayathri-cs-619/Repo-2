package superkeyword;

public class SuperChildConstructor extends SuperParentConstructor{
	String name="Ashwin";
	SuperChildConstructor()
	{
		// super() is added in each class constructor automatically by compiler if there is no super() or this().
		//And super invokes immediate parent class constructor 
	
		System.out.println("Ashwin");
		
		
	}
	
	
	public static void main(String[] args) {
		
		SuperChildConstructor obj=new SuperChildConstructor();
		
		
		
	}
}
