package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends basePage {




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

    public boolean isUserInHomePage() {
        return driver.findElement(By.tagName("body")).getText().contains("India's only non profit free household sharing organization");
    }


    public void goBack() {
        driver.navigate().back();
    }

    public void clickOnPage(String linkName) {
        System.out.println("Printing for gurpreet:"+linkName);
        driver.findElement(new By.ByPartialLinkText(linkName)).click();
    }
}
