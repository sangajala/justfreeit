import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage{

    WebDriver driver;
//    @FindBy(id = "tag")
//    private WebElement searchBar;


//    -------------locators------------------------------

    private String searchBar = "tag";
    private String button;
    private String links;
    private String LogoutButton;



//    ---actoins ---------------------


    public void Search(String text){

        driver.findElement(By.id(searchBar)).sendKeys(text);

    }

    public void NaviagetoLink(){};

    public void GoLogin(){};
    public void GoToRegister(){};

    public void GotoCategory(){};
    public void Logout(){};


}
