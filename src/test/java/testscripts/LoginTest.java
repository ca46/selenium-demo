/*package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base 
{

	@Test(retryAnalyzer=retry.Retry.class,groups= {"Regression"})
	public void verifyTheUserIsAbleToLoginUsingValidCredential () throws IOException
	{
		//String username="admin";
		//String password="admin";
		
		String username=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1, 1, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSigninButton();
		boolean dashboardloaded=loginpage.isdashboardDisplayed();
		Assert.assertTrue(dashboardloaded);
		
	}
	
	@Test(retryAnalyzer=retry.Retry.class)
	public void invalidUsernameAndCorrectPassword() throws IOException
	{
		
		//String username="password";
		//String password="admin";
		String username=ExcelUtility.getStringData(2, 0, "loginpage");
		String password=ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSigninButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert);
	}
	
	@Test(retryAnalyzer=retry.Retry.class)
	public void correctUsernameAndIncorrectPassword() throws IOException
	{
		//String username="admin";
		//String password="password";
		String username=ExcelUtility.getStringData(3, 0, "loginpage");
		String password=ExcelUtility.getStringData(3, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSigninButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert);
	}
	
	@Test(retryAnalyzer=retry.Retry.class)
	public void incorrectUsernameAndIncorrectPassword() throws IOException
	{
		//String username="awf";
		//String password="password";
		String username=ExcelUtility.getStringData(4, 0, "loginpage");
		String password=ExcelUtility.getStringData(4, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSigninButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert);
	}
}*/



package testscripts;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test(retryAnalyzer=retry.Retry.class,groups= {"Regression"})
	public void verifyTheUserIsAbleToLoginUsingValidCredential () throws IOException
	{
		//String username="admin";
		//String password="admin";
		String username=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSigninButton();
		boolean dashboardloaded=loginpage.isdashboardDisplayed();
		Assert.assertTrue(dashboardloaded);
		
	}
	
	@Test(retryAnalyzer=retry.Retry.class)
	public void invalidUsernameAndCorrectPassword() throws IOException
	{
		
		//String username="password";
		//String password="admin";
		String username=ExcelUtility.getStringData(2, 0, "loginpage");
		String password=ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSigninButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert);
	}
	
	@Test(retryAnalyzer=retry.Retry.class)
	public void correctUsernameAndIncorrectPassword() throws IOException
	{
		//String username="admin";
		//String password="password";
		String username=ExcelUtility.getStringData(3, 0, "loginpage");
		String password=ExcelUtility.getStringData(3, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSigninButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert);
	}
	
	@Test(retryAnalyzer=retry.Retry.class)
	public void incorrectUsernameAndIncorrectPassword() throws IOException
	{
		//String username="abc";
		//String password="password";
		String username=ExcelUtility.getStringData(4, 0, "loginpage");
		String password=ExcelUtility.getStringData(4, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickSigninButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert);
	}
}