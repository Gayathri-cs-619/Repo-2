package encapsulation;
////program with set and get
public class StudentSetGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj=new StudentDetails();
		obj.setName("Ashwin");
		obj.setAge(12);
		System.out.println("Name of Student: "+obj.getName());
		System.out.println("Age of Student: "+obj.getAge());
	}

}
