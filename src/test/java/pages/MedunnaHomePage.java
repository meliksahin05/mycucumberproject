package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class MedunnaHomePage {
    public MedunnaHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "account-menu")
    public WebElement userIcon;
    @FindBy(id = "login-item")
    public WebElement signInOption;
    @FindBy(id = "entity-menu")
    public WebElement itemsAndTitlesMenu;
    @FindBy(linkText = "Patient")
    public WebElement patientOption;
    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerOption;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement getSignInButton;


    @FindBy(id = "rememberMe")
    public WebElement rememberMe;


}