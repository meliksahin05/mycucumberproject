package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GoogleHomePage;
import utilities.Driver;
import utilities.WaitUtils;

public class GoogleStepDefs {
    GoogleHomePage googleHomePage = new GoogleHomePage();
    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
//        if there is a Google cookie popup then click.
        WaitUtils.waitFor(2);
        googleHomePage.cookiePopUp.click();

    }
    @Given("user search for iPhone")
    public void user_search_for_i_phone() {
        googleHomePage.googleSearchBox.sendKeys("iPhone"+ Keys.ENTER);
        WaitUtils.waitFor(2);
    }
    @Then("verify the result contains iPhone")
    public void verify_the_result_contains_i_phone() {
//        title contains iPhone
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
        WaitUtils.waitFor(2);
    }
    @Given("search for porcelain tea pot")
    public void search_for_porcelain_tea_pot() {
        googleHomePage.googleSearchBox.sendKeys("porcelain tea pot"+Keys.ENTER);
        WaitUtils.waitFor(2);
    }
    @Then("verify the result contains porcelain tea pot")
    public void verify_the_result_contains_porcelain_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("porcelain tea pot"));
        WaitUtils.waitFor(2);
    }
    @Given("user search for {string} on google")
    public void user_search_for_on_google(String string) {
        WaitUtils.waitFor(2);
        googleHomePage.googleSearchBox.sendKeys(string+Keys.ENTER);
        WaitUtils.waitFor(2);
    }
}