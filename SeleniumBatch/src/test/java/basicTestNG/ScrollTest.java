package basicTestNG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollTest {
  @Test
  public void testCase01() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,4500)");
    
    WebElement element =driver.findElement(null);
    js.executeScript("arguments[0].click()", element);//for click
    
    //to refer later
    
   /* public void sendValueUsingJavaScriptAndBlur(WebDriver driver, WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '" + value + "'", element);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].blur()", element);*/
		
		//to do project
		//https://groceryapp.uniqassosiates.com/admin
	}
  }
