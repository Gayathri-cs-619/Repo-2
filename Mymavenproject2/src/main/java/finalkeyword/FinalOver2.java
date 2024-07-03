package finalkeyword;
//overriding 
public class FinalOver2 extends FinalOver1{

	public void display()
	{
		System.out.println("second class method");
	}
	public static void main(String[] args) {
		FinalOver2 obj=new FinalOver2();
		obj.display();

	}

}
