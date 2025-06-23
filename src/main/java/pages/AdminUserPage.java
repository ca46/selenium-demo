package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUserPage {

    public WebDriver driver;

    
    public AdminUserPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   

    @FindBy(name = "username")WebElement loginUsernameField;

    @FindBy(name = "password")WebElement loginPasswordField;

    @FindBy(xpath = "//button[@type='submit']")WebElement loginSubmitButton;

    @FindBy(xpath = "//a[contains(@href,'list-admin') and contains(@class,'small-box-footer')]")WebElement adminUserLink;

    @FindBy(xpath = "//h1[contains(text(),'Admin Users')]")WebElement adminUserHeader;

    @FindBy(xpath = "//a[contains(@class,'btn-rounded') and @onclick='click_button(1)']")WebElement newButton;

    @FindBy(id = "username")WebElement newUsernameField;

    @FindBy(id = "password")WebElement newPasswordField;

    @FindBy(id = "user_type")WebElement userTypeDropdown;

    @FindBy(xpath = "//button[@type='submit' and @name='Create']")WebElement saveButton;

    @FindBy(xpath = "//a[@onclick='click_button(2)']")WebElement searchButton;

    @FindBy(id = "un")WebElement searchUsernameField;

    @FindBy(id = "ut")WebElement searchUserTypeDropdown;

    @FindBy(xpath = "//button[@name='Search' and @value='sr']")WebElement searchSubmitButton;



    public void clickAdminUserButton() {
        adminUserLink.click();
    }

    public String getAdminUserHeaderText() {
        return adminUserHeader.getText();
    }

    public boolean isAdminUserHeaderDisplayed() {
        return adminUserHeader.isDisplayed();
    }

    public void clickNewButton() {
        newButton.click();
    }

    public void enterUsernameAdminUser(String username) {
        newUsernameField.sendKeys(username);
    }

    public void enterPasswordAdminUser(String password) {
        newPasswordField.sendKeys(password);
    }

    public void selectUserTypeAdminUser(String userType) {
        Select dropdown = new Select(userTypeDropdown);
        dropdown.selectByVisibleText(userType);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void enterSearchUsername(String username) {
        searchUsernameField.sendKeys(username);
    }

    public void selectSearchUserType(String userType) {
        Select dropdown = new Select(searchUserTypeDropdown);
        dropdown.selectByVisibleText(userType);
    }

    public void clickSearchSubmitButton() {
        searchSubmitButton.click();
    }

    public boolean isAlertMessageDisplayed(WebElement alertElement) {
        return alertElement.isDisplayed();
    }
} 