package finalkeyword;

public class FinalProgram {
	final int a =7;//a is an instance variable//variable becomes constant when we give final keyword
	
	public void display()
	{
		//a=2;//instance variable has direct access to instance method.
			//The final field FinalProgram.a cannot be assigned.
		int a =2;//this wont error as its considered as a new variable - local.
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalProgram obj=new FinalProgram();
		obj.display();
		

	}

}
