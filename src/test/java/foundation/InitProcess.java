package foundation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class InitProcess{

    private WebDriver driver;

    public InitProcess(){
        System.setProperty("webdriver.chrome.driver", "/home/dereck/Documents/chromedriver");
        driver = new ChromeDriver();
    }

    public void launchBrowser(){
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.get("https://www.localiza.com/brasil/pt-br");
        this.driver.manage().window().maximize();
    }

    public WebDriver getDriver(){
        return this.driver;
    }


}
