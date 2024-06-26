package inhertiance;

public class Cocount extends Tree{
	public void yellow()
		{
			System.out.println("Cocounts are yellow now");
		}

public static void main(String[] args)
	{
	Cocount coc = new Cocount();
	Mango mang = new Mango();//no inheritance relationship to Mango. (Hierarchial). so, create Mango's class.
	
	coc.yellow();
	coc.height();
	mang.green();
	}
}
