package com.synechron.selenium.basics.elements;

import com.synechron.selenium.basics.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class PrintSearchResults extends DriverUtils {

    @Test
    public void printSearchResults() {
        driver = getDriver("edge");
        driver.get("https://www.google.com/");
        type("name","q","Synechron");
        click("xpath","//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
        List<WebElement> headings = driver.findElements(By.xpath("h3"));
        for (WebElement heading : headings) {
            System.out.println(heading.getText());

        }

    }
}