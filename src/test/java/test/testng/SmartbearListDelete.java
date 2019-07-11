package test.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


    /*
    TC	#7:	SmarbearLink	delete	all
    1.Open browser
    2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    3.Enter username: “Tester”
    4.Enter password: “test”
    5.Click to Login button
    6.Click to CheckAll
    7.Run a loop to make sure all the checkboxes are checked
    8.Click “Delete Selected”
    9.Assert “List of orders is empty. In order to add new order usethis link.“ text is displayed
     */


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Selenium.Smartbear;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartbearListDelete {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void deleteAll(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        Smartbear.loginToSmartbear(driver);

        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[1]"));

        for(WebElement checkbox : allCheckboxes){
            checkbox.click();
            //Assert.assertTrue(checkbox.isSelected());
        }

//        for(int i=0; i<allCheckboxes.size(); i++){
//            allCheckboxes.get(i).click();
//        }

        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

        WebElement message = driver.findElement(By.id("ctl00_MainContent_orderMessage"));

        Assert.assertTrue(message.isDisplayed(), "The message is not displayed.");



    }

}