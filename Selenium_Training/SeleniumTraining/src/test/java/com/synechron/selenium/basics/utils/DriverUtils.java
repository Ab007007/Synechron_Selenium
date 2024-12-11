package com.synechron.selenium.basics.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

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

    public List<WebElement> getWebElements(String locator, String value ) {
        System.out.println("Finding Element: " + locator + " with value: " + value);
        List<WebElement> elements = null;
        switch (locator.toLowerCase()) {
            case "id":
                elements = driver.findElements(By.id(value));
                break;
            case "name":
                elements = driver.findElements(By.name(value));
                break;
            case "classname":
                elements = driver.findElements(By.className(value));
                break;
            case "xpath":
                elements = driver.findElements(By.xpath(value));
                break;
            case "linktext":
                elements = driver.findElements(By.linkText(value));
                break;
            case "cssselector":
                elements = driver.findElements(By.cssSelector(value));
                break;
            case "tagname":
                elements = driver.findElements(By.tagName(value));
                break;
            case "partiallinktext":
                elements = driver.findElements(By.partialLinkText(value));
                break;
            default:
                System.out.println("you have entered wrong locator" + locator);
                break;
        }

        return elements;
    }

    public WebElement getWebElement(String locator,String value ) {
        System.out.println("Finding Element: " + locator + " with value: " + value);
        WebElement element = null;
        switch (locator.toLowerCase()) {
            case "id":
                element = driver.findElement(By.id(value));
                break;
            case "name":
                element = driver.findElement(By.name(value));
                break;
            case "classname":
                element = driver.findElement(By.className(value));
                break;
            case "xpath":
                element = driver.findElement(By.xpath(value));
                break;
            case "linktext":
                element = driver.findElement(By.linkText(value));
                break;
            case "cssselector":
                element = driver.findElement(By.cssSelector(value));
                break;
            case "tagname":
                element = driver.findElement(By.tagName(value));
                break;
            case "partiallinktext":
                element = driver.findElement(By.partialLinkText(value));
                break;
            default:
                System.out.println("you have entered wrong locator" + locator);
                break;
        }

        return element;
    }



    public void type(String locator, String value, String text) {
        System.out.println("Entering type on WebElement using locator: " + locator + " with value: " + value + " and text: " + text);
        WebElement element = getWebElement(locator, value);
        element.clear();
        element.sendKeys(text);
    }

    public void click(String locator, String value) {
        System.out.println("Performing Click on WebElement using locator: " + locator + " with value: " + value);
        WebElement element = getWebElement(locator, value);
        element.click();
    }

    public String getText(String locator, String value) {
        System.out.println("Getting Text on WebElement using locator: " + locator + " with value: " + value);
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


    public void selectCheckbox(String locator, String value) {
        System.out.println("Selecting checkbox using locator: " + locator + " with value: " + value);
        WebElement element = getWebElement(locator, value);
        if(!element.isSelected()) {
            element.click();
        }
        else {
            System.out.println("Element is already selected");
        }
    }

    public void selectDropdown(String locator, String value,String type,String typeValue) {
        System.out.println("Selecting dropdown using locator: " + locator + " with value: " + value);
        Select select = new Select(getWebElement(locator, value));
        switch (type) {
            case "index" :
                select.selectByIndex(Integer.parseInt(typeValue));
                break;
            case "value" :
                select.selectByValue(typeValue);
                break;
            case "visibletext" :
                select.selectByVisibleText(typeValue);
                break;
            default:
                System.out.println("You have entered wrong locator" + locator);
                break;

        }


    }
}
