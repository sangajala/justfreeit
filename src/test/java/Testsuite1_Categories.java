import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class Testsuite1_Categories extends Hooks {
   // WebDriver driver;
    //@Before
    public void open()
    {
//        driver=new FirefoxDriver();
        System.setProperty("webdriver.geckodriver", "geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("http://jfi.bananaapps.co.uk/");
    }
    @Test
    public void categoryAkhila()
    {
        driver.findElement(By.linkText("Categories")).click();
        waitFor();
        WebElement element=driver.findElement(By.cssSelector(".title"));
        String act=element.getText();
        String exp="All Categories";
        assertEquals(exp,act);
    }
    @Test
    public void carsAkhila()
    {
        categoryAkhila();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/a/i")).click();
    }
    @Test
    public void commVehicleAkhila()
    {
        categoryAkhila();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion']/div[2]/div[1]/a/h4")).click();
waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-two']/div/a")).click();
    }
    @Test
    public void petsAkhila()
    {
        categoryAkhila();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[4]/a")).click();
        waitFor();
        WebElement element=driver.findElement(By.linkText("Fish aquarium"));
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
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        waitFor();
        WebElement ele=driver.findElement(By.cssSelector(".title"));
        String actual=ele.getText();
        String expected="Sub Categories";
        assertEquals(expected,actual);
        // assertEquals("Sub Categories", driver.findElement(By.cssSelector(".title")).getText());
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion']/div[2]/div[1]/a/h4/span/i")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-two']/div/a")).click();
    }
    @Test

    public void electronics_MobileByMadhu()
    {
        categoryAkhila();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        waitFor();
        assertEquals("Sub Categories", driver.findElement(By.cssSelector(".title")).getText());
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[5]/div[2]/div[1]/h4/a")).click();
    }
    @Test

    public void realEstateMadhu() {
        categoryAkhila();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[3]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
    }
    @Test

    public void sportsMadhu()
    {
        categoryAkhila();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[6]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        driver.findElement(By.linkText("cricket bat")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@class='hide-text']")).click();
        //driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/span/span[1]")).click();
    }
    @Test

    public void booksAndMagazinesVidya()
    {
        categoryAkhila();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[9]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[2]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/h4/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/span/span[1]")).click();
    }
    @Test
    public void isElementPresentMadhu()
    {   categoryAkhila();
        waitFor();
        WebElement ele=driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[7]/a"));
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
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[5]/a")).click();
      /* WebElement web=driver.findElement(By.cssSelector(".featured-top>h4"));
       String actual=web.getText();
       String expected="Recent Adds";
       assertEquals(expected,actual);*/
        assertEquals("Recent Adds",driver.findElement(By.cssSelector(".featured-top>h4")).getText());

    }
    @Test
    public void homeappVidya()
    {
        categoryAkhila();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[8]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/h4/a")).click();
    }

    @Test
    public void booksShameem()
    {
        categoryAkhila();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[9]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[1]/a")).click();
        waitFor();
        driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/h4/a")).click();
        waitFor();
        driver.findElement(By.xpath("//*[@id='product-carousel']/a[2]/i")).click();
    }
    @Test
    public void jobsShameem()
    {
       categoryAkhila();
       waitFor();
       driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[10]/a")).click();
       waitFor();
       driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/h4/a")).click();
       waitFor();
       driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div[2]/span")).click();
    }
    @Test
    public void miscShameem()
    {
        categoryAkhila();
        driver.findElement(By.xpath(".//*[@id='accordion-one']/div/ul/li[7]/a")).click();
               assertEquals("Recent Adds",driver.findElement(By.xpath(".//*[@id='main']/div/div[3]/div/div[2]/div/div/h4")).getText());
    }
    //@After
    public void close() {

        waitFor();
        driver.quit();
    }

    private void waitFor() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            driver.close();
        }
    }
}



