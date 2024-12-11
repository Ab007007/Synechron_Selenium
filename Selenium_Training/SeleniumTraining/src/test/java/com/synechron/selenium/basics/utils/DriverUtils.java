package com.synechron.selenium.basics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class DriverUtils {
    public WebDriver driver = null;

    public WebDriver getDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }

    public WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "edge" :
                driver = new EdgeDriver();
                break;
                default:
                    driver = new ChromeDriver();
                    break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }

    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebElement getWebElement(String locator,String value ) {
        System.out.println("Finding Element: " + locator + " with value: " + value);
        WebElement element = null;
        switch (locator) {
            case "id":
                element = driver.findElement(By.id(value));
                break;
            case "name":
                element = driver.findElement(By.name(value));
                break;
            case "class":
                element = driver.findElement(By.className(value));
                break;
            case "xpath":
                element = driver.findElement(By.xpath(value));
                break;
            case "linkText":
                element = driver.findElement(By.linkText(value));
                break;
            case "cssSelector":
                element = driver.findElement(By.cssSelector(value));
                break;
            case "tagName":
                element = driver.findElement(By.tagName(value));
                break;
            case "partialLinkText":
                element = driver.findElement(By.partialLinkText(value));
                break;
            default:
                System.out.println("you have entered wrong locator" + locator);
                break;
        }

        return element;
    }

    public void type(String locator, String value, String text) {
        WebElement element = getWebElement(locator, value);
        element.clear();
        element.sendKeys(text);
    }

    public void click(String locator, String value) {
        WebElement element = getWebElement(locator, value);
        element.click();
    }

    public String getText(String locator, String value) {
        WebElement element = getWebElement(locator, value);
        String text = element.getText();
        return text;
    }
    public String getAttributeValue(String locator, String value, String attribute) {
        WebElement element = getWebElement(locator, value);
        String attrValue =  element.getDomAttribute(attribute);
        System.out.println("Attribute Value : " + attrValue);
        return attrValue;





    }
}
