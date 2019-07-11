package test.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cybertekschool.com./dropdown");

        WebElement month = driver.findElement(By.id("month"));
        Select monthDropdown = new Select(month);

        String s = monthDropdown.getFirstSelectedOption().getText();
        System.out.println(s);
        monthDropdown.selectByIndex(1);
        Thread.sleep(3000);   //3 seconds PAUSE
        monthDropdown.selectByValue("8");
        Thread.sleep(3000);
        monthDropdown.selectByVisibleText("December");

        List<WebElement> monthList = monthDropdown.getOptions();
        for( WebElement m: monthList){
            System.out.println(m.getText());
        }

        //driver.quit();
    }
}
