package com.synechron.selenium.basics.tooltip;

import com.synechron.selenium.basics.utils.ApplicationUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateToolTip extends ApplicationUtils {

    @Test
    public void validateToolTip() {
        getDriver("edge");
        launchApplication("https://www.google.com/");
     //   getAttributeValue("xpath","//a[contains(@href,'labs')]","aria-label");
        String actualToolTip = getAttributeValue("xpath","//a[contains(@href,'intl/en/about')]","aria-label");
        Assert.assertEquals(actualToolTip, "Google apps");
    }
}
