package test.ProjectOrbitz;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class ProjectOrbitTestNG {

    Faker faker = new Faker();
    WebDriver driver;
    WebElement goingTo;
    WebElement checkIn;
    WebElement checkOutBox;
    WebElement checkOut;
    WebElement room;
    WebElement adults;
    WebElement children;
    WebElement childAge;

    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://orbitz.com");


    }

    @Test (priority = 1)

    public void hotelList()throws InterruptedException {

        driver.findElement(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']")).click();

        goingTo = driver.findElement(By.xpath("//input[@id='hotel-destination-hp-hotel']"));
        goingTo.sendKeys(faker.address().cityName());


        checkIn = driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']"));
        Thread.sleep(3000);
        checkIn.sendKeys("11/20/2019");

        checkOutBox = driver.findElement(By.id("hotel-checkout-hp-hotel"));
        checkOutBox.click();
        Thread.sleep(3000);

        checkOut = driver.findElement(By.xpath("//button[@data-day='30']"));
        checkOut.click();

        room = driver.findElement(By.xpath("//select[@name='rooms']"));
        Select roomDropDown = new Select(room);
        roomDropDown.selectByIndex(0);

        adults = driver.findElement(By.xpath("//select[@id='hotel-1-adults-hp-hotel']"));
        Select adultsDropDown = new Select(adults);
        adultsDropDown.selectByIndex(0);

        children = driver.findElement(By.xpath("//select[@id='hotel-1-children-hp-hotel']"));
        Select childrenDropDown = new Select(children);
        childrenDropDown.selectByIndex(1);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        childAge = driver.findElement(By.xpath("//select[@id='hotel-1-age-select-1-hp-hotel']"));
        Select childAgeDropDown = new Select(childAge);
        childAgeDropDown.selectByValue("6");

        driver.findElement(By.xpath("(//label[@class='col search-btn-col'])[2]")).click();


        String currentURL = driver.getCurrentUrl();

        if(currentURL.contains("Hotel-Search")){
            System.out.println("'Hotel Searching' verification PASSED!");

        } else{
            System.out.println("'Hotel Searching' verification FAILED!!!");
        }

    }

    @Test (priority = 2)
    public void hotelAndFlight() throws InterruptedException {


        driver.findElement(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']")).click();

        goingTo = driver.findElement(By.xpath("//input[@id='hotel-destination-hp-hotel']"));
        goingTo.sendKeys(faker.address().cityName());


        checkIn = driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']"));
        Thread.sleep(3000);
        checkIn.sendKeys("11/20/2019");

        checkOutBox = driver.findElement(By.id("hotel-checkout-hp-hotel"));
        checkOutBox.click();
        Thread.sleep(3000);

        checkOut = driver.findElement(By.xpath("//button[@data-day='30']"));
        checkOut.click();

        room = driver.findElement(By.xpath("//select[@name='rooms']"));
        Select roomDropDown = new Select(room);
        roomDropDown.selectByIndex(0);

        adults = driver.findElement(By.xpath("//select[@id='hotel-1-adults-hp-hotel']"));
        Select adultsDropDown = new Select(adults);
        adultsDropDown.selectByIndex(0);


        children = driver.findElement(By.xpath("//select[@id='hotel-1-children-hp-hotel']"));
        Select childrenDropDown = new Select(children);
        childrenDropDown.selectByIndex(1);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        childAge = driver.findElement(By.xpath("//select[@id='hotel-1-age-select-1-hp-hotel']"));
        Select childAgeDropDown = new Select(childAge);
        childAgeDropDown.selectByValue("6");

        driver.findElement(By.id("hotel-add-flight-checkbox-hp-hotel")).click();
        Thread.sleep(5000);



    }


}
