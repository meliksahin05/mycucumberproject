package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactListHomePage {


    public ContactListHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "signup")
    public WebElement signUpButton;

}