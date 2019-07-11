package test.Selenium;

/*
TC#2: SmarbearLink software order placing
1.Open	browser
2.Go	to	website:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3.Enter username: “Tester”
4.Enter password: “test”
5.Click on Login button
6.Click on Order
7.Select familyAlbum from product,set quantity to 2
8.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
9.Click on “visa” radio button
10.Generate card number using JavaFaker
11.Click on “Process”
12.Verify success message “New order has been successfully added
 */

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Smartbear2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        Smartbear.loginToSmartbear(driver);

        WebElement orderLink = driver.findElement(By.linkText("Order"));
        orderLink.click();

        //locate the select dropdown webelement
        WebElement productDropdown = driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));

        //create an object of select class and pass the dropdown webelement located
        Select selectObj = new Select(productDropdown);

        //7. Select familyAlbum from product, set quantity to 2

        selectObj.selectByVisibleText("FamilyAlbum");

        WebElement inputQuantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        inputQuantity.sendKeys("2");

        //8. Fill address Info with JavaFaker
        WebElement inputName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));

        Faker faker = new Faker();

        inputName.sendKeys(faker.name().fullName());

        //• Generate: name, street, city, state, zip code

        //street
        WebElement inputStreet = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        inputStreet.sendKeys(faker.address().streetName());
        //city
        WebElement inputCity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        inputCity.sendKeys(faker.address().cityName());
        //zip code
        WebElement inputZipCode = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        inputZipCode.sendKeys(faker.address().zipCode().replace("-",""));


        //9. Click on “visa” radio button

        WebElement visaRadioButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaRadioButton.click();

        //10. Generate card number using JavaFaker

        WebElement inputCard = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        inputCard.sendKeys(faker.finance().creditCard().replace("-",""));
        //add date
        WebElement inputDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        inputDate.sendKeys("10/19");

        //11. Click on “Process”

        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();

        //12. Verify success message “New order has been successfully added.”

        WebElement successMessage = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
        String successMessageText = successMessage.getText();

        if(successMessageText.equals("New order has been successfully added.")){
            System.out.println("Success Message Verification Passed!");
        }else{
            System.out.println("Success Message Verification FAILED!!!");

        }
    }
}



