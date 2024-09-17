package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommand {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","D:\\Java Session\\Chromedriver\\chromedriver.exe");
		// above command is needed only in lower versions of selenium

		WebDriver driver = new ChromeDriver(); // webdriver is an interface
		
		driver.get("http://qabible.in/payrollapp/site/login");
		//driver.navigate().to("http://qabible.in/payrollapp/site/login");

		// get command will wait for the page to load
		// navigate.to wont wait for the page to load
		// get wont keep history
		// navigate.to will keep history. will explain how

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String src = driver.getPageSource();
		System.out.println(src);

		driver.manage().window().minimize();
		driver.manage().window().maximize();

		// driver.close();//close current tab
		// driver.quit();//close browser

	}

}
