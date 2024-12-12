package com.synechron.selenium.basics.switchTo;

import com.synechron.selenium.basics.utils.ApplicationUtils;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandlingMultiBrowser extends ApplicationUtils
{

    //https://www.irctc.co.in/eticketing/errors.html#

    @Test
    public void validateMultipleBrowsers() throws InterruptedException {
        getDriver("firefox");
        launchApplication("https://www.irctc.co.in/eticketing/errors.html#");
        System.out.println(driver.getWindowHandle());

        click("linktext","Contact Us");
        Thread.sleep(3000);
        Set<String> windowIDs = driver.getWindowHandles();
        Iterator<String> iterator = windowIDs.iterator();
        String parentID = iterator.next();
        String childID = iterator.next();
        driver.switchTo().window(childID);
        List<WebElement> links = getWebElements("tagname", "a");
        System.out.println("Printing Hyper links of Child Browser");
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
        driver.close();
        Thread.sleep(3000);
        driver.switchTo().window(parentID);

        System.out.println("Printing Hyper links of Parent Browser");
        List<WebElement> parentLinks = getWebElements("tagname", "a");

        for (WebElement link : parentLinks) {
            System.out.println(link.getText());
        }

    }



}
