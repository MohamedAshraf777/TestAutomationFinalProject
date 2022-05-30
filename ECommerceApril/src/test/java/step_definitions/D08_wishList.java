package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import  Pages.*;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;

import static step_definitions.Hooks.driver;

public class D08_wishList {

    wishListPage wishList = new wishListPage(driver);
    homePage home = new homePage(driver);
    public int number=0;

    @When("User Add a Product to wishlist")
    public void clickSecondSlider() throws InterruptedException {
        //Doesn't Work
        //wishList.wishListBtn().get(1).click();
        //Add Direct product to wish list
        driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[3]")).click();
        Thread.sleep(4000);
        //Add Another Prouduct after update ram and hard
        driver.findElement(By.xpath("//button[@title=\"Add to wishlist\"][@class=\"button-2 add-to-wishlist-button\"]")).click();
        Hooks.waiting();
        wishList.ramSize.click();
        wishList.hardSize.click();
        wishList.addToWishList.click();
        Thread.sleep(4000);
        //Back to home page and add another product
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[2]")).click();
        driver.findElement(By.id("add-to-wishlist-button-4")).click();
        Thread.sleep(4000);

    }


    @Then("WishList Notification Displayed")
    public void notificationDisplayed() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]")).isDisplayed());
    }
    @And("User Get Number of items in wish List After Adding a Product")
    public void numItemsWishList(){

        String text = driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText();
       text= text.replaceAll("[^0-9]","");
       number =Integer.parseInt(text);

    }

    @Then("Number of WishList Items Increased")
    public void itemsIncreased(){

        Assert.assertTrue(number>0);

        System.out.println("WishList items is " + number);
    }
    @And("User Go to WishList page")
    public void clickWishlist(){

        driver.findElement(By.className("wishlist-label")).click();
    }
    @And("Count Numbers of quantities")
    public void getTotal(){


        String firstProduct= wishList.quantities().get(0).getAttribute("value");
        String secondProduct= wishList.quantities().get(1).getAttribute("value");
        String thirdProduct= wishList.quantities().get(2).getAttribute("value");
        /*String firstProduct=driver.findElements(By.cssSelector("input[class=\"qty-input\"]")).get(0).getAttribute("value");
        String secondProduct=driver.findElements(By.cssSelector("input[class=\"qty-input\"]")).get(1).getAttribute("value");
        String thirdProduct=driver.findElements(By.cssSelector("input[class=\"qty-input\"]")).get(2).getAttribute("value");*/
        int total = Integer.parseInt(firstProduct) + Integer.parseInt(secondProduct)+ Integer.parseInt(thirdProduct);
        System.out.println("Total Quantities are =" + total);

    }

}
