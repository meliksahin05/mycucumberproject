package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.WaitUtils;

import java.util.List;
import java.util.Map;

import static utilities.WaitUtils.waitFor;

public class ExcelStepDefs {

    DataTablesPage dataTablesPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> dataList;

    @Given("user navigates to {string} pages and enters {string} from {string} excel sheet and verify user creation")
    public void user_navigates_to_page_and_enters_from_excel_sheet_and_verify_user_creation(String URL ,String sheetName, String excelName) {

        String pathOfExcel = "./src/test/resources/"+excelName+"";//this is dynamic way. you can add excelName because it is in the parameter
        excelUtils = new ExcelUtils(pathOfExcel,sheetName);
        dataList = excelUtils.getDataList();
        dataTablesPage = new DataTablesPage();
        for (Map<String,String> eachData : dataList){
            Driver.getDriver().get(URL);
            waitFor(1);
            dataTablesPage.newButton.click();
            waitFor(1);
            dataTablesPage.firstName.sendKeys(eachData.get("first_name"));
            waitFor(1);
            dataTablesPage.lastName.sendKeys(eachData.get("last_name"));
            waitFor(1);
            dataTablesPage.position.sendKeys(eachData.get("position"));
            waitFor(1);
            dataTablesPage.office.sendKeys(eachData.get("office"));
            waitFor(1);
            dataTablesPage.extension.sendKeys(eachData.get("extension"));
            waitFor(1);
            dataTablesPage.startDate.sendKeys(eachData.get("start_date"));
            waitFor(1);
            dataTablesPage.salary.sendKeys(eachData.get("salary"));
            waitFor(1);
            dataTablesPage.createButton.click();
            waitFor(1);
            dataTablesPage.searchField.sendKeys(eachData.get("first_name"));
            waitFor(1);
            Assert.assertTrue(dataTablesPage.nameField.getText().contains(eachData.get("first_name")));
            waitFor(1);
//            dataTablesPage.searchField.clear();
        }

    }


}
