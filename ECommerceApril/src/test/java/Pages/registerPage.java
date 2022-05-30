package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {

    WebDriver driver;

    public registerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "// input[@type=\"radio\"]")
    public WebElement Gender;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]  //option [@value=\"25\"]")
    public WebElement Day;

    @FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]  //option [@value=\"5\"]")
    public WebElement Month;

    @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]  //option [@value=\"1996\"]")
    public WebElement Year;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Company")
    public WebElement company;

    @FindBy(id = "Password")
    public WebElement pass;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPass;

    @FindBy(id = "register-button")
    public WebElement registerButton;

    @FindBy(className = "result")
    public WebElement successMsg;

   }
