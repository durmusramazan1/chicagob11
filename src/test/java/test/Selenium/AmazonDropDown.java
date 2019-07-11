package test.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonDropDown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");


         /*
        TC-1: Amazon departments dropdown default value
        1.Go to amazon.com
        2.Verify default value for departments dropdown in searchbox
        Expected: All Departments
         */

        WebElement searchDropdownBox = driver.findElement(By.id("searchDropdownBox"));
        Select searchDropdown = new Select(searchDropdownBox);
        String s = searchDropdown.getFirstSelectedOption().getText();


        if (s.equals("All Departments")){
            System.out.println("#Amazon departments dropdown default value is 'All Deparments'. Verification is PASSED!");
        } else {
            System.out.println("#Amazon departments dropdown default value is NOT 'All Deparments'. Verificatoon is FAILED!");
        }

        /*
        TC-2: Amazon departments dropdown all options
        1.Go to amazon.com
        2.Verify number of options in departments dropdown
        Expected: 51
         */

        List<WebElement> optionList = searchDropdown.getOptions();

        int options= 0;
        for( WebElement option: optionList){
           option.getText();
            options++;
        }
        System.out.println();
        System.out.println("#Total options number: " + options);


        /*
        TC-3: Amazon departments dropdown option values
        1.Go to amazon.com
        2.Verify each options in department dropdown has at least1 character.
        Note: non of the option should be empty
         */










        /*
        TC-4: Amazon departments dropdown option selection
        1.Go to amazon.com
        2.Select Courses from departments dropdown
        3.Verify option Courses is selected
         */








        /*
        Task:Create void method verifyDepartmentDropdown.
        This method should accept WebDriver object and String(option).
        Method will select given option and verifies if it’s selected.
         */









        driver.quit();
    }
}
