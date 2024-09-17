package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTests {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		
		WebElement button1=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		button1.click();
		
		boolean select1=button1.isDisplayed();
		boolean select2=button1.isEnabled();
		boolean select3=button1.isSelected();
		
		WebElement button2=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		
			
		boolean select4=button2.isDisplayed();
		boolean select5=button2.isEnabled();
		boolean select6=button2.isSelected();
		
		System.out.println("First button status's: "+select1+" , "+select2+" , "+select3);
		System.out.println("Second button status's: "+select4+" , "+select5+" , "+select6);
		
		driver.findElement(By.id("button-one")).click();
		
		WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
		String messageText=message.getText();
		
		System.out.println(messageText);
		
		driver.quit();
		

	}

}
