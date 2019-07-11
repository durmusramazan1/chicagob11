package test.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VerifyNames {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        Smartbear.loginToSmartbear(driver);
        Smartbear.verifyNames(driver, "Paul");

        Smartbear.printNamesAndCities(driver);

    }
}
