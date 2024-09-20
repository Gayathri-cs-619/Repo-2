package seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		WebElement tableheadElement=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr/th[1]"));
		System.out.println(tableheadElement.getText());
		
		List<WebElement> tableHead=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr/th"));
		
		System.out.println("Header:  ");
		
		for(int i=0;i<tableHead.size();i++)
		{
			System.out.print(tableHead.get(i).getText()+"  ");
		}
		
		List<WebElement> tableRow1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		
		List<WebElement> tableCol1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		
	//	System.out.println(tableRow1.size()+" "+tableCol1.size());
		
		System.out.println(" ");
		System.out.println("Row1:  ");
		
		for(int j=0;j<tableCol1.size();j++)
		{
			System.out.print(tableCol1.get(j).getText()+"  ");
		}
		
				
		System.out.println(" ");
		System.out.println("Column1:  ");
		
		for(int r=0;r<tableRow1.size();r++)
		{
			System.out.print(tableRow1.get(r).getText()+"  ");
		}
		
		System.out.println(" ");
		System.out.println("Cell[2][1]:  ");
		
		WebElement tableCell=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]//td[1]"));
		System.out.println(tableCell.getText());
		
		System.out.println(" ");
		
		for (int k=1;k<=tableRow1.size();k++)
		{
			if(tableRow1.get(k-1).getText().equals("Ashton Cox"))
			{
				WebElement tableCellAge=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+k+"]//td[4]"));
				System.out.print("Age :"+tableCellAge.getText());
			}
		}
		
		System.out.println(" ");
		System.out.println("Whole Table:  ");
		
		for (int k=0;k<tableRow1.size();k++)
		{
			for (int l=0;l<tableCol1.size();l++)
			{
				WebElement tableCelleach=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+(k+1)+"]/td["+(l+1)+"]"));
				System.out.print(tableCelleach.getText()+"  ");
			}
			System.out.println(" ");
		}
		driver.quit();

	}

}
