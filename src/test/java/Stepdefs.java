import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Stepdefs extends Hooks {

    @Given("^User is on the home page$")
    public void userIsOnTheHomePage() throws Throwable {
        driver.get("http://jfi.bananaapps.co.uk/");
    }
    @When("^user navigates back$")
    public void userNavigatesBack() throws Throwable {
        driver.navigate().back();
    }
    @When("^he clicks on \"([^\"]*)\" link$")
    public void heClicksOnLink(String linkName)  {
        System.out.println("Printing for gurpreet:"+linkName);
        driver.findElement(By.linkText(linkName)).click();
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
}


