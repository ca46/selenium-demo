package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {

    @Test
    public void verifyAbleToCreateNewAdminUser() throws IOException {
        
        String username = ExcelUtility.getStringData(1, 0, "loginpage");
        String password = ExcelUtility.getStringData(1, 1, "loginpage");

        // Use Faker to generate random values
        FakerUtility fakerUtility = new FakerUtility();
        String newAdminUsername = fakerUtility.creatARandomFirstName();
        String newAdminPassword = fakerUtility.creatARandomFirstName(); 
        String newAdminUserType = "Admin";  
        
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterTheUsername(username);
        loginPage.enterThePassword(password);
        loginPage.clickSigninButton();

       
        AdminUserPage adminUserPage = new AdminUserPage(driver);
        adminUserPage.clickAdminUserButton();

        boolean isDisplayed = adminUserPage.isAdminUserHeaderDisplayed();
        Assert.assertTrue(isDisplayed, "Admin Users page not displayed.");

        
        adminUserPage.clickNewButton();
        adminUserPage.enterUsernameAdminUser(newAdminUsername);
        adminUserPage.enterPasswordAdminUser(newAdminPassword);
        adminUserPage.selectUserTypeAdminUser(newAdminUserType);
        adminUserPage.clickSaveButton();

       
        // Assert.assertTrue(adminUserPage.isSuccessMessageDisplayed(), "Admin user creation failed.");
    }
}
