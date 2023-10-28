package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GoogleHomePage;
import utilities.Driver;
import utilities.WaitUtils;

public class CommonStepDefs {
    GoogleHomePage googleHomePage = new GoogleHomePage();
    @Given("user navigates to {string}")
    public void user_navigates_to(String url) {
        Driver.getDriver().get(url);
        WaitUtils.waitFor(2);
        googleHomePage.cookiePopUp.click();
        WaitUtils.waitFor(2);

    }
    @Then("user verifies page title contains {string}")
    public void user_verifies_page_title_contains(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
        WaitUtils.waitFor(2);
    }
    @Then("close the application")
    public void close_the_application() {

        Driver.closeDriver();
        WaitUtils.waitFor(2);
    }
}

