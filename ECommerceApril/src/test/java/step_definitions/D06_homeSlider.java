package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import Pages.homePage;

import static step_definitions.Hooks.driver;

public class D06_homeSlider {


  homePage home = new homePage(driver);


    @When("User Could Click on Nokia Slider")
    public void clickFirstSlider()throws InterruptedException {
       home.sliderNumber("0").click();
       //driver.findElement (By.xpath("//div[@id=\"nivo-slider\"]//a[@href=\"http://demo.nopcommerce.com/\"][1]")).click();
        System.out.println("Slider one Clicked Successfully");

    }

    @Then("User Redirect to Nokia Page Successfully")
    public void nokiaPageDisplayed() throws InterruptedException {
        SoftAssert nokiaSliderAssert = new SoftAssert();
        Thread.sleep(2000);
        nokiaSliderAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"),"Un Successfully Step to go Nokia Page ");
        nokiaSliderAssert.assertAll();
    }

    @When("User Could Click on IPhone Slider")
    public void clickSecondSlider() throws InterruptedException {

        Thread.sleep(1000);
        //driver.findElement(By.xpath("//div[@id=\"nivo-slider\"]//a[@href=\"http://demo.nopcommerce.com/\"][2]")).click();
        home.sliderNumber("1").click();
        System.out.println("Slider Two Clicked Successfully");

    }

    @Then("User Redirect to IPhone Page Successfully")
    public void iPhonePageDisplayed() throws InterruptedException {
        SoftAssert iPhoneAssert = new SoftAssert();
        Thread.sleep(2000);

        iPhoneAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"),"Un Successfully Step to go IPhone Page ");
        iPhoneAssert.assertAll();
    }




}
