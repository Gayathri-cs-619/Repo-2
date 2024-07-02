package encapsulation;

public class Employee {
	private String name;
	private int age;
	private float salary;

public String getName()
{
	return name;
}

public int getAge()//bind the variable age and getter method.
{
	return age;
}

public float getSal()//bind the variable age and getter method.
{
	return salary;
}


public void setName(String name)
{
	this.name=name;
}

public void setAge(int age)
{
	this.age=age;
}

public void setSal(float salary)
{
	this.salary=salary;
}
}
