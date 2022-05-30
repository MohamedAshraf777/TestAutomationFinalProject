package step_definitions;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import Pages.homePage;
import Pages.loginPage;

public class D02_login {

     loginPage login = new loginPage(Hooks.driver);
    homePage home = new homePage(Hooks.driver);

    @Given("User Click on Login Link")
    public void clickLoginLink(){
        home.loginLink.click();
    }

    @When("^User Enter Email and Pass= \"(.*)\" and \"(.*)\"$")
    public void enterCredential(String Email, String Password){
        login.loginData(Email, Password);
    }

    @And("User Could Click on Login Button")
    public void clickLoginButton(){
        login.loginButton.click();
        Hooks.waiting();
    }

    @Then("User could login successfully")
    public void loginSuccessfully(){
        SoftAssert logAssert = new SoftAssert();
        logAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        logAssert.assertTrue(home.myAccountLink.isDisplayed());
        logAssert.assertAll();

    }

}
