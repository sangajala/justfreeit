import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSuite2 extends Hooks{
    //WebDriver driver;
    @Before
    public void shutup()
    {
        System.out.println("starting the browser");
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        driver = new ChromeDriver();
        driver.get("http://www.google.co.uk/");//open
    }
    @Test
    public void testcase1()
    {
        TestSuite1.waitFor();
    }

    @After
    public void stoping()
    {
        driver.quit();
    }
}
