package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static step_definitions.Hooks.driver;
import Pages.homePage;

import java.util.ArrayList;

public class D07_followUS {

    @When("User Click on facebook icon")
    public void fbIconClicked(){
        driver.findElement(By.cssSelector("li[class=\"facebook\"]")).click();
    }

    @Then("FaceBook is Opened in New tab")
    public void openFbTab() throws InterruptedException {
        SoftAssert fbAssert = new SoftAssert();
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        fbAssert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
        driver.close();
        driver.switchTo().window(Tabs.get(0));
        System.out.println(driver.getCurrentUrl());
        fbAssert.assertAll();

    }
    @When("User Click on Twitter icon")
    public void TwitterIconClicked(){
        driver.findElement(By.cssSelector("li[class=\"twitter\"]")).click();
    }

    @Then("Twitter is Opened in New tab")
    public void openTwitterTab() throws InterruptedException {
        SoftAssert twitterAssert = new SoftAssert();
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        twitterAssert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
        driver.close();
        driver.switchTo().window(Tabs.get(0));
        System.out.println(driver.getCurrentUrl());
        twitterAssert.assertAll();

    }
    @When("User Click on Rss icon")
    public void rssIconClicked(){
        driver.findElement(By.cssSelector("li[class=\"rss\"]")).click();
    }

    @Then("Rss is Opened in New tab")
    public void openRssTab() throws InterruptedException {
        SoftAssert rssAssert = new SoftAssert();
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(0));
        System.out.println(driver.getCurrentUrl());
        rssAssert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open");
        System.out.println("Ivalid Link Opened");
        rssAssert.assertAll();

    }
    @When("User Click on YouTube icon")
    public void youtubeIconClicked(){
        driver.findElement(By.cssSelector("li[class=\"youtube\"]")).click();
    }

    @Then("YouTube is Opened in New tab")
    public void YouTubeTab() throws InterruptedException {
        SoftAssert YoutubeAssert = new SoftAssert();
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        System.out.println(driver.getCurrentUrl());
        YoutubeAssert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
        driver.close();
        driver.switchTo().window(Tabs.get(0));
        System.out.println(driver.getCurrentUrl());
        YoutubeAssert.assertAll();

    }
}
