package com.synechron.selenium.basics.dropdown;

import com.synechron.selenium.basics.utils.ApplicationUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class NonSelectTagDemo extends ApplicationUtils {

    @Test
    public void dropDowntest() {
        getDriver();
        launchApplication("https://formy-project.herokuapp.com/dropdown");
        click("id","dropdownMenuButton");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(getWebElement("xpath","//div[@class='dropdown-menu show']/a[text()='File Upload']")));

        click("xpath","//div[@class='dropdown-menu show']/a[text()='File Upload']");
    }


    @Test
    public void dropDownUsingSelect() throws InterruptedException {
        getDriver();
        launchApplication("http://formy-project.herokuapp.com/form");
        type("id","first-name","Aravinda");
        type("id","last-name","H");
        type("id","job-title","Trainer");

        click("id","radio-button-3");
        selectCheckbox("id","checkbox-1");

        selectDropdown("id","select-menu","index","3");
        selectDropdown("id","select-menu","value","1");
        selectDropdown("id","select-menu","visibletext","10+");
//        Select select = new Select(getWebElement("id","select-menu"));
//
//        select.selectByValue("1");
//        Thread.sleep(2000);
//        select.selectByIndex(3);
//        Thread.sleep(2000);
//        select.selectByVisibleText("10+");

        Thread.sleep(2000);
        click("linktext","Submit");
        System.out.println(getText("xpath","//*[@class='alert alert-success']"));

    }
}
