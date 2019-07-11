package test.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OpenXcell {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("https://www.openxcell.com/");

        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println(links.size());
        System.out.println("============================");


        int counter = 0;
        for (WebElement link: links){
            //System.out.println(link.getText());

            if(link.getText().isEmpty()){
             counter++;

            }
        }

        System.out.println("Count: " + counter);



    }
}
