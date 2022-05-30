package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;

    public loginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy (xpath = "//div[@class=\"buttons\"]//button[@type=\"submit\"]")
    public WebElement loginButton;


    public void loginData(String Email, String Password){
        this.email.sendKeys(Email);
        this.password.sendKeys(Password);
    }

}
