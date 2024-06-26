package inhertiance;

public class Mango extends Tree{

	
	public void green()
	{
		System.out.println("Mangoes are green now");
	}
	
public static void main(String[] args)
	{
	
	Mango mang = new Mango();
	Cocount coc = new Cocount();//no inheritance relationship to coconut. (Hierarchial). so, create coconut's class.
	
	mang.green();
	mang.height();
	coc.yellow();
	}
}
