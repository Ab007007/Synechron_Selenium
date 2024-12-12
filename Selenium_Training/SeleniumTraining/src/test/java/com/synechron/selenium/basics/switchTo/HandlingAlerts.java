package com.synechron.selenium.basics.switchTo;

import com.synechron.selenium.basics.utils.ApplicationUtils;
import com.synechron.selenium.basics.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HandlingAlerts {

    @Test
    public void handleAlertsDemo() throws InterruptedException {
        ApplicationUtils utils = new ApplicationUtils();
        WebDriver driver = null;
        driver = utils.getDriver();
        utils.launchApplication("https://formy-project.herokuapp.com/switch-window");
        utils.click("id","alert-button");
        String  textOnAlert = driver.switchTo().alert().getText();
        System.out.println("Text on Alert is : " + textOnAlert);
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);

    }
}
