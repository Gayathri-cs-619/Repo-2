package abstraction;

public abstract class Animal {
	
	abstract void run();//abstract methods do not specify a body
	
	public void jump()
	{
		System.out.println("Jumping");
	}

}

//modifiers:
//default - inside package access
//private-inside class
//protected - inside package, to access outside need child class (ie, extend)
//public - inside and outside package
 