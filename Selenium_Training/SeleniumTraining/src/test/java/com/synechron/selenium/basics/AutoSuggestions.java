package com.synechron.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutoSuggestions {

    @Test
    public void testAutoSuggestions() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.google.com");
        //driver.findElement(By.name("q")).sendKeys("selenium");
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys("Selenium");
        //  Thread.sleep(3000);
        List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));

        System.out.println("Total Number of Suggestions: " + autoSuggestions.size());
        WebElement ele = null;
        for (int i = 0; i < autoSuggestions.size(); i++) {
            System.out.println(autoSuggestions.get(i).getText());
        }

        driver.close();
    }
}
