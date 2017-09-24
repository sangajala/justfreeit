import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class FirstProgram extends Hooks {
    //WebDriver driver;
    //@Before

       public void openurl() {
       //public static void main(String[] args)throws InterruptedException {
       System.out.println("This is my first program");
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\gurpr\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
       //opening the browser
       Hooks.driver = new FirefoxDriver();
       Hooks.driver.get("http://jfi.bananaapps.co.uk/");
    }
    @Test
        //printing the title of the page
        public void homepagetitle() {
        String title = Hooks.driver.getTitle();
        System.out.println("The title is :" + title);
        //comparing the expected with actual
        Assert.assertEquals("Free Classified", title);
    }
    @Test
       //Verifying the test is displayed or not "India's only non profit free household sharing organisation"
        public void textDisplay() {
        WebElement element;
        element = Hooks.driver.findElement(By.xpath("html/body/section/div/div[1]/h1[1]"));
        boolean status;
        status = element.isDisplayed();
        System.out.println(status);
    }
        @Test
        //Sandhya
        //Verifying the search textbox
         public void searchtextbox()throws InterruptedException {
         WebElement searchbox;
         //finding the element for the search text box
         searchbox = Hooks.driver.findElement(By.id("tag"));
         //type in the search box "cricket bat"
         searchbox.sendKeys("cricket bat");
         Hooks.driver.findElement(By.id("search")).click();
         Thread.sleep(5000);
         String Url = Hooks.driver.getCurrentUrl();
         System.out.println("the url is:" + Url);
         String title1 = Hooks.driver.getTitle();
         System.out.println("the title is ;" + title1);
         Assert.assertEquals("Item Details", title1);
         Hooks.driver.findElement(By.linkText("Home")).click();
        }

         @Test
        //Categories option
          public void categories()throws InterruptedException {
         //WebElement categories;
         //clicking the categories link
          Hooks.driver.findElement(By.linkText("Categories")).click();
          Thread.sleep(5000);
          String Url1 = Hooks.driver.getCurrentUrl();
          System.out.println("the url is:" + Url1);
          String title2 = Hooks.driver.getTitle();
          //printing the title
          System.out.println("the title is ;" + title2);
          Assert.assertEquals("Categories", title2);
          //checking the text"All Categories" present or not
          boolean isTheTextPresent = Hooks.driver.getPageSource().contains("All Categories");
          assertTrue(isTheTextPresent);
          Hooks.driver.findElement(By.linkText("Home")).click();
         }

         @Test

        //About us
          public void aboutus() throws InterruptedException {
        //clicking on about us link
          Hooks.driver.findElement(By.linkText("About us")).click();
          Thread.sleep(5000);
          String Url2 = Hooks.driver.getCurrentUrl();
          //printing the current url
          System.out.println("the url is:" + Url2);
          String title3 = Hooks.driver.getTitle();
          //printing the titlr
          System.out.println("the title is ;" + title3);
          //comparing expected with actual
          Assert.assertEquals("About us", title3);
          boolean isTheTextPresent = Hooks.driver.getPageSource().contains("About Us");
          assertTrue(isTheTextPresent);
          Hooks.driver.findElement(By.linkText("Home")).click();
         }

         @Test

        //Contact us
          public void contactus() throws InterruptedException {
        //finding the elemrnt and clicking the contact us link
          Hooks.driver.findElement(By.linkText("Contact us")).click();
          Thread.sleep(5000);
          String Url3 = Hooks.driver.getCurrentUrl();
          System.out.println("the url is:" + Url3);
          String title4 = Hooks.driver.getTitle();
          System.out.println("the title is ;" + title4);
          Assert.assertEquals("Contact us", title4);
          boolean isTheTextPresent = Hooks.driver.getPageSource().contains("Contact Us");
          assertTrue(isTheTextPresent);
          Hooks.driver.findElement(By.linkText("Home")).click();
         }
         @Test

        //Post/Request item
          public void postRequest() throws InterruptedException {
          Hooks.driver.findElement(By.linkText("Post / Request Item")).click();
           Thread.sleep(5000);
           String Url4 = Hooks.driver.getCurrentUrl();
           System.out.println("the url is:" + Url4);
           String title5 = Hooks.driver.getTitle();
           System.out.println("the title is ;" + title5);
           Assert.assertEquals("User Profile", title5);
           boolean isTheTextPresent = Hooks.driver.getPageSource().contains("User Profile");
           assertTrue(isTheTextPresent);
          // driver.findElement(By.linkText("Home")).click();
         }
         @Test
         //gurpreet

        //finding the element and click on Log in
           public void logIn() throws InterruptedException {
           Hooks.driver.findElement(By.linkText("Log In")).click();
           Thread.sleep(5000);
           String Url5 = Hooks.driver.getCurrentUrl();
           //printing the current url
           System.out.println("the url is:" + Url5);
           String title6 = Hooks.driver.getTitle();
           //printing the title
           System.out.println("the title is ;" + title6);
           //comparing expected with actual
           Assert.assertEquals("Free Classified", title6);
           //checking whether the text "Welcome to just free it " present or not
           boolean isTheTextPresent = Hooks.driver.getPageSource().contains("Welcome to Just Free It");
           assertTrue(isTheTextPresent);
           //closing the page
           Hooks.driver.findElement(By.className("close")).click();
            Hooks.driver.findElement(By.linkText("Home")).click();
         }
         @Test
         //checking whether the facebook link present or not
            public void facebooklink() {
            WebElement fb = Hooks.driver.findElement(By.xpath("html/body/footer/section/div/div/div[3]/div/ul/li[1]/a"));
            boolean status;
            status = fb.isDisplayed();
            System.out.println(status);
         }

        // @After
         //closing the browser
           public void close(){
           System.out.println("closing the window");
           Hooks.driver.quit();




    }
}
