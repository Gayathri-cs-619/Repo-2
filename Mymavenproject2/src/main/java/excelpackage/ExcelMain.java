package excelpackage;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException  {
		System.out.println(ExcelRead.getStringData(0, 0));
		System.out.println(ExcelRead.getStringData(1, 0));	
		System.out.println(ExcelRead.getStringData(2, 0));	
		
		System.out.println(ExcelRead.getIntegerData(0, 1));	
		System.out.println(ExcelRead.getIntegerData(1, 1));
		System.out.println(ExcelRead.getIntegerData(2, 1));
	}

}
