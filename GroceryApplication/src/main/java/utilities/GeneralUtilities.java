package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {

	public String selectDropdownWithIndex(WebElement element, int indexNumber) {
		Select object = new Select(element);
		object.selectByIndex(indexNumber);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}

	public void sendKeyFunction(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void alertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public String getAlertText(WebDriver driver) {
		return (driver.switchTo().alert().getText());
	}

	public void goToFrame(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	public void clickRadioButton(WebElement radioButton) {
		radioButton.click();
	}

	public void clearRadioButton(WebElement radioButton) {
		radioButton.clear();
	}

	public boolean verifyRadioButtonSelection(WebElement radioButton) {
		return (radioButton.isSelected());
	}

	public boolean verifyRadioButtonEnabled(WebElement radioButton) {
		return (radioButton.isEnabled());
	}

	public boolean verifyRadioButtonDisplay(WebElement radioButton) {
		return (radioButton.isDisplayed());
	}

	public void clickCheckBox(WebElement checkbox) {
		checkbox.click();
	}

	public void clearCheckBox(WebElement checkbox) {
		checkbox.clear();
	}

	public boolean verifyCheckBoxSelection(WebElement checkbox) {
		return (checkbox.isSelected());
	}

	public boolean verifyCheckBoxEnabled(WebElement checkbox) {
		return (checkbox.isEnabled());
	}

	public boolean verifyCheckBoxDisplay(WebElement checkbox) {
		return (checkbox.isDisplayed());
	}

	public void dropDownselectionByIndex(WebElement dropDown, int index) {
		Select selectobj = new Select(dropDown);
		selectobj.selectByIndex(index);
	}

	public void dropDownselectionByValue(WebElement dropDown, String value) {
		Select selectobj = new Select(dropDown);
		selectobj.selectByValue(value);
	}

	public void dropDownselectionByVisibleText(WebElement dropDown, String value) {
		Select selectobj = new Select(dropDown);
		selectobj.selectByVisibleText(value);
	}

	public void performDragAndDrop(Actions actionObj, WebElement srcElement, WebElement targetElement) {
		actionObj.dragAndDrop(srcElement, targetElement).perform();
	}

	public void performDoubleClick(WebDriver driver, WebElement doubleClick) {
		Actions actionObj = new Actions(driver);
		actionObj.doubleClick(doubleClick).perform();
	}

	public void performMoveToElement(WebDriver driver, WebElement rightClick) {
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(rightClick).perform();
	}

	public int randon(int limit) {
		Random random = new Random();
		// int limit = 1000;
		int randomNumber = random.nextInt(limit);
		return randomNumber;
	}

	public String generateCurrentDateAndTime() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyhhmmss");
		return formatter.format(date);
	}
	
	public String generateCurrentDateByPattern(String pattern) {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);	
		String formattedDate = currentDate.format(formatter);
		return formattedDate;
	}

	public void handleTabs(WebDriver driver, WebElement button) {
		String parentWindow = driver.getWindowHandle();

		button.click();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		for (String childWindow : allWindows) {
			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}

		}
	}
	
	public void fileUploadbySendKeys(WebDriver driver, WebElement element,String filePath)
	{
		element.sendKeys(filePath); 
	}
	
	public void fileUploadbyRobotClass(WebDriver driver, WebElement element,Transferable filePath) throws AWTException
	{
	Actions obj = new Actions(driver); 
		obj.moveToElement(element).click().perform(); 

		// Use the Robot class to interact with the file dialog 
		Robot robot = new Robot(); 

		// Set the clipboard with the file path 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null); 

		// Use the keyboard shortcuts to paste the file path into the file dialog 
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_V); 
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_V); 
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		robot.delay(2000);

		// Press Enter to confirm the file upload 
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_ENTER); 
		robot.delay(2000);

		// Wait for a moment to ensure the file is uploaded 
		//Thread.sleep(2000); 
	}
	
	public void scrollFunction(WebDriver driver,int horizontal, int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+horizontal+","+vertical+")");
	}
	
}
