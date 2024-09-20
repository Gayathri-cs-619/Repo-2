package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();

		// switch by web element
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));

		// step 1 switch to frame
		driver.switchTo().frame(frameElement);
		// step 2 action inside frame
		WebElement frameText = driver.findElement(By.id("sampleHeading"));

		System.out.println(frameText.getText());

		// switch by name or ID

		// step 1 switch to frame
		driver.switchTo().frame("frame1");
		// step 2 action inside frame
		WebElement frameText1 = driver.findElement(By.id("sampleHeading"));

		System.out.println(frameText1.getText());

		// step 3 = go back to main frame
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();// same like above stmt. both are to return to main page.

		driver.quit();

	}

}
