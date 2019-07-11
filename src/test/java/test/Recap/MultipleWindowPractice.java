package test.Recap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import test.utilities.TestBase;

public class MultipleWindowPractice extends TestBase {

    @Test
    public void multipleWindows (){


        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://amazon.com','_blank');");

        // switch to ETSY
        // PRINT out .getcurrentURL --> etsy.com




    }

}
