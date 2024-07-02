package encapsulation;

public class StudentDetails {
	private String name;
	private int age;

public String getName()
{
	return name;
}

public int getAge()//bind the variable age and getter method.
{
	return age;
}

public void setName(String name)
{
	this.name=name;
}

public void setAge(int age)
{
	this.age=age;
}
}
