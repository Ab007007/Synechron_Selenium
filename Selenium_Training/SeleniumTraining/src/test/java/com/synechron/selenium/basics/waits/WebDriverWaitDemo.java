package com.synechron.selenium.basics.waits;

import com.synechron.selenium.basics.utils.ApplicationUtils;
import com.synechron.selenium.basics.utils.DriverUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverWaitDemo extends ApplicationUtils
{

    @Test
    public void webDriverWaitDemo() {
        getDriver("edge");
        launchApplication("file:///C:/Trainings/Synechron_02_12/Selenium_Training/html/tiimeout.html");
        click("tagname","button");
        //Step-1 Create a wait object by passing max timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Step-2 use wait object to handle the State Change
        wait.until(ExpectedConditions.visibilityOf(getWebElement("id","demo")));

        System.out.println(getText("id","demo"));

    }
}
