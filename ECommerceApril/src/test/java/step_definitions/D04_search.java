package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import Pages.*;

import static step_definitions.Hooks.driver;

public class D04_search {


    homePage home = new homePage(driver);
    int size=0;


    @Given("^User Could Write \"(.*)\" in Search Box$")
    public void nokiaSearch(String product){
        home.searchBox.sendKeys(product);
    }

    @When("User Could Click on Search Button")
    public void clickSearchButton(){
        home.searchButton.click();
        Hooks.waiting();
    }

    @Then("User could Confirm Results of His Search")
    public void confirmResults(){
        SoftAssert searchAssert = new SoftAssert();
       searchAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search"));;

        searchAssert.assertAll();
    }

    @Then("User Could Confirm Numbers of items Diplayed")
    public void skuconfirmResults(){
        SoftAssert searchAssert = new SoftAssert();
        size=driver.findElements(By.cssSelector("div[class=\"item-grid\"]")).size();
        if (size>0)
        {
            searchAssert.assertTrue(size>0,"Search Done Successfully");
            System.out.println("Number of items displayed is :" + size);
        }
        else
        {
            System.out.println("Sorry, Displayed Items is = " + size);
        }
        searchAssert.assertAll();
    }

}
