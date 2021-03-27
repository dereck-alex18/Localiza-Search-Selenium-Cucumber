package stepdefinitions;

import foundation.InitProcess;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.LocalizaHome;

import java.util.List;

public class SearchLocalizaStep {
    private WebDriver driver;
    private InitProcess initProcess;
    private LocalizaHome localizaHome;

    @Before
    public void setup(){
        initProcess = new InitProcess();
        driver = initProcess.getDriver();
        localizaHome = new LocalizaHome(driver);
    }


    @Given("The user is in localiza home page")
    public void goToLocalizaHome() {
        initProcess.launchBrowser();
    }

    @When("Fills the search field with {string}")
    public void enterLocalization(String localization) {
        localizaHome.getSearchBarElement().sendKeys(localization);
    }

    @Then("An error {string} should be displayed to the user")
    public void displayErrorMessage(String errorMessage) {
        Assert.assertEquals(errorMessage,  localizaHome.getErrorMessageElement().getText());
    }

    @Then("A list with {int} locations is displayed")
    public void localizationListResult(int localizationQuantity) {
        List<WebElement> elements = localizaHome.getLocalizationList();
        Assert.assertTrue(elements.size() > localizationQuantity);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
