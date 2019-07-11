package test.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTestNG {

    @Test
    public void login(){
        System.out.println("logging in...");
        Assert.fail("On purpose fail");
    }

    @Test
    public void makePurchase(){
        System.out.println("making purchase...");
    }

    @Test
    public void homePage(){
        System.out.println("homePage tested");
    }
}
