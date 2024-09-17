package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();
		
		WebElement srcElement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement targetElement=driver.findElement(By.id("mydropzone"));
		
		Actions actionObj=new Actions(driver);
		actionObj.dragAndDrop(srcElement, targetElement).perform();
		
		WebElement srcElement2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		actionObj.dragAndDrop(srcElement2, targetElement).perform();
		
		WebElement srcElement3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		actionObj.dragAndDrop(srcElement3, targetElement).perform();
		
		WebElement srcElement4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		actionObj.dragAndDrop(srcElement4, targetElement).perform();
		
	}

}
