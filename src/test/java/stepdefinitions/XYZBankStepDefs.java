package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.XYZBankHomePage;
import pages.XYZBankManagerPage;
import utilities.Driver;

import java.util.List;

public class XYZBankStepDefs {
    XYZBankHomePage xyzBankHomePage = new XYZBankHomePage();
    XYZBankManagerPage xyzBankManagerPage = new XYZBankManagerPage();

    @Given("Go to url {string}")
    public void go_to_url(String url) {
        Driver.getDriver().get(url);
    }

    @When("Click on Bank Manager Login button")
    public void click_on_bank_manager_login_button() {
        xyzBankHomePage.bankManagerLoginButton.click();
    }

    @When("Click on Add Customer button")
    public void click_on_add_customer_button() {
        xyzBankManagerPage.addCustomerButton.click();
    }

    @When("Fill inputs and click on Add Customer form Accept alert")
    public void fill_inputs_and_click_on_add_customer_form_accept_alert(DataTable dataTable) {
        List<String> firstnames = dataTable.column(0);
        List<String> lastnames = dataTable.column(1);
        List<String> postcodes = dataTable.column(2);

        for (int i=0; i<firstnames.size(); i++){

            xyzBankManagerPage.firstNameInput.sendKeys(firstnames.get(i));
            xyzBankManagerPage.lastNameInput.sendKeys(lastnames.get(i));
            xyzBankManagerPage.postCodeInput.sendKeys(postcodes.get(i));
            xyzBankManagerPage.addCustomerSubmitButton.click();
            Driver.getDriver().switchTo().alert().accept();

        }

    }

}