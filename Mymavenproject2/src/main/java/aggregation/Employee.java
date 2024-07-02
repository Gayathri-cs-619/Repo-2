package aggregation;

public class Employee {
int id;
String name;

Address address;//1st class's reference object is created inside second class as a instance variable.

Employee(int id,String name,Address address)
{
	this.id=id;
	this.name=name;
	this.address=address;
}

public void display()
{
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
}

public static void main(String[] args)
{
	Address obj1=new Address("TVM","Kerala","India");
	Employee obj=new Employee(456,"Gayathri",obj1);
	
	obj.display();
}

}
