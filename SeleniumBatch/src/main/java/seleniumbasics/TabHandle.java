package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.manage().window().maximize();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement button=driver.findElement(By.xpath("//button[text()='New Tab']"));
		button.click();
		
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		
		for(String childWindow:allWindows)
		{
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println(childWindow);
				WebElement tabElement=driver.findElement(By.xpath("//div[@class='row d-flex justify-content-center logindiv bg-white rounded']"));
				System.out.println(tabElement.getText());
				
			}
			
		}
		
		driver.switchTo().window(parentWindow);

	}

}
