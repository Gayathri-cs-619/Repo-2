package superkeyword;

public class SuperChild extends SuperParent{
	String name="Rashwin";
	public void show()
	{
		System.out.println(name);
		System.out.println(super.name);//refers to parent class instance variable
	}
	
	public static void main(String[] args) {
		SuperChild obj=new SuperChild();
		obj.show();
		
	}
}
