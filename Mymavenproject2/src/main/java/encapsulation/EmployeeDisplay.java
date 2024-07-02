package encapsulation;

public class EmployeeDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 obj=new Employee2();
		
	//	System.out.println("Name of employee: "+obj.name);		only getter method can access this private variable. This is the advantage and difference of encapsulation.
		System.out.println("Name of employee: "+obj.getName());
		System.out.println("Age of employee: "+obj.getAge());
		System.out.println("Salary of employee: "+obj.getSal());
	}

}
