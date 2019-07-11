package test.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGFirstTest {

    @BeforeClass
    public void setUp(){

        System.out.println("Before class running");

    }

    @AfterClass
    public void tearDown(){
        System.out.println("After class running");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod running");
    }

    @Test
    public void onPurposeFail (){
        Assert.fail("this is on purpose failing");
    }





    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod running");
    }

    @Test
    public void firstTest(){
        System.out.println("This is the first test running");

        Assert.assertEquals("a", "a", "first test a b is failed");
    }

    @Test
    public void secondTest(){
        System.out.println("This is the second test running");
    }

    @Test
    public void titleTest(){
        String actualTitle = "Google - Apples";
        String expectedTitleContains = "apples";

        Assert.assertTrue(actualTitle.contains(expectedTitleContains), "actual title does not contain expected value");
    }
}
