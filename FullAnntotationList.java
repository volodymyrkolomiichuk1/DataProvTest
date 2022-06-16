package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class FullAnntotationList {

    @BeforeClass
    public void BeforeClass() {
        System.out.println("Before class");
    }

    @BeforeGroups
    public void BeforeGroups(){
        System.out.println("Before groups");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before suite");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before test");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before method");
    }

    @Test
    public void Test(){
        System.out.println("test");
    }

    @Test(dependsOnMethods = {"Test"})
    public void testWithDepends(){
        System.out.println("test with depends");
    }
    @Test(priority = 2)
    public void testWithPriorityHigh(){
        System.out.println("test with priority high");
    }

    @Test(priority = 16)
    public void testWithPriorityLow(){
        System.out.println("test with priority low");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("after groups");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }


}
