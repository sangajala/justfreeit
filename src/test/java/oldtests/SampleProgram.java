package oldtests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import utils.Hooks;

import static org.junit.Assert.assertTrue;

public class SampleProgram extends Hooks {
    //WebDriver driver;

   // @Before

        public void openurl()  {
        System.out.println("This is my first automation program");
        System.setProperty("webdriver.gecko.driver", "C:\\jars\\geckodriver.exe");
        //opening the browser firefox
        Hooks.driver = new FirefoxDriver();
        //opening the Banana apps
       Hooks.driver.get("http://jfi.bananaapps.co.uk/");
    }
    @Test
        //printing the title of the page
        public void hometitle() {
        String title = Hooks.driver.getTitle();
        System.out.println("The title is :" + title);
        //comparing the expected with actual
        Assert.assertEquals("Free Classified", title);
    }


    @Test
       //Verifying the text is displayed or not ''India's only non profit free household sharing organization''
        public void textDisplay() {
        WebElement element;
        element = Hooks.driver.findElement(By.xpath("html/body/section/div/div[1]/h1[1]"));
        boolean status;
        status = element.isDisplayed();
        System.out.println(status);
    }
    @Test
       //Verifying the search text box
      //Sandhya
        public void searchtextbox() throws InterruptedException {
        WebElement searchbox;
        //Finding the element for the search text box
        searchbox = Hooks.driver.findElement(By.id("tag"));
        //typed in the search box "cricket bat
        searchbox.sendKeys("cricket bat ");
        //clicking on the search button
        Hooks.driver.findElement(By.id("search")).click();
        Thread.sleep(5000);
        //printing the current url
        String Url = Hooks.driver.getCurrentUrl();
        System.out.println("The url is :" + Url);
        //printing the title
        String title1 = Hooks.driver.getTitle();
        System.out.println("    The title is :" + title1);
        Assert.assertEquals("Item Details", title1);
        Hooks.driver.findElement(By.linkText("Home")).click();



    }
    //categories option
    //Sampa
@Test
       public void categeroies() throws InterruptedException {
        //clicking on categories
      Hooks.driver.findElement(By.linkText("Categories")).click();
       Thread.sleep(5000);
       //printing the current url
       String Url1 = Hooks.driver.getCurrentUrl();
       System.out.println("The url is :" + Url1);
       //printing the title
       String title2 = Hooks.driver.getTitle();
       System.out.println("    The title is :" + title2);
       Assert.assertEquals("Categories", title2);
      //checking the text'' All Categories'' present or not
       boolean isTheTextPresent = Hooks.driver.getPageSource().contains("All Categories");
       assertTrue(isTheTextPresent);
        Hooks.driver.findElement(By.linkText("Home")).click();
    //Assert.assertEquals("Free Classified", title1);

    }
@Test
    //About us
    //Chetan
    public void aboutUs() throws InterruptedException {
    //finding the element and clicking on About Us
    Hooks.driver.findElement(By.linkText("About us")).click();
    Thread.sleep(5000);
    //printing the current url
    String Url2 = Hooks.driver.getCurrentUrl();
    System.out.println("The url is :" + Url2);
    //printing the title
    String title3 = Hooks.driver.getTitle();
    System.out.println("    The title is :" + title3);
    //verifying the expected with actual result
    Assert.assertEquals("About us", title3);
    boolean isTheTextPresent = Hooks.driver.getPageSource().contains("About Us");
    assertTrue(isTheTextPresent);
     }
@Test
   //Conatct us
    public void contactUs() throws InterruptedException {
    //finding the element and clicking on Conatct us
    Hooks.driver.findElement(By.linkText("Contact us")).click();
    Thread.sleep(5000);
    String Url3 = Hooks.driver.getCurrentUrl();
    System.out.println("The url is :" + Url3);
    String title4 = Hooks.driver.getTitle();
    System.out.println("    The title is :" + title4);
    Assert.assertEquals("Contact us", title4);
   boolean isTheTextPresent = Hooks.driver.getPageSource().contains("Contact Us");
    assertTrue(isTheTextPresent);
    Hooks.driver.findElement(By.linkText("Home")).click();
    }
@Test
    //Post/Request Item
//Abrar
     public void postRequest() throws InterruptedException {
     Hooks.driver.findElement(By.linkText("Post / Request Item")).click();
    Thread.sleep(5000);
    String Url4 = Hooks.driver.getCurrentUrl();
    System.out.println("The url is :" + Url4);
    String title5 = Hooks.driver.getTitle();
    System.out.println("    The title is :" + title5);
    Assert.assertEquals("User Profile", title5);
    boolean isTheTextPresent = Hooks.driver.getPageSource().contains("Oops");
    assertTrue(isTheTextPresent);
    Hooks.driver.findElement(By.linkText("Home")).click();
    }
@Test
     //Log In
     //Gurpreet
     public void logIn() throws InterruptedException {
    //Finding the element login and click on login
    Hooks.driver.findElement(By.linkText("Log In")).click();
    Thread.sleep(5000);
    //Printing the current url
    String Url5 = Hooks.driver.getCurrentUrl();
    System.out.println("The url is :" + Url5);
    //printing the title
    String title6 = Hooks.driver.getTitle();
    System.out.println("    The title is :" + title6);
    //verfiying expected result with actual
    Assert.assertEquals("Free Classified", title6);
    //checking whether the text "Welcome to just free it is present or not
    boolean isTheTextPresent = Hooks.driver.getPageSource().contains("Welcome to Just Free It");
    assertTrue(isTheTextPresent);
    //closing the page
    Hooks.driver.findElement(By.className("close")).click();
    Hooks.driver.findElement(By.linkText("Home")).click();
     }
@Test
// ckecking whether the facebook link present or not
    public void facebooklink(){
    WebElement fb= Hooks.driver.findElement(By.xpath("html/body/footer/section/div/div/div[3]/div/ul/li[1]/a"));
    boolean status;
    status = fb.isDisplayed();
    System.out.println(status);
    }



    //@After

    //closing the browser
    public void close() {
    System.out.println("closing the window");
    Hooks.driver.quit();



    }
}

