import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HemaTestCase extends Hooks{

    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://jfi.bananaapps.co.uk/faq.php";
        String expectedTitle = "FAQ'S - Just Free It";
        String actualTitle = "";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        driver.quit();
    }}

