package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
	
	public void selectByVisibleText(WebElement element,String visibleText) {
			Select select =new Select(element);
			select.selectByVisibleText(visibleText);;
			
		}
	public static void selectByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    
    public static void selectByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    
    public static void selectCheckbox(WebElement checkbox) {
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    
    public static void unselectCheckbox(WebElement checkbox) {
        if (checkbox.isSelected()) {
            checkbox.click();
        }
    }
}
