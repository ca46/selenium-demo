
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
	@FindBy(xpath=" //input[@placeholder='Username']") WebElement uname;
	@FindBy(xpath=" //input[@placeholder='Password']") WebElement pswd;
	@FindBy(xpath=" //button[@type='submit']") WebElement signin;
	@FindBy(xpath=" //div[@class='inner']//following::p[text()='Manage News']") WebElement managenews;
	@FindBy(xpath=" //a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']//parent::li") WebElement moreinfo;
	@FindBy(xpath=" //a[text()=' New']") WebElement newoption;
	@FindBy(xpath=" //textarea[@id='news']") WebElement enternews;
	@FindBy(xpath=" //button[@name='create']") WebElement save;
	@FindBy(xpath=" //div[@class='alert alert-success alert-dismissible']") WebElement alert;
	
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickMoreInformation()
	{
		
		moreinfo.click();
		
	}
	
	public void clickNewButton()
	{
		newoption.click();
	}
	
	public void enterNews(String news)
	{
		enternews.sendKeys(news);
	}
	public void saveNews()
	{
		save.click();
	}
	
	public boolean isAlertMessageisplayed()
	{
		return alert.isDisplayed();
		
	}
	
	}
