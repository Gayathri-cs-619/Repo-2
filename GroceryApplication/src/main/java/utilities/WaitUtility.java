package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
	public void threadWait(WebDriver driver, int timeinSeconds) throws InterruptedException
	{
		Thread.sleep(timeinSeconds);
	}
	
	public void explicitWaitForWebElementAlert(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void fluentWaitForWebElement(WebDriver driver, WebElement element, String attribute, String attributeValue) {
		 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(30))
		            .pollingEvery(Duration.ofSeconds(2))
		            .ignoring(NoSuchElementException.class);		 
		 fluentWait.until(ExpectedConditions.attributeToBe(element, attribute, attributeValue));
	}
	//implicit wait
	
	
			
	public void implicitWaitForAlert(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));//wait for specified time before throwing exception
		
		//explicit wait
		WebDriverWait expWait =new WebDriverWait(driver, Duration.ofSeconds(5));
		expWait.until(ExpectedConditions.alertIsPresent());
		
	}	
	
	public void implicitWaitForWebElementWithAttribute(WebDriver driver, WebElement element, String attribute, String attributeValue) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));//wait for specified time before throwing exception
		
		//explicit wait
		WebDriverWait expWait =new WebDriverWait(driver, Duration.ofSeconds(5));
		//expWait.until(ExpectedConditions.alertIsPresent());
		expWait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));
		
		
}	
	
	public void implicitWaitForAlertWithText(WebDriver driver, WebElement element, String attribute, String attributeValue) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));//wait for specified time before throwing exception
		
		//explicit wait
		WebDriverWait expWait =new WebDriverWait(driver, Duration.ofSeconds(5));
		expWait.until(ExpectedConditions.alertIsPresent());
		expWait.until(ExpectedConditions.textToBePresentInElement(element, attribute));
		
	}	

}
