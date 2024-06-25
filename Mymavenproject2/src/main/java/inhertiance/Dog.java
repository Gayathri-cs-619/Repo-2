package inhertiance;

public class Dog extends Animal
{
public void sleep()
{
System.out.println("sleeping");
}
public static void main(String[] args)
{
Dog obj=new Dog();
obj.sleep();
obj.run();
}

}

