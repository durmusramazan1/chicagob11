package test.ProjectAliBaba;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RecentSearches {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.alibaba.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        String searchedItem = "teddy bear";
        driver.findElement(By.xpath("(//input[@class='ui-searchbar-keyword'])[1]")).sendKeys(searchedItem + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.alibaba.com");
        //driver.findElement(By.xpath("//a[@href='//www.alibaba.com/']")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//input[@class='ui-searchbar-keyword'])[1]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement itemHistory = driver.findElement(By.xpath("//a[@data-keyword='teddy_bear']"));

        if(itemHistory.getText().contains(searchedItem)){
            System.out.println("==========================================");
            System.out.println("'Searched Item History' verification PASSED!");
            System.out.println("==========================================");
        } else {
            System.out.println("============================================");
            System.out.println("'Searched Item History' verification FAILED!!!");
            System.out.println("============================================");
        }

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);







    }
}
