package step_definitions;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import Pages.*;
public class D03_switchCurrencies {
     homePage home = new homePage(Hooks.driver);
    Select currencySelector = new Select(home.userCurrency);
    String selectedCurrency;

    @Given("User Check Current Currency")
    public void checkCurrentCurrency(){
        if (home.productPriceCurrency.getText().contains("$") == true)
            selectedCurrency = "US Dollar";
        else
            selectedCurrency = "Euro";
    }

    @When("User Could Change Value of Current Currency from Select List")
    public void changeCurrency(){
        if (selectedCurrency == "US Dollar") {
            currencySelector.selectByVisibleText("Euro");
            selectedCurrency = "Euro";
        }else {
            currencySelector.selectByVisibleText("US Dollar");
            selectedCurrency = "US Dollar";
        }
        Hooks.waiting();
    }

    @Then("User Change Product Price Currency Successfully")
    public void changePriceSuccessfully(){
        SoftAssert CurrencyAssert = new SoftAssert();
        home.userCurrency = currencySelector.getFirstSelectedOption();
        CurrencyAssert.assertTrue(home.userCurrency.getText().contains(selectedCurrency));
        CurrencyAssert.assertAll();
    }

}
