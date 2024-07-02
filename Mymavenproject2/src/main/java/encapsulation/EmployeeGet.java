package encapsulation;

public class EmployeeGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.setName("Sri");
		obj.setAge(25);
		obj.setSal(15.5f);
				
		System.out.println("Name of employee: "+obj.getName());
		System.out.println("Age of employee: "+obj.getAge());
		System.out.println("Salary of employee: "+obj.getSal());
	}

}
