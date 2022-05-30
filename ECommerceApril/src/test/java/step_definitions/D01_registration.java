package step_definitions;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import Pages.registerPage;
import Pages.homePage;
import Pages.*;

import static step_definitions.Hooks.driver;

public class D01_registration {

    registerPage registration = new registerPage(Hooks.driver);

    @Given("User Click on Register Link")
    public void clickRegisterLink(){
        homePage home = new homePage(Hooks.driver);
        home.registerLink.click();
    }

    @When("User Could Select His Gender")
    public void selectGender(){
        registration.Gender.click();
    }

    @And("User Could Enter His Name")
    public void enterName(){
        registration.firstName.sendKeys("Mohamed");
        registration.lastName.sendKeys("Ashraf");
    }

    @And("User Could Select His Date of Birth")
    public void selectDate(){
        registration.Day.click();
        registration.Month.click();
        registration.Year.click();
    }

    @And("^User Could Enter Valid Email \"(.*)\"$")
    public void validEmail(String email){
        registration.email.sendKeys(email);
    }

    @And("User Could Enter Company Name")
    public void enterCompName(){
        registration.company.sendKeys("Nahdet Misr");
    }

    @And("^User Could Enter Password 2 times \"(.*)\"$")
    public void enterPass(String password){
        registration.pass.sendKeys(password);
        registration.confirmPass.sendKeys(password);
    }

    @And("User Could Click on Register Button")
    public void clickRegisterButton(){
        registration.registerButton.click();
        Hooks.waiting();
    }

    @Then("User could Sign Up successfully")
    public void signUpSuccessfully(){
        SoftAssert signAssert = new SoftAssert();
       // signAssert.assertTrue(registration.successMsg.getText().contains("Your registration completed"));
        signAssert.assertTrue(registration.successMsg.isDisplayed());
        signAssert.assertEquals(registration.successMsg.getCssValue("color"), "rgba(76, 177, 124, 1)");
        signAssert.assertAll();
    }






}

    //Old Cod

/*@And("User navigate to home page")
    public void home_Page(){
        String url="https://demo.nopcommerce.com/";
        driver.navigate().to(url);
    }

    @And("User click on register Link")
    public void click_register_Link(){
        driver.findElement(By.className("ico-register")).click();
    }

    @And("User  fills Your Personal Details with valid Data")
    public void personal_Details(){
        driver.findElement(By.cssSelector("input[id^=\"FirstName\"]")).sendKeys("Ahmed");
        driver.findElement(By.cssSelector("input[id^=\"LastName\"]")).sendKeys("test");
        driver.findElement(By.name("Email")).sendKeys("testing21@gmail.com");
    }

    @And("User fills Your Password")
    public void password(){
        driver.findElement(By.cssSelector("input[id^=\"Password\"]")).sendKeys("1q2w3e4A5S6D");
        driver.findElement(By.cssSelector("input[id^=\"ConfirmPassword\"]")).sendKeys("1q2w3e4A5S6D");
    }

    @And("User clicks on register button")
    public void click_Register(){
        driver.findElement(By.xpath("//button[contains(@name,\"register-butt\")]")).click();
    }
    @Then("Success message is displayed")
    public void success_Message(){
        //isDisplayed() to verify that the element on UI Page not Dom Page
        //Assert.assertTrue(driver.findElement(By.partialLinkText("Your registration complet")).isDisplayed());
        //Assert.assertEquals(driver.findElement(By.partialLinkText("Your registration complet")).isDisplayed(),true);

        Assert.assertEquals(driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed(),true);
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
        soft.assertTrue(driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());
        soft.assertAll();


    }*/






