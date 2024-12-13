package com.synechron.selenium.basics.pom.test;

import com.synechron.selenium.basics.pom.page.FormPage;
import com.synechron.selenium.basics.utils.ConfigReader;
import com.synechron.selenium.basics.utils.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormyTest extends DriverUtils {

    FormPage formPage = null;
    @BeforeMethod
    public void setUp() {
        driver = getDriver(ConfigReader.getConfigValue("browser"));

        formPage = new FormPage(driver);
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
    @Test
    public void enterFormData()
    {
        driver.get(ConfigReader.getConfigValue("formyurl") + "form");
        formPage.enterFirstName("Aravinda H");
        formPage.enterLastName("Harry Hacker");
        formPage.enterJobTitle("Trainer");
        formPage.clickMaleCheckbox();
        formPage.clickGradeSchool();
        formPage.clickSubmitButton();
        formPage.validateSuccessMessage();


    }
}
