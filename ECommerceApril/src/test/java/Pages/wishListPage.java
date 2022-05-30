package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import static step_definitions.Hooks.driver;

public class wishListPage {
    WebDriver driver;

    public wishListPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//this method doesn't work although code is correct
    public List<WebElement> wishListBtn(){
       WebElement elements = (WebElement) driver.findElements(By.xpath("//button[@title=\"Add to wishlist\"][@class=\"button-2 add-to-wishlist-button\"]"));
        //Object element = driver.findElement(By.xpath("//button[@title=\"Add to wishlist\"][@class=\"button-2 add-to-wishlist-button\"]"));
        return (List<WebElement>) elements;
    }

    public List<WebElement> quantities(){

        return driver.findElements(By.cssSelector("input[class=\"qty-input\"]"));
    }
    public List<WebElement> prices(){

        return driver.findElements(By.cssSelector("input[class=\"qty-input\"]"));
    }

    @FindBy (xpath = "//select[@id=\"product_attribute_2\"] //option[@value=\"5\"]")
    public WebElement ramSize;

    @FindBy (id="product_attribute_3_7")
    public WebElement hardSize;

    @FindBy(id="add-to-wishlist-button-1")
    public WebElement addToWishList;






}
