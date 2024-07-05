package interfaces;

public class HomePage implements Login,Credentials{

	public void url()
	{
		System.out.println("Paste url in browser and hit enter");
	}
	
	public void username()
	{
		System.out.println("Enter username and hit enter");
		//a=10;//Error = final field login.a cannot be assigned
		System.out.println(a);//Success prints variable value from interface
	}
	
	public static void main(String[] args) {
		
		HomePage obj=new HomePage();
		obj.url();
		obj.username();
		//a=7;//Error = final field login.a cannot be assigned
		//System.out.println(obj.a);//Success prints variable value from interface
	}

}
