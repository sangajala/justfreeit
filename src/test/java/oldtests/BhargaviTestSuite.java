package oldtests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Hooks;

import static org.junit.Assert.assertEquals;

public class BhargaviTestSuite extends Hooks {

   // WebDriver driver;

    //@Before
    public void open()
    {
        System.setProperty("webdriver.gecko.driver","geckodriver");
        Hooks.driver = new FirefoxDriver();
        Hooks.driver.get("http://jfi.bananaapps.co.uk");
    }

    @Test
    public void Bhargavi_TestCase1()
    {
      Hooks.driver.findElement(By.linkText("FAQ")).click();
      waitFor();
      Assert.assertEquals("Just Free It FAQ's", Hooks.driver.findElement(By.xpath(".//*[@id='main']/div[1]/div/div[1]/h2")).getText());
    }

    @Test
    public void Bhargavi_TestCase2()
    {
        Hooks.driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[1]/div[1]/a/h4")).click();
        Assert.assertEquals("Claritas est etiam processus?", Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[1]/div[1]/a/h4")).getText());
    }

    @Test
    public void Bhargavi_TestCase3()
    {
        Hooks.driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[2]/div[1]/a/h4")).click();
        waitFor();
        Assert.assertEquals("Vel illum dolore eu?", Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[2]/div[1]/a/h4")).getText());
    }

    @Test
    public void Bhargavi_TestCase4()
    {
        Hooks.driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[3]/div[1]/a/h4")).click();
        waitFor();
        Assert.assertEquals("Nam liber tempor cum soluta?", Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[3]/div[1]/a/h4")).getText());
    }

    @Test
    public void Bhargavi_TestCase5()
    {
        Hooks.driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[4]/div[1]/a/h4")).click();
        waitFor();
        Assert.assertEquals("Claritas est etiam processus dynamicus?", Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[4]/div[1]/a/h4")).getText());
    }

    @Test
    public void Bhargavi_TestCase6()
    {
        Hooks.driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[5]/div[1]/a/h4")).click();
        waitFor();
        Assert.assertEquals("Duis autem vel eum iriure dolor?", Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[5]/div[1]/a/h4")).getText());
    }

    @Test
    public void Bhargavi_TestCase7()
    {
        Hooks.driver.findElement(By.linkText("FAQ")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[6]/div[1]/a/h4")).click();
        waitFor();
        Assert.assertEquals("Mirum est notare quam littera gothica?", Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[6]/div[1]/a/h4")).getText());
    }

   // @After
    public void close()
    {
        Hooks.driver.quit();
    }

    public void waitFor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
