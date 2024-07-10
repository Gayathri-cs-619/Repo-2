package excelpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Students {
	static FileInputStream f;//why are defining as static?
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String getStudentName(int a , int b) throws IOException
	{
		f=new FileInputStream("D:\\Java Session\\Students.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
	}
	
	public static double getStudentMarks(int a , int b) throws IOException
	{
		f=new FileInputStream("D:\\Java Session\\Students.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getNumericCellValue();
	}
}
