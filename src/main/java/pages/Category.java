package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category extends basePage {

    @FindBy(id = "tag")
    private WebElement searchBar;

    @FindBy(xpath = "//i[@class='fa fa-map-marker']")
    private WebElement locate;


//    ----locators

    public Category(WebDriver driver)
    {
        //super(driver);
        PageFactory.initElements(driver, this);

    }

    public void selectLocation() {
        locate.click();
    }

    public void selectFirstLocation() {
       locate.click();
    }

}
