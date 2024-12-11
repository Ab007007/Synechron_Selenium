package com.synechron.selenium.basics.utils;

import org.openqa.selenium.WebElement;

import java.util.List;

public class ApplicationUtils extends DriverUtils
{
    public void launchApplication(String url)
    {
        System.out.println("Lanuching Application " + url);
        driver.get(url);
    }


    public void printItemsFromFK() {
        List<WebElement> items = getWebElements("xpath", "//div[@class='_1UgUYI _2eN8ye']//a");
        for (WebElement item : items) {
            System.out.println(item.getText());
        }
    }



}
