package com.synechron.selenium.basics.pom.test;

import com.synechron.selenium.basics.pom.data.TestData;
import com.synechron.selenium.basics.pom.page.FormPage;
import com.synechron.selenium.basics.utils.ConfigReader;
import com.synechron.selenium.basics.utils.DriverUtils;
import org.testng.annotations.*;

public class FormyTest extends DriverUtils {

    FormPage formPage = null;

    @BeforeClass
    public void createDriver() {
        driver = getDriver(ConfigReader.getConfigValue("browser"));

        formPage = new FormPage(driver);

    }
    @BeforeMethod
    public void setUp() {
        driver.get(ConfigReader.getConfigValue("formyurl") + "form");

    }

    @AfterMethod
    public void cleanup()
    {
        System.out.println("Test Exectuion complete");
    }
    @AfterClass
    public void tearDown() {

        driver.quit();
    }
    @Test(dataProvider = "formdata", dataProviderClass = TestData.class)
    public void enterFormData(String fn, String ln,String jt)
    {
        formPage.enterFirstName(fn);
        formPage.enterLastName(ln);
        formPage.enterJobTitle(jt);
        formPage.clickMaleCheckbox();
        formPage.clickGradeSchool();
        formPage.clickSubmitButton();
        formPage.validateSuccessMessage();
    }
}
