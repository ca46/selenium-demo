package testscripts;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	
@Test	
public void verifyUserIsAbleToEnterTheNews() throws IOException
{
	//String username="admin";
	//String password="admin";
	//String news="News";
	String username=ExcelUtility.getStringData(1, 0, "loginpage");
	String password=ExcelUtility.getStringData(1, 1, "loginpage");
	String news=ExcelUtility.getStringData(1, 0,"managenews");
	
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(username);
	loginpage.enterThePassword(password);
	loginpage.clickSigninButton();
	ManageNewsPage managenewspage=new ManageNewsPage(driver);
	managenewspage.clickMoreInformation();
	managenewspage.clickNewButton();
	managenewspage.enterNews(news);
	managenewspage.saveNews();
	boolean alertmsg=managenewspage.isAlertMessageisplayed();
	Assert.assertTrue(alertmsg);
	
}

}