package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import Pages.*;

import static step_definitions.Hooks.driver;

public class D05_hoverOnCategory {

    homePage home = new homePage(driver);
    Actions hoverAction = new Actions(driver);
    String subCategoryName;
    long categoryCount;


    @Given("User Could Hover on Menu Items")
    public void hoverHeader() {
        hoverAction.moveToElement(home.headerMenu).perform();
        hoverAction.moveToElement(home.electronicsList).perform();

        // hoverAction.moveToElement(home.computersList).perform();
    }

    @When("User Could Click on Sub Category Phones")
    public void clickOnPhones() {
        hoverAction.moveToElement(home.phonesItems);
        subCategoryName = home.phonesItems.getText().toLowerCase().trim();
        hoverAction.click().build().perform();
        System.out.println(subCategoryName);
        Hooks.waiting();
    }

   @Then("User Could Open Sub Category Page Successfully")
    public void subCategoryPage()
    {
        SoftAssert subCategoryAssert = new SoftAssert();
        String subCategoryPageTitle= driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText().toLowerCase().trim();
        subCategoryAssert.assertEquals(subCategoryPageTitle,subCategoryName);
        System.out.println( "Page Title is: "+ subCategoryPageTitle +" , " + "SubCategory Clicked is : " + subCategoryName);
    }

  }


