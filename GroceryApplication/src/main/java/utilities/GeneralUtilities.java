package utilities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
		
	public String selectDropdownWithIndex(WebElement element, int indexNumber) {
		Select object = new Select(element);
		object.selectByIndex(indexNumber);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}
	
	public void sendKeyFunction(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void alertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public String getAlertText(WebDriver driver)
	{
		return(driver.switchTo().alert().getText());
	}
	
	public void goToFrame(WebDriver driver,WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	
	public void clickRadioButton(WebElement radioButton)
	{
		radioButton.click();
	}
	
	public void clearRadioButton(WebElement radioButton)
	{
		radioButton.clear();
	}
	
	public boolean verifyRadioButtonSelection(WebElement radioButton)
	{
		return (radioButton.isSelected());
	}
	
	public boolean verifyRadioButtonEnabled(WebElement radioButton)
	{
		return (radioButton.isEnabled());
	}
	
	public boolean verifyRadioButtonDisplay(WebElement radioButton)
	{
		return (radioButton.isDisplayed());
	}
	
	public void clickCheckBox(WebElement checkbox)
	{
		checkbox.click();
	}
	
	public void clearCheckBox(WebElement checkbox)
	{
		checkbox.clear();
	}
	
	public boolean verifyCheckBoxSelection(WebElement checkbox)
	{
		return (checkbox.isSelected());
	}
	
	public boolean verifyCheckBoxEnabled(WebElement checkbox)
	{
		return (checkbox.isEnabled());
	}
	
	public boolean verifyCheckBoxDisplay(WebElement checkbox)
	{
		return (checkbox.isDisplayed());
	}
	
	public void dropDownselectionByIndex(WebElement dropDown,int index)
	{
		Select selectobj=new Select(dropDown);
		selectobj.selectByIndex(index);
	}
	
	public void dropDownselectionByValue(WebElement dropDown,String value)
	{
		Select selectobj=new Select(dropDown);
		selectobj.selectByValue(value);
	}
	
	public void dropDownselectionByVisibleText(WebElement dropDown,String value)
	{
		Select selectobj=new Select(dropDown);
		selectobj.selectByVisibleText(value);
	}
	
	public void performDragAndDrop(Actions actionObj,WebElement srcElement,WebElement targetElement)
	{
		actionObj.dragAndDrop(srcElement, targetElement).perform();
	}
	
	public void performDoubleClick(WebDriver driver,WebElement doubleClick)
	{
		Actions actionObj=new Actions(driver);
		actionObj.doubleClick(doubleClick).perform();
	}
	
	public void performMoveToElement(WebDriver driver,WebElement rightClick)
	{
		Actions actionObj=new Actions(driver);
		actionObj.moveToElement(rightClick).perform();
	}
	
	
	public void handleTabs(WebDriver driver,WebElement button)
	{
	String parentWindow=driver.getWindowHandle();
		
	button.click();
	
	Set<String> allWindows=driver.getWindowHandles();
	System.out.println(allWindows);
	
	for(String childWindow:allWindows)
	{
		if(!parentWindow.equals(childWindow))
		{
			driver.switchTo().window(childWindow);			
		}
		
	}
	}
}
