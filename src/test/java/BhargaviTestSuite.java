import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

public class BhargaviTestSuite extends  Hooks{

   // WebDriver driver;

    //@Before
    public void open()
    {
        System.setProperty("webdriver.gecko.driver","geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://jfi.bananaapps.co.uk");
    }

    @Test
    public void Bhargavi_TestCase1()
    {
      driver.findElement(By.linkText("FAQ")).click();
      waitFor();
      assertEquals("Just Free It FAQ's",driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[1]/h2")).getText());
    }

    @Test
    public void Bhargavi_TestCase2()
    {
        driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion']/div[1]/div[1]/a/h4")).click();
        assertEquals("Claritas est etiam processus?",driver.findElement(By.xpath(".//*[@id='accordion']/div[1]/div[1]/a/h4")).getText());
    }

    @Test
    public void Bhargavi_TestCase3()
    {
        driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion']/div[2]/div[1]/a/h4")).click();
        waitFor();
        assertEquals("Vel illum dolore eu?",driver.findElement(By.xpath(".//*[@id='accordion']/div[2]/div[1]/a/h4")).getText());
    }

    @Test
    public void Bhargavi_TestCase4()
    {
        driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion']/div[3]/div[1]/a/h4")).click();
        waitFor();
        assertEquals("Nam liber tempor cum soluta?",driver.findElement(By.xpath(".//*[@id='accordion']/div[3]/div[1]/a/h4")).getText());
    }

    @Test
    public void Bhargavi_TestCase5()
    {
        driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion']/div[4]/div[1]/a/h4")).click();
        waitFor();
        assertEquals("Claritas est etiam processus dynamicus?",driver.findElement(By.xpath(".//*[@id='accordion']/div[4]/div[1]/a/h4")).getText());
    }

    @Test
    public void Bhargavi_TestCase6()
    {
        driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion']/div[5]/div[1]/a/h4")).click();
        waitFor();
        assertEquals("Duis autem vel eum iriure dolor?",driver.findElement(By.xpath(".//*[@id='accordion']/div[5]/div[1]/a/h4")).getText());
    }

    @Test
    public void Bhargavi_TestCase7()
    {
        driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion']/div[6]/div[1]/a/h4")).click();
        waitFor();
        assertEquals("Mirum est notare quam littera gothica?",driver.findElement(By.xpath(".//*[@id='accordion']/div[6]/div[1]/a/h4")).getText());
    }

   // @After
    public void close()
    {
        driver.quit();
    }

    public void waitFor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
