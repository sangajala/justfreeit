package oldtests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Hooks;

import static org.junit.Assert.assertEquals;

public class Testsuite1_Categories extends Hooks {
   // WebDriver driver;
    //@Before
    public void open()
    {
//        driver=new FirefoxDriver();
        System.setProperty("webdriver.geckodriver", "geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        Hooks.driver = new ChromeDriver();
        Hooks.driver.get("http://jfi.bananaapps.co.uk/");
    }
    @Test
    public void categoryAkhila()
    {
        WebElement e2 = Hooks.driver.findElement(By.linkText("Categories"));
        //.click();
        waitFor();
        WebElement element= Hooks.driver.findElement(By.cssSelector(".title"));
        String act=element.getText();
        String exp="All Categories";
        assertEquals(exp,act);

        Actions a = new Actions(Hooks.driver);
        a.dragAndDrop(element,e2).perform();
        a.contextClick();
        a.doubleClick();

        Hooks.driver.switchTo().frame(1);
        Hooks.driver.switchTo().frame("menu");
        //element of the frame using other locaators like xpath
        WebElement frameElement = Hooks.driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
        Hooks.driver.switchTo().frame(frameElement);


//        <li class="ui-menu-item" id="ui-id-24" tabindex="-1">Iphone 6+</li>

        WebDriverWait w = new WebDriverWait(Hooks.driver, 30);

        w.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(By.id("ui-id-24"))));



        Assert.assertTrue(Hooks.driver.findElement(By.id("main-frame-error")).isDisplayed());


    }
    @Test
    public void carsAkhila()
    {
        categoryAkhila();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/a/i")).click();
    }
    @Test
    public void commVehicleAkhila()
    {
        categoryAkhila();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[2]/div[1]/a/h4")).click();
waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-two']/div/a")).click();
    }
    @Test
    public void petsAkhila()
    {
        categoryAkhila();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[4]/a")).click();
        waitFor();
        WebElement element= Hooks.driver.findElement(By.linkText("Fish aquarium"));
        boolean present=element.isDisplayed();
        if(present=true)
        {
            element.click();
            System.out.println("Elememt is Present");
        }
        else
            System.out.println("Sorry we are not able to find the specified element");

    }
    @Test

    public void electronics_laptopByMadhu() {
        categoryAkhila();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        waitFor();
        WebElement ele= Hooks.driver.findElement(By.cssSelector(".title"));
        String actual=ele.getText();
        String expected="Sub Categories";
        assertEquals(expected,actual);
        // assertEquals("Sub Categories", driver.findElement(By.cssSelector(".title")).getText());
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion']/div[2]/div[1]/a/h4/span/i")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-two']/div/a")).click();
    }
    @Test

    public void electronics_MobileByMadhu()
    {
        categoryAkhila();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        waitFor();
        Assert.assertEquals("Sub Categories", Hooks.driver.findElement(By.cssSelector(".title")).getText());
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[5]/div[2]/div[1]/h4/a")).click();
    }
    @Test

    public void realEstateMadhu() {
        categoryAkhila();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[3]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
    }
    @Test

    public void sportsMadhu()
    {
        categoryAkhila();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[6]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.linkText("cricket bat")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@class='hide-text']")).click();
        //driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/span/span[1]")).click();
    }
    @Test

    public void booksAndMagazinesVidya()
    {
        categoryAkhila();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[9]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/h4/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/span/span[1]")).click();
    }
    @Test
    public void isElementPresentMadhu()
    {   categoryAkhila();
        waitFor();
        WebElement ele= Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[7]/a"));
        boolean present=ele.isDisplayed();
        if(present=true) {
            ele.click();
            System.out.println(present+" "+"Element is present");
            Assert.assertTrue(present);
        }
        else
            System.out.println("soory ,there is no element matching to this xpath");
    }

    @Test
    public void fashionVidya()
    {
        categoryAkhila();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[5]/a")).click();
      /* WebElement web=driver.findElement(By.cssSelector(".featured-top>h4"));
       String actual=web.getText();
       String expected="Recent Adds";
       assertEquals(expected,actual);*/
        Assert.assertEquals("Recent Adds", Hooks.driver.findElement(By.cssSelector(".featured-top>h4")).getText());

    }
    @Test
    public void homeappVidya()
    {
        categoryAkhila();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[8]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/h4/a")).click();
    }

    @Test
    public void booksShameem()
    {
        categoryAkhila();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[9]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/h4/a")).click();
        waitFor();
        Hooks.driver.findElement(By.xpath("//*[@id='product-carousel']/a[2]/i")).click();
    }
    @Test
    public void jobsShameem()
    {
       categoryAkhila();
       waitFor();
       Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[10]/a")).click();
       waitFor();
       Hooks.driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/h4/a")).click();
       waitFor();
       Hooks.driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/span")).click();
    }
    @Test
    public void miscShameem()
    {
        categoryAkhila();
        Hooks.driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[7]/a")).click();
               Assert.assertEquals("Recent Adds", Hooks.driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div/h4")).getText());
    }
    //@After
    public void close() {

        waitFor();
        Hooks.driver.quit();
    }

    private void waitFor() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Hooks.driver.close();
        }
    }
}



