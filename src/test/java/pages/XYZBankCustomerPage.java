package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class XYZBankCustomerPage {

    public XYZBankCustomerPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "userSelect")
    public WebElement yourNameDropDown;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@ng-click='deposit()']")
    public WebElement depositButton;

    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    public WebElement withdrawlButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    public WebElement depositAmountInput;

    @FindBy(xpath = "//input[@ng-model='amount']")
    public WebElement withdrawlAmountInput;

    @FindBy(xpath = "//button[.='Deposit']")
    public WebElement depositSubmitButton;

    @FindBy(xpath = "//span[.='Deposit Successful']")
    public WebElement depositSuccessMessage;

    @FindBy(xpath = "//span[.='Transaction successful']")
    public WebElement withdrawlSuccessMessage;

    @FindBy(xpath = "//button[.='Withdraw']")
    public WebElement withdrawSubmitButton;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logoutButton;

}