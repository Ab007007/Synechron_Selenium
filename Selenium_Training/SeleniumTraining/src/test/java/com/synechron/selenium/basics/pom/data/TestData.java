package com.synechron.selenium.basics.pom.data;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name="formdata")
    public Object[][] formdata() {
        return new Object[][] {
          new Object[] { "Aravinda", "H", "Trainer" },
          new Object[] { "Harry", "H", "Software Engineer" },
          new Object[] { "Mohsen", "N", "Managers" },
          new Object[] { "Giri", "L", "HR" },
          new Object[] { "Kavya", "K", "Director" }
        };
    }
}
