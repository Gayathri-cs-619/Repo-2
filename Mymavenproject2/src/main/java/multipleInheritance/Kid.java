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
//if parent class methods have same name, cant implement both methods .  Remember that multiple inheritance
//purpose is to get functions from both parents.