package excelpackage;

import java.io.IOException;

public class StudentsMain {

	public static void main(String[] args) throws IOException {
		System.out.println(Students.getStudentName(1,0));
		System.out.println(Students.getStudentName(2,0));
		System.out.println(Students.getStudentName(1,1));//error here-Exception in thread "main" java.lang.IllegalStateException: Cannot get a STRING value from a NUMERIC cell
		System.out.println(Students.getStudentName(2,1));
	}

}
