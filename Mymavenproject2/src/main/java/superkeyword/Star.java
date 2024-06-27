package superkeyword;

public class Star extends Sky{
	
	public void light()
	{
		super.light();//refers to immediate parent class method
		System.out.println("Sky is bright because of stars");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Star obj = new Star();
		obj.light();
		

	}

}
