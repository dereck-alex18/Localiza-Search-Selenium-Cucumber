package pageobjects;

import Helpers.LocalizaHomePageConstants;
import foundation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocalizaHome extends BasePage {
    public LocalizaHome(WebDriver driver){
        super(driver);
    }

    public WebElement getSearchBarElement(){
        return driver.findElement(By.cssSelector(LocalizaHomePageConstants.SEARCH_FIELD));
    }

    public WebElement getErrorMessageElement(){
        return driver.findElement(By.cssSelector(LocalizaHomePageConstants.ERROR_MESSAGE));
    }

    public List<WebElement> getLocalizationList(){
        return driver.findElements(By.cssSelector(LocalizaHomePageConstants.LOCALIZATION_LIST));
    }
}
