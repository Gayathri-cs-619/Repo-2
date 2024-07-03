package finalkeyword;

public class Dog extends Animal{
	
	public void lifeofDog()
	{
		System.out.println("I live in kennel");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog();
		obj.lifeofDog();
		obj.lifeofAnimal();
	}

}
