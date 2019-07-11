package test.Selenium;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenTest {

    public static void main(String[] args) {

        System.out.println("Hello, Maven!");

        ///WE DONT NEED TO SET THE PROPERTIES NO MORE

        WebDriverManager.chromedriver().setup();

        Faker faker = new Faker ();
        System.out.println(faker.name().name());
        System.out.println(faker.phoneNumber());
        System.out.println();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.findElement(By.name("q"))
                .sendKeys(faker.name().name() + Keys.ENTER);
    }


}
