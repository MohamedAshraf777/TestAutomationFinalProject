package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;

public class homePage {



    WebDriver driver;


    public homePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Handel Slider 1 , 2
    public WebElement sliderNumber(String Num){
        //WebElement element= driver.findElement(By.xpath("(//div[@id=\"nivo-slider\"]//a[@href=\"http://demo.nopcommerce.com/\"])["+Num+"]"));
        WebElement element= driver.findElement(By.xpath("//div[@class=\"nivo-controlNav\"]//a[@rel=\""+Num+"\"]"));
        return element;
    }




    //F01_Reg
    @FindBy(className = "ico-register")
    public WebElement registerLink;

    //F02_Login
    @FindBy(className = "ico-login")
    public WebElement loginLink;

    @FindBy(className = "ico-account")
    public WebElement myAccountLink;

    //F03_SwitchCurrencies
    @FindBy(id = "customerCurrency")
    public WebElement userCurrency;

    @FindBy(xpath = "//div[@class=\"prices\"] //span")
    public WebElement productPriceCurrency;

    //F04_Search by name and Serial
    @FindBy(id = "small-searchterms")
    public WebElement searchBox;

    @FindBy(css = "button[type=\"submit\"]")
    public WebElement searchButton;

    @FindBy(id = "q")
    public WebElement searchText;

    //Hover Category and select Sub
    @FindBy(xpath = "//div [@class=\"header-menu\"]  //ul[@class]")
    public WebElement headerMenu;

    //Computer List and Items
    @FindBy(css = ("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"))
    public WebElement computersList;

    @FindBy(xpath = "//a[@href=\"/desktops\"]")
    public WebElement desktopsItems;

    @FindBy(xpath = "//a[@href=\"/notebooks\"]")
    public WebElement notebooksItems;

    @FindBy(xpath = "//a[@href=\"/software\"]")
    public WebElement softwareItems;

    //Electronics List and Items
    @FindBy(xpath = "//a[@href=\"/electronics\"]")
    public WebElement electronicsList;

    @FindBy(xpath = "//a[@href=\"/camera-photo\"]")
    public WebElement cameraItems;

    @FindBy(xpath = "//a[@href=\"/cell-phones\"]")
    public WebElement phonesItems;

    @FindBy(xpath = "//a[@href=\"/others\"]")
    public WebElement otherItems;

    @FindBy(linkText = "Facebook")
    public WebElement facebook;

    @FindBy(linkText = "Twitter")
    public WebElement twitter;

    @FindBy(linkText = "RSS")
    public WebElement rss;

    @FindBy(linkText = "YouTube")
    public WebElement youtube;

    @FindBy(xpath = "//div[@class=\"item-box\"][2]//div[@class=\"product-item\"]//div[@class=\"picture\"]")
    public WebElement macbookPicture;

    @FindBy(xpath = "//div[@id=\"bar-notification\"]//div")
    public WebElement successNotification;

    @FindBy(xpath = "//div[@id=\"bar-notification\"]//p")
    public WebElement successNotificationContent;
}
