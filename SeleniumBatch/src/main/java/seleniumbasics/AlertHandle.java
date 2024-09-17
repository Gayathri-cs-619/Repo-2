package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement clickMeAlert=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		
		clickMeAlert.click();
		
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();//switchTo-send future commands to a different frame or window
		
		WebElement clickMeAlert2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		
		clickMeAlert2.click();
		
		String alertText2=driver.switchTo().alert().getText();
		System.out.println(alertText2);
		
		driver.switchTo().alert().dismiss();
	}

}
