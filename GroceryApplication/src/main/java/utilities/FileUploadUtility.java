package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadUtility {

	public void fileUploadbySendKeys(WebDriver driver, WebElement element,String filePath)
	{
		element.sendKeys(filePath); 
	}
}
