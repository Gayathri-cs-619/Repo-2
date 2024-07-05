package interfaces;

public class General implements Doctors {
	
	public void nameBoard()
	{
		System.out.println("MBBS");
	}

	public static void main(String[] args) {
		General obj1=new General();
		obj1.nameBoard();
		Dental obj2=new Dental();
		obj2.nameBoard();

	}

}
