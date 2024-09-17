package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTests {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.id("single-input-field"));
		
		//create an object for select class and pass the dropdown webelement
		Select selectobj=new Select(dropDown);
		
		//using index value
		selectobj.selectByIndex(1);
		System.out.println(driver.findElement(By.id("message-one")).getText());
		
		//using value
		selectobj.selectByValue("Green");
		System.out.println(driver.findElement(By.id("message-one")).getText());
		
		//using visible text
		selectobj.selectByVisibleText("Yellow");
		System.out.println(driver.findElement(By.id("message-one")).getText());
		
		WebElement selectedElement=selectobj.getFirstSelectedOption();
		String elementString=selectedElement.getText();
		System.out.println(elementString);
		
		//multi dropdown
		
		System.out.println("Multi-select dropdown practice");
		
		WebElement multiDropDown = driver.findElement(By.id("multi-select-field"));
		
		Select multiselectobj=new Select(multiDropDown);
		
		for(int i=0;i<2;i++)
		{
		multiselectobj.selectByIndex(i);
		}
		
		List<WebElement> multiSelectedElements = multiselectobj.getAllSelectedOptions();
		
		System.out.println("Printing using foreach");
		
		for(WebElement value:multiSelectedElements)
		{
			
			System.out.println(value.getText());
		}
		
		System.out.println("Printing using FOR");
		
		for(int j=0;j<multiSelectedElements.size();j++)
		{
			String selectedValue=multiSelectedElements.get(j).getText();
			System.out.println(selectedValue);
		}
		
	System.out.println("Printing using foreach-array");
		
		for(WebElement value:multiSelectedElements)
		{
			
			System.out.println(value.getText());
		}
		
		//driver.quit();
		
		//relative xpath
//parent xpath - 
		
		//div[@class='row']//div[2]//div[2]//div[@class='card']//div[2]//form//div[@class='form-group']//select[@class='form-control']
		
		//div[@class='row']//div[2]//div[2]//div[@class='card']//div[2]//form//div[@class='form-group']//select[@class='form-control']
	}

}
