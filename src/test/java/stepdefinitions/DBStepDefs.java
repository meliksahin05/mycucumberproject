package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

public class DBStepDefs {

    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {
        DBUtils.createConnection();
    }
}
