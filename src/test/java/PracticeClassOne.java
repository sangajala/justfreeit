import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PracticeClassOne extends Hooks
{
    //static WebDriver driver;

    //@Before
    public void setup()
    {
        System.out.println("Starting the browser");
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        Hooks.driver = new ChromeDriver();
        Hooks.driver.manage().window().maximize();
        Hooks.driver.get("http://jfi.bananaapps.co.uk/details.php?id=101");
    }
//@After
    public void closingBrowser()
    {
        //driver.quit();
    }

//    @BeforeClass
//    public static  void openBrowser()
//    {
//        System.out.println("starting the browser");
//        System.setProperty("webdriver.gecko.driver", "geckodriver");
//        System.setProperty("webdriver.chrome.driver", "chromedriver");
//
//        driver = new ChromeDriver();
//        driver.get("http://jfi.bananaapps.co.uk/details.php?id=101");//open
//        //FOR SET TIME OUT
//        driver.manage().timeouts().implicitlyWait(120000, TimeUnit.SECONDS);
////
//    }

//    @AfterClass
//    public static void closeBrowser()
//    {
//        System.out.println("I am in closing");
//        driver.quit();
//    }
    @Test
    public void clickandAssertOnAboutUsLink()
    {
        // driver = Hooks.getDriver();
        WebElement element = Hooks.driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a"));
        System.out.println("Clicking on About Us link");
        element.click();
       Assert.assertEquals("About Us", Hooks.driver.findElement(By.className("title")).getText());


       System.out.println("Checking the big image on About us page");
        element = Hooks.driver.findElement(By.className("about-us-images"));
        System.out.println("Big image found");
        System.out.println("Checking the small images on About us page");
        element = Hooks.driver.findElement(By.className("team-social"));
        System.out.println("Small images found");
        System.out.println("Verifying Leaf Corcoran is present");
        Assert.assertEquals("Leaf Corcoran", Hooks.driver.findElement(By.cssSelector("h4")).getText());
        System.out.println("Leaf Corcoran found");
    }




}
