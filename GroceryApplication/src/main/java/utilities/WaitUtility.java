package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public void threadWait(WebDriver driver, int timeinSeconds) throws InterruptedException {
		Thread.sleep(timeinSeconds);
	}

	public void implicitWaitForSeconds(WebDriver driver, int seconds) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public void implicitWaitForMilliSeconds(WebDriver driver, int milliseconds) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(milliseconds));
	}

	public void explicitWaitForAlert(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void explicitWaitForWebElement(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void explicitWaitForWebElementtobeVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void explicitWaitForWebElementWithAttribute(WebDriver driver, WebElement element, String attribute,
			String attributeValue) {

		WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		expWait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));

	}

	public void fluentWaitForWebElement(WebDriver driver, WebElement element, String attribute, String attributeValue) {
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.attributeToBe(element, attribute, attributeValue));
	}

	public void implicitWaitForAlertWithText(WebDriver driver, WebElement element, String attribute,
			String attributeValue) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));// wait for specified time before throwing
																			// exception

		// explicit wait
		WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		expWait.until(ExpectedConditions.alertIsPresent());
		expWait.until(ExpectedConditions.textToBePresentInElement(element, attribute));

	}

}
