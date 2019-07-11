package test.Selenium;

/*
TC#3: SmarbearLink software order verification
1. Open browser and login to SmarbearLink software
2. Click on View all orders
3. Verify Susan McLaren has order on date “01/05/2010”
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Smartbear3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Smartbear.loginToSmartbear(driver);

        WebElement date = driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[5]"));

        String dateText = date.getText();

        if(dateText.equals("01/05/2010")){
            System.out.println("Susan date verification PASSED!");
        }else{
            System.out.println("Susan date verification FAILED!!!");
        }



    }
}

