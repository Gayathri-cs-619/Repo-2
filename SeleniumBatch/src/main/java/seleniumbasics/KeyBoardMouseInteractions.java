package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardMouseInteractions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actionObj=new Actions(driver);
		actionObj.doubleClick(doubleClick).perform();
		
		driver.switchTo().alert().accept();
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		actionObj.contextClick(doubleClick).perform();
		
		//mouse hovering
		actionObj.moveToElement(rightClick).perform();
		//keyboard events
		actionObj.sendKeys(Keys.ARROW_DOWN).perform();
		//WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));)

	}

}
