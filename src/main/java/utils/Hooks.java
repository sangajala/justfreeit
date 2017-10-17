package utils;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.AutomationConstants;
import utils.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    public static WebDriver getDriver()
    {
        return driver;
    }


    @BeforeClass
    public static  void openBrowser()
    {
        System.out.println("starting the browser");


        if(AutomationConstants.BROWSER_TYPE.toLowerCase().equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
        }
        else if(AutomationConstants.BROWSER_TYPE.toLowerCase().equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "geckodriver");
            driver = new FirefoxDriver();
        }
        else {
            Assert.fail("Browser give "+AutomationConstants.BROWSER_TYPE+" is not valid");
        }

        driver.get(AutomationConstants.URL);//open
        //FOR SET TIME OUT
        driver.manage().timeouts().implicitlyWait(AutomationConstants.MAX_TIMEOUTS, TimeUnit.SECONDS);
        WebDriverUtil.setOurOwnScreenSize(AutomationConstants.SCREENSIZE);
//
    }

    @AfterClass
    public static void closeBrowser()
    {
        System.out.println("I am in closing");
        driver.quit();
    }
}
