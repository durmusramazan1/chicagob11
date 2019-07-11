//package test.ProjectOrbitz;
//
//import com.github.javafaker.Faker;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class ProjectOrbitz2 {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        Faker faker = new Faker();
//        WebDriver driver;
//        WebElement goingTo;
//        WebElement checkIn;
//        WebElement checkOut;
//        WebElement room;
//        WebElement adults;
//        WebElement children;
//        WebElement childAge;
//
//
//
////        @BeforeMethod
////        public void setUp() {
////            WebDriverManager.chromedriver().setup();
////            driver = new ChromeDriver();
////            driver.manage().window().maximize();
////            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////            driver.get("http://orbitz.com");
////        }
//
//
//
//        // HOTEL SEARCH FUNCTIONALITY SCENARIO #1 //
//
//
//
//       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//       // driver.findElement(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']")).click();
//
//        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        goingTo = driver.findElement(By.xpath("//input[@id='hotel-destination-hp-hotel']"));
//        goingTo.sendKeys(faker.address().cityName());
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        checkIn = driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']"));
//        checkIn.sendKeys("11/20/2019");
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        checkOut = driver.findElement(By.xpath("//input[@id='hotel-checkout-hp-hotel']"));
//        checkOut.sendKeys("11/10/2020");
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        room = driver.findElement(By.xpath("//select[@name='rooms']"));
//        Select roomDropDown = new Select(room);
//        roomDropDown.selectByIndex(0);
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        adults = driver.findElement(By.xpath("//select[@id='hotel-1-adults-hp-hotel']"));
//        Select adultsDropDown = new Select(adults);
//        adultsDropDown.selectByIndex(0);
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        children = driver.findElement(By.xpath("//select[@id='hotel-1-children-hp-hotel']"));
//        Select childrenDropDown = new Select(children);
//        childrenDropDown.selectByIndex(1);
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        childAge = driver.findElement(By.xpath("//select[@id='hotel-1-age-select-1-hp-hotel']"));
//        Select childAgeDropDown = new Select(childAge);
//        childAgeDropDown.selectByValue("6");
//
//        driver.findElement(By.xpath("(//label[@class='col search-btn-col'])[2]")).click();
//
//
//        String currentURL = driver.getCurrentUrl();
//        if(currentURL.contains("Hotel-Search")){
//            System.out.println("'Hotel Searching' verification PASSED!");
//
//        } else{
//            System.out.println("'Hotel Searching' verification FAILED!!!");
//        }
//
//
//
//
//
//
//        // HOTEL SEARCH FUNCTIONALITY SCENARIO #2 //
//
////        WebDriverManager.chromedriver().setup();
////        WebDriver driver = new ChromeDriver();
////        driver.manage().window().fullscreen();
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////        driver.get("https://orbitz.com");
////
////
////
////        driver.findElement(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']")).click();
////
////
////        WebElement goingTo = driver.findElement(By.xpath("//input[@id='hotel-destination-hp-hotel']"));
////        goingTo.sendKeys("New York, NY");
////
////
////        WebElement checkIn = driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']"));
////        checkIn.sendKeys("11/20/2019");
////
////
////        WebElement checkOut = driver.findElement(By.xpath("//input[@id='hotel-checkout-hp-hotel']"));
////        checkOut.sendKeys("11/27/2019");
////
////
////        WebElement room = driver.findElement(By.xpath("//select[@name='rooms']"));
////        Select roomDropDown1 = new Select(room);
////        roomDropDown1.selectByIndex(0);
////
////
////        WebElement adults = driver.findElement(By.xpath("//select[@id='hotel-1-adults-hp-hotel']"));
////        Select adultsDropDown1 = new Select(adults);
////        adultsDropDown1.selectByIndex(0);
////
////
////       WebElement children = driver.findElement(By.xpath("//select[@id='hotel-1-children-hp-hotel']"));
////        Select childrenDropDown1 = new Select(children);
////        childrenDropDown1.selectByIndex(1);
////
////
////        WebElement childAge = driver.findElement(By.xpath("//select[@id='hotel-1-age-select-1-hp-hotel']"));
////        Select childAgeDropDown1 = new Select(childAge);
////        childAgeDropDown1.selectByValue("6");
////
////
////        driver.findElement(By.xpath("//input[@id='hotel-add-flight-checkbox-hp-hotel']")).click();
////        WebElement flightSearchBox = driver.findElement(By.xpath("//input[@id='hotel-flight-origin-hp-hotel']"));
////        flightSearchBox.sendKeys("Chicago" + Keys.ENTER);
////
////
////
////        driver.findElement(By.xpath("(//label[@class='col search-btn-col'])[2]")).click();
////
////        WebElement flightText = driver.findElement(By.xpath("//*[text()='Choose your flight']"));
////        String fligtTextCheck = flightText.getText();
////
////        if(fligtTextCheck.contains("Choose your flight")){
////            System.out.println("'Hotel + Flight' verification PASSED!");
////        } else {
////            System.out.println("'Hotel + Flight' verification FAILED!!!");
////        }
////
////
//
//
//
//
//        // HOTEL SEARCH FUNCTIONALITY SCENARIO #3 //
//
//
//
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.manage().window().fullscreen();
////        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////        driver.get("https://orbitz.com");
////
////        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
////        driver.findElement(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']")).click();
////
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        checkIn = driver.findElement(By.xpath("//input[@id='hotel-checkin-hp-hotel']"));
////        checkIn.sendKeys("11/20/2019");
////
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        checkOut = driver.findElement(By.xpath("//input[@id='hotel-checkout-hp-hotel']"));
////        checkOut.sendKeys("11/10/2020");
////
////        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
////        room = driver.findElement(By.xpath("//select[@name='rooms']"));
////        Select roomDropDown2 = new Select(room);
////        roomDropDown2.selectByIndex(0);
////
////        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
////        adults = driver.findElement(By.xpath("//select[@id='hotel-1-adults-hp-hotel']"));
////        Select adultsDropDown2 = new Select(adults);
////        adultsDropDown2.selectByIndex(0);
////
////        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
////        children = driver.findElement(By.xpath("//select[@id='hotel-1-children-hp-hotel']"));
////        Select childrenDropDown2 = new Select(children);
////        childrenDropDown2.selectByIndex(1);
////
////        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
////        childAge = driver.findElement(By.xpath("//select[@id='hotel-1-age-select-1-hp-hotel']"));
////        Select childAgeDropDown2 = new Select(childAge);
////        childAgeDropDown2.selectByValue("6");
////
////        driver.findElement(By.xpath("(//label[@class='col search-btn-col'])[2]")).click();
////
////        WebElement errorLocater = driver.findElement(By.xpath("//h5[@class='alert-title no-outline']"));
////        String errorMessage = errorLocater.getText();
////
////        if (errorMessage.contains("Please correct the errors below.")){
////            System.out.println("'Error Message' verification PASSED!");
////        } else {
////            System.out.println("'Error Message' verification FAILED!!!");
////        }
////
//
//
//    }
//}
