package seleniumbasics;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicWebElement {

	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		
		WebElement userNameField = driver.findElement(By.xpath("//input[@id='loginform-username']"));
		userNameField.sendKeys("Gayathri");
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='loginform-password']"));
		passwordField.sendKeys("Password@1");
		
		
		
		/*WebElement loginButton = driver.findElement(By.xpath("//button[@name='login-button']"));
		loginButton.click();*/
		
	//  //tagname[text()='text']
		
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
		loginButton.click();
		
		userNameField.clear();
		
		String fontSize=loginButton.getCssValue("font-size");
		System.out.println(fontSize);
		
		String bgColor=loginButton.getCssValue("background-color");
		System.out.println(bgColor);
		
		String attributeValue=loginButton.getAttribute("class");
		System.out.println(attributeValue);
		
		String getTagName=loginButton.getTagName();
		System.out.println(getTagName);
		
		String getLoginText=loginButton.getText();
		System.out.println(getLoginText);
	}

}
