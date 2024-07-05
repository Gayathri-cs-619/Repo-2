package interfaces;

public class Bike implements Vehicle{ //interface to interface 'extends'. interface to class 'implements'
	
	public void show()
	{
		System.out.println("Yamaha Bike");
	}

	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.show();

	}

}
