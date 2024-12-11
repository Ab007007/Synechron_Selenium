package com.synechron.selenium.basics.waits;

import com.google.common.base.Function;
import com.synechron.selenium.basics.utils.ApplicationUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class WebDriverWaitDemo extends ApplicationUtils {

    @BeforeMethod
    public void prepare() {
        getDriver("edge");
    }

    @AfterMethod
    public void cleanUp() {
        close();
    }


    @Test
    public void webDriverWaitDemo() {

        launchApplication("file:///C:/Trainings/Synechron_02_12/Selenium_Training/html/tiimeout.html");
        click("tagname", "button");
        //Step-1 Create a wait object by passing max timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Step-2 use wait object to handle the State Change
        wait.until(ExpectedConditions.visibilityOf(getWebElement("id", "demo")));
        System.out.println(getText("id", "demo"));

    }


    @Test
    public void fluentWaitDemo() {
        launchApplication("file:///C:/Trainings/Synechron_02_12/Selenium_Training/html/tiimeout.html");
        click("tagname", "button");

        //Step-1 Create an object to Fluent Wait by passing 1. webelement 2. max timeout
        //3. polling time // excpetions to ignore during wait
        FluentWait<WebElement> wait = new FluentWait<WebElement>
                (getWebElement("id", "demo")).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(1000)).
                ignoring(NoSuchElementException.class).
                ignoring(Exception.class);


        //Step-2 Create an object to function interface and keep your own wait logic
        Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {
            public Boolean apply(WebElement element) {
                if (element.isDisplayed()) {
                    System.out.println("Element is displayed");
                    return true;
                } else {
                    System.out.println("Element is not displayed");
                    return false;
                }
            }
        };

        //step-3 use until method and pass fun object
        wait.until(fun);


    }

    @Test
    public void fluentwaitDemo2() {
        launchApplication("file:///C:/Trainings/Synechron_02_12/Selenium_Training/html/CounterText.html");

        FluentWait<WebElement> wait = new FluentWait<WebElement>
                (getWebElement("id", "counter")).
                withTimeout(Duration.ofSeconds(60)).
                pollingEvery(Duration.ofMillis(100)).
                ignoring(NoSuchElementException.class).
                ignoring(Exception.class);


        //Step-2 Create an object to function interface and keep your own wait logic
        Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {
            public Boolean apply(WebElement element) {
                if (element.getText().equals("25")) {
                    System.out.println("Element is displayed");
                    return true;
                } else {
                    System.out.println("Element is not displayed");
                    return false;
                }
            }
        };

        //step-3 use until method and pass fun object
        wait.until(fun);



    }

}
