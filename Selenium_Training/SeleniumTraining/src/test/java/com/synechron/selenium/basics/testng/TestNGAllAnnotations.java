package com.synechron.selenium.basics.testng;

import org.testng.annotations.*;

public class TestNGAllAnnotations {



    @DataProvider
    public Object[][] dpMethod() {

        return new Object[][]
        {
                new Object[]{"abc",123},
                new Object[]{"abc",123},
                new Object[]{"abc",123},
                new Object[]{"abc",123},
                new Object[]{"abc",123},
                new Object[]{"abc",123},
                new Object[]{"abc",123},
                new Object[]{"abc",123},
        };
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");

    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");

    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");

    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");


    }

    @BeforeMethod
    public void beforeMethod() {
         System.out.println("Before Method");

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(dataProvider = "dpMethod")
    public void test2(String name, int value) {
        System.out.println("Test 2" + name + " : "  + value);
    }


}
