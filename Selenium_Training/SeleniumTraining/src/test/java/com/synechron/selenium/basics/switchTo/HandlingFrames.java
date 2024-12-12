package com.synechron.selenium.basics.switchTo;

import com.synechron.selenium.basics.utils.ApplicationUtils;
import com.synechron.selenium.basics.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingFrames extends ApplicationUtils
{


    @Test
    public void dragAndDropDemo() throws InterruptedException {

        getDriver(ConfigReader.getConfigValue("browser"));
        launchApplication(ConfigReader.getConfigValue("jurl") + "droppable/");
        driver.switchTo().frame(getWebElement("xpath","//iframe[@class='demo-frame']"));
        WebElement sourceElement = getWebElement("id", "draggable");
        WebElement destElement = getWebElement("id", "droppable");

        System.out.println("Before drag and drop");
        System.out.println("Source TExt " + sourceElement.getText());
        System.out.println("Dest TExt " + destElement.getText());

        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, destElement).perform();

        System.out.println("Before drag and drop AFTER ");
        System.out.println("Source TExt " + sourceElement.getText());
        System.out.println("Dest TExt " + destElement.getText());

        driver.switchTo().defaultContent();
        click("linktext","Draggable");
        Thread.sleep(2000);

    }

}
