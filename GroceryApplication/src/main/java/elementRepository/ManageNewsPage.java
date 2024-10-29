package elementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageNewsPage {

	WebDriver driver;
	GeneralUtilities genUtility = new GeneralUtilities();

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='content-header']/div/div/div/h1[text()='Manage News']")
	WebElement newsTitle;
	@FindBy(xpath = "//div[@class='content-header']/div/div/div[2]/ol/li/a[text()='Home']")
	WebElement homeHyperlink;
	@FindBy(xpath = "//div[@class='content-header']/div/div/div[2]/ol/li[text()='Manage News']")
	WebElement manageNewsHyperlink;
	@FindBy(xpath="//div[@class='col-sm-12']/a")
	List<WebElement> newsBtns;	
	@FindBy(xpath = "//div[@class='col-sm-12']/a[1]")
	WebElement newbtninNews;
	@FindBy(xpath = "//div[@class='col-sm-12']/a[2]")
	WebElement searchbtninNews;
	@FindBy(xpath = "//div[@class='col-sm-12']/a[3]")
	WebElement resetbtninNews;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/thead/tr/th")
	List<WebElement> newstableheaderelements;	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr/td[1]")
	List<WebElement> newstableCol1;	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[2]/a")
	List<WebElement> newstableCol2;	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[2]/a[1]")
	WebElement newstableEditBtn;	
	@FindBy(id="news")
	WebElement newsTextBoxinEdit;	
	@FindBy(name="update")
	WebElement updateBtn;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement newsUpdateSuccessAlertMessage;
	@FindBy(name="un")
	WebElement newsTextBoxinSearch;
	@FindBy(name="Search")
	WebElement searchbtn2;

	public String verifyTitleinNews() {
		return newsTitle.getText();

	}

	public boolean verifyHyperlinksinNews() {
		if(homeHyperlink.getText().equals("Home") && manageNewsHyperlink.getText().equals("Manage News"))
			return true;
		else
			return false;
	}

	public int verifyButtonsCountinNews() {
		return newsBtns.size();
	}
	
	public boolean verifyButtonsinNews() {
		if(newbtninNews.getText().equals("New") && searchbtninNews.getText().equals("Search") && resetbtninNews.getText().equals("Reset"))
			return true;
		else
			return false;
	}

	public boolean verifyTableHeadersinNews() {
		List<String> newstableheaderactualitems = null;
		for (int i=1;i<=newstableheaderelements.size();i++)
		{
			newstableheaderactualitems.add(newstableheaderelements.get(i).getText());
		}
		List<String> newstableheaderexpecteditems  = null;
		newstableheaderexpecteditems.add("News");
		newstableheaderexpecteditems.add("Action");
		if(newstableheaderactualitems.contains(newstableheaderexpecteditems))
			return true;
		else
			return false;
	}

	public boolean verifyTableRecordsinNews() {
		if (newstableCol1.size() > 0)
			return true;
		else
			return false;
	}
	
	/*public boolean verifySecondColumninNewsTable() {
		List<String> actualSecondColumninNewsTable = null;
		for (int i=1;i<=newstableCol2.size();i++)
		{
			if(newstableCol2.get(i).getCssValue(role).equals(button))
		}
		List<String> expectedSecondColumninNewsTable  = null;
		newstableheaderexpecteditems.add("News");
		newstableheaderexpecteditems.add("Action");
		if(newstableheaderactualitems.contains(newstableheaderexpecteditems))
			return true;
		else
			return false;
	}*/

	public void verifyPaginationinNews() {

	}

	public void verifyFooterinNews() {

	}
	
	public void clickEditNews() {
		newstableEditBtn.click();
	}
	
	public void EditNews() {
		String currentNews=newsTextBoxinEdit.getText();
		String editedNews=currentNews.concat("-Edited");
		newsTextBoxinEdit.clear();
		genUtility.sendKeyFunctionforString(newsTextBoxinEdit,editedNews);
		updateBtn.click();
	}
	
	public boolean checkForUpdateSuccessMessage() {
		String alertActual = newsUpdateSuccessAlertMessage.getText();
		String alertExpected = "News Updated Successfully";
		boolean value = alertActual.contains(alertExpected);
		return value;
	}
	
	public void clickSearchNews() {
		searchbtninNews.click();
	}
	
	public void SearchNews() {
		genUtility.sendKeyFunctionforString(newsTextBoxinSearch,"test");
		searchbtn2.click();
	}
	
	public int readsearchresults()	{
		int flag = 0;
		System.out.println(newstableCol1.size());
		System.out.println(newstableCol1.get(0).getText());
		System.out.println(newstableCol1.get(1).getText());
		for (int i=0;i<newstableCol1.size();i++)
		{
			
			if(newstableCol1.get(i).getText().equalsIgnoreCase("test")) {
				System.out.println(newstableCol1.get(i).getText());
				System.out.println("Match found");
			}
			else {		
				System.out.println(newstableCol1.get(i).getText());
				System.out.println("Match Not found");
				flag=1;
				break;
			}
			
		}
		return flag;
	}

}
