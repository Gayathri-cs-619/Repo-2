package inhertiance;

public class Seed extends Flower
{
public void soil()
{
System.out.println("Seed grows in soil");
}
public static void main(String[] args)
{
Seed obj=new Seed();
obj.soil();
obj.color();
obj.leaf();
}
}