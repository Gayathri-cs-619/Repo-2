package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTests {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement gridCheckBox =driver.findElement(By.id("gridCheck"));
		gridCheckBox.click();
		
		boolean selected = gridCheckBox.isSelected();
		System.out.println(selected);
		
		WebElement selectAll =driver.findElement(By.xpath("//input[@id='button-two']"));
		
		boolean selected1=selectAll.isDisplayed();
		System.out.println(selected1);
		
		boolean selected2=selectAll.isEnabled();
		System.out.println(selected2);
		
		selectAll.click();
		
		
		driver.quit();
		
		

	}

}
