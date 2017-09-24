import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class TestSuite1  extends Hooks{

    //WebDriver driver;
   // @Before
    public void setup() {
        ////setup
         driver.manage().window().fullscreen();
    }

   // @After
    public void lkdsflsjf()
    {

    }

    @Test
    public void testloginscreen3()
    {
        System.out.println("I am in test case");
        ////-------test case ------
        WebElement element = driver.findElement(By.linkText("Log In"));
        ////
        element.click();
        //STATIC WAIT FOR 2 SECS
        waitFor();
        Assert.assertEquals("Welcome to Just Free It", driver.findElement(By.cssSelector("div.modal-header > h2")).getText());
        WebElement close = driver.findElement(By.className("close"));
        close.click();

        //------------------------------test case end
    }

    @Test
    public void testloginscreen2()
    {
        System.out.println("I am in test case 2");
        ////-------test case ------
        WebElement element = driver.findElement(By.linkText("Post / Request Item"));
        ////
        element.click();
        //STATIC WAIT FOR 2 SECS
        waitFor();
        WebElement message = driver.findElement(By.cssSelector("div.congratulations > h2"));
        String actualMessage = message.getText();
        String expectMessage = "Oops..!";
        Assert.assertEquals(expectMessage,actualMessage);

        waitFor();
        //------------------------------test case end
    }
    @Test
    public void facebookLink1()
    {
        WebElement fb = driver.findElement(By.xpath("//i[@class='fa fa-facebook-official']"));
        boolean presence = fb.isDisplayed();
        Assert.assertTrue(presence);
    }

    public static void waitFor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
