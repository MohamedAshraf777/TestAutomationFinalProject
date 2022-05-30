package step_definitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {
   public static WebDriver driver;
   //Waiting Method
    public static void waiting() {
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
    }

    @Before
    public void open_browser() {

        /*String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver",chromePath);*/

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }




    @After
    public void quit_browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
