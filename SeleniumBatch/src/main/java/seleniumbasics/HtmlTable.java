package seleniumbasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
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
		
		
		for(int i=0;i<tableHead.size();i++)
		{
			System.out.print(tableHead.get(i).getText()+"  ");
		}

	}

}
