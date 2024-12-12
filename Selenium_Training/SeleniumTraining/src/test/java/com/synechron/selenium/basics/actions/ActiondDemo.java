package com.synechron.selenium.basics.actions;

import com.synechron.selenium.basics.utils.ApplicationUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

//setTimeout(function() {debugger;},6000)
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
        printItemsFromFK();

        actions.moveToElement(electronics).perform();
        Thread.sleep(3000);
        printItemsFromFK();

        actions.moveToElement(home).perform();
        Thread.sleep(3000);
        printItemsFromFK();

        actions.moveToElement(toys).perform();
        Thread.sleep(3000);
        printItemsFromFK();

    }

    @Test
    public void dragAndDropDemo() throws InterruptedException {
        launchApplication("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement sourceElement = getWebElement("id","draggable");
        WebElement destElement = getWebElement("id","droppable");

        System.out.println("Before drag and drop");
        System.out.println("Source TExt " + sourceElement.getText());
        System.out.println("Dest TExt " + destElement.getText());

        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, destElement).perform();

        System.out.println("Before drag and drop AFTER ");
        System.out.println("Source TExt " + sourceElement.getText());
        System.out.println("Dest TExt " + destElement.getText());

    }





    @Test
    public void miscDemo() throws InterruptedException {

        launchApplication("https://www.flipkart.com/");
        driver.switchTo().frame(0);
        WebElement sourceElement = getWebElement("id","misc");
        WebElement destElement = getWebElement("id","misc");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ALT).sendKeys(Keys.CONTROL).sendKeys(Keys.ARROW_LEFT).build().perform();
    }



    @Test
    public void dragAndDrop() throws InterruptedException {
        launchApplication("https://jqueryui.com/draggable/");
        driver.switchTo().frame(0);
        WebElement sourceElement = getWebElement("id","draggable");
        Actions actions = new Actions(driver);
        actions.clickAndHold(sourceElement).perform();
        actions.moveByOffset(sourceElement.getLocation().getX()+50, sourceElement.getLocation().getY()+100);
       // actions.moveToLocation(sourceElement.getLocation().getX(), sourceElement.getLocation().getY() + 100).perform();
        actions.release(sourceElement).perform();
        Thread.sleep(10000);
    }
}
