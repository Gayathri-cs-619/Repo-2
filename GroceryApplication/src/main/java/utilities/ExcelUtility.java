package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String getStringData(String path,int a,int b) throws IOException
	{
		f=new FileInputStream(path);//go to excel location
		w= new XSSFWorkbook(f);//open workbook
		sh=w.getSheet("sheet1");//get sheet 
				//getSheet method is XSSFSheet class 
				//getSheetName method is inside XSSFWorkbook class
				//getRow,getCell method is inside XSSFSheet class
		XSSFRow r=sh.getRow(a);//get row
		Cell c=r.getCell(b);//get cell
		return c.getStringCellValue();
					
	}
	
	public static String getIntegerData(String path,int a,int b) throws IOException
	{
		f=new FileInputStream(path);//go to excel location
		w= new XSSFWorkbook(f);//open workbook
		sh=w.getSheet("sheet1");//get sheet 
		XSSFRow r=sh.getRow(a);//get row
		Cell c=r.getCell(b);//get cell
		int x=(int) c.getNumericCellValue();//typecasting. string converted to int.
		return String.valueOf(x);//valueOf - to read integer as string.
	}
}
