package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//button[@name='login-button']"));
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));//wait for specified time before throwing exception
		
		//explicit wait
		WebDriverWait expWait =new WebDriverWait(driver, Duration.ofSeconds(5));
		expWait.until(ExpectedConditions.alertIsPresent());
		expWait.until(ExpectedConditions.attributeContains(element, "name", "login-button"));
		
		expWait.until(ExpectedConditions.textToBePresentInElement(element, "Login"));
		
		
		//Fluent wait
		//used for same purpose as in exp wait. Difference is that polling.
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(10))
	            .pollingEvery(Duration.ofSeconds(2))
	            .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.alertIsPresent());
	}

}
