package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDefs {
    //    create WebDriver object
    WebDriver driver;

    @Given("user navigates to {string} using {string} browser")
    public void user_navigates_to_using_browser(String url, String browser) throws MalformedURLException {
//        1. create a URL object
        URL remoteURL = new URL("http://192.168.0.121:4444");
//        2. instantiating the REMOTE WEB DRIVER
        if (browser.equalsIgnoreCase("chrome")){
            driver = new RemoteWebDriver(remoteURL, new ChromeOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }else if (browser.equalsIgnoreCase("firefox")){
            driver = new RemoteWebDriver(remoteURL, new FirefoxOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }else if (browser.equalsIgnoreCase("edge")){
            driver = new RemoteWebDriver(remoteURL, new EdgeOptions());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }

//        3. go to the application URL
        driver.get(url);
    }


    @Then("verify the title contains {string}")
    public void verify_the_title_contains(String string) {
        Assert.assertTrue(driver.getTitle().contains(string));
    }
    @Then("close the remote driver")
    public void close_the_remote_driver() {
        driver.quit();
    }
}