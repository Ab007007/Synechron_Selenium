package com.synechron.selenium.basics.js;

import com.synechron.selenium.basics.utils.ApplicationUtils;
import com.synechron.selenium.basics.utils.ConfigReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptDemo extends ApplicationUtils {

    @Test
    public void scrollUsingJS() {
        driver = getDriver(ConfigReader.getConfigValue("browser"));
        launchApplication(ConfigReader.getConfigValue("formyurl") + "scroll");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }



    @Test
    public void scrollToElementUsingJS() {
        driver = getDriver(ConfigReader.getConfigValue("browser"));
        launchApplication(ConfigReader.getConfigValue("formyurl") + "scroll");

        WebElement ele  = getWebElement("id","name");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",ele);
    }
}
