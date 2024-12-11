package com.synechron.selenium.basics.actions;

import com.synechron.selenium.basics.utils.ApplicationUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiondDemo extends ApplicationUtils {

    @BeforeMethod
    public void setUp() {
        getDriver();
    }

    @AfterMethod
    public void tearDown() {
        close();
    }

    @Test
    public void mouseMovementDemo() throws InterruptedException {
        launchApplication("https://www.flipkart.com/");
        WebElement  fashion = getWebElement("xpath","//div[@aria-label='Fashion']");
        WebElement  electronics = getWebElement("xpath","//div[@aria-label='Electronics']");
        WebElement  home = getWebElement("xpath","//div[@aria-label='Home & Furniture']");
        WebElement  toys = getWebElement("xpath","//div[@aria-label='Beauty, Toys & More']");

        Actions actions = new Actions(driver);
        actions.moveToElement(fashion).perform();
        Thread.sleep(3000);
        actions.moveToElement(electronics).perform();
        Thread.sleep(3000);
        actions.moveToElement(home).perform();
        Thread.sleep(3000);
        actions.moveToElement(toys).perform();
        Thread.sleep(3000);







    }


}
