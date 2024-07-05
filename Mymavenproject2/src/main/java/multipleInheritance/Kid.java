package multipleInheritance;

public class Kid implements Father, Mother {
	
	public void gender()
	{
		System.out.println("Male");
	}
	public static void main(String[] args) {
		Kid obj=new Kid();
		obj.gender();
	}
}
