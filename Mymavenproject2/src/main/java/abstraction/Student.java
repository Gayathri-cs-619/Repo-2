package abstraction;

public class Student extends Tuition{
	
	public void syllabus()
	{
		System.out.println("Get Syllabus from University");
	}
	
	public void notes()
	{
		System.out.println("Get notes from tuition");
	}

	public static void main(String[] args) {
		/*Student obj=new Student();
		obj.syllabus();
		obj.notes();
		obj.locationUni();
		obj.locationTui();*/
		
		//doing same using upcasting
		
		University obj=new Student();
		obj.syllabus();
		obj.locationUni();
		Tuition obj1=new Student();
		obj1.notes();
		obj1.locationTui();

	}

}
