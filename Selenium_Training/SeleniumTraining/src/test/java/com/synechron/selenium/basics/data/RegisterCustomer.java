package com.synechron.selenium.basics.data;

import com.synechron.selenium.basics.utils.ApplicationUtils;
import com.synechron.selenium.basics.utils.ConfigReader;
import com.synechron.selenium.basics.utils.ExcelReader;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

public class RegisterCustomer extends ApplicationUtils {

    @Test
    public void dropDownUsingSelect() throws InterruptedException {
        getDriver(ConfigReader.getConfigValue("browser"));
        launchApplication(ConfigReader.getConfigValue("formyurl")+"form");

        int rowCount = ExcelReader.getRowCount("Sheet1");
        Row row = null;
        for (int i = 1; i < rowCount; i++)
        {
            //row = ExcelReader.getRow("Sheet1", i);
            type("id", "first-name", ExcelReader.getCell("Sheet1",i,0).toString());
            type("id", "last-name",  ExcelReader.getCell("Sheet1",i,1).toString());
            type("id", "job-title",  ExcelReader.getCell("Sheet1",i,2).toString());
            click("id", ExcelReader.getCell("Sheet1",i,3).toString());
            selectCheckbox("id", ExcelReader.getCell("Sheet1",i,4).toString());
           // selectDropdown("id", "select-menu", "index", "3");
            click("linktext", "Submit");
            System.out.println(getText("xpath", "//*[@class='alert alert-success']"));
            launchApplication(ConfigReader.getConfigValue("formyurl")+"form");

        }


    }
}
