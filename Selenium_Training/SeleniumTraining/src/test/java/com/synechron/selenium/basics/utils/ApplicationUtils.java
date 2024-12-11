package com.synechron.selenium.basics.utils;

public class ApplicationUtils extends DriverUtils
{
    public void launchApplication(String url)
    {
        System.out.println("Lanuching Application " + url);
        driver.get(url);
    }
}
