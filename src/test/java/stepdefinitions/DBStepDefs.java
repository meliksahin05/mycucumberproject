package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DBStepDefs {

    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {
        DBUtils.createConnection();
    }

    @And("user gets the column {string} from the table {string}")
    public void userGetsTheColumnFromTheTable(String column, String table) {
//        DBUtils.executeQuery( "select * from jhi_user" ); hard coded
        DBUtils.executeQuery( "select "+column+" from "+table+"" );
    }
    @And("read all the column {string} data")
    public void readAllTheColumnData(String column) throws SQLException {
//        go the next row
        DBUtils.getResultset().next();
//        getting the data
        Object object1 = DBUtils.getResultset().getObject(column);
        System.out.println(object1);
//        --------------------------
        DBUtils.getResultset().next();
        Object object2 = DBUtils.getResultset().getObject(column);
        System.out.println(object2);
//        --------------------------
        DBUtils.getResultset().next();
        Object object3 = DBUtils.getResultset().getObject(column);
        System.out.println(object3);
//        --------------------------
        DBUtils.getResultset().absolute(4);//going to the 4th row
        Object object4 = DBUtils.getResultset().getObject(column);
        System.out.println(object4);
//        ---------------------------

        int rowNum = 5;
        while (DBUtils.getResultset().next()){
            Object currentRowData = DBUtils.getResultset().getObject(column);
            System.out.println(rowNum +" : "+ currentRowData);
            rowNum++;
        }
        System.out.println("There are "+rowNum +" data in this column "+column);


    }
 }

