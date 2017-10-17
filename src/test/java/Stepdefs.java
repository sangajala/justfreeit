import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.Account;
import pages.Category;
import pages.HomePage;
import utils.Hooks;
import utils.WebDriverUtil;

public class Stepdefs extends Hooks {

    HomePage homePage;
    Category category;

    @Given("^User is on the home page$")
    public void userIsOnTheHomePage() throws Throwable {
        homePage = new HomePage();
        Assert.assertTrue(homePage.isUserInHomePage());

    }
    @When("^user navigates back$")
    public void userNavigatesBack() throws Throwable {
        homePage.goBack();

    }
    @When("^he clicks on \"([^\"]*)\" link$")
    public void heClicksOnLink(String linkName)  {
        homePage.clickOnPage(linkName);

    }
    @Then("^he should be landed on page with text \"([^\"]*)\"$")
    public void heShouldBeLandedOnPageWithText(String text) throws Throwable {
      Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(text));
    }

    @When("^he enters data in contact us form with name \"([^\"]*)\" and email \"([^\"]*)\" and subject \"([^\"]*)\" and message \"([^\"]*)\"$")
    public void amemailAndSubjectAndMessage(String name, String email, String sub, String message) {
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("subject")).sendKeys(sub);
        driver.findElement(By.id("message")).sendKeys(message);
        driver.findElement(By.name("SAVE")).click();
    }

    @Then("^the message should be sent successfully$")
    public void theMessageShouldBeSentSuccessfully() throws Throwable {

    }

    @Then("^the error message \"([^\"]*)\" is displayed$")
    public void theErrorMessageIsDisplayed(String arg0) throws Throwable {

    }

    @When("^he types \"([^\"]*)\"$")
    public void heTypes(String text) throws Throwable {

        HomePage homePage = new HomePage();
        homePage.Search(text);
        homePage.GoLogin();

        Account account = new Account();
        account.login();


    }

    @And("^he select the first item's location$")
    public void heSelectTheFirstItemSLocation() throws Throwable {
        category = new Category(driver);
        category.selectLocation();
    }

    @Then("^User should view the location of the selelcted item$")
    public void userShouldViewTheLocationOfTheSelelctedItem() throws Throwable {
        Assert.assertTrue(WebDriverUtil.isTextPresent("london"));
    }
}


