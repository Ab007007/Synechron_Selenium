package com.synechron.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {

    public static void main(String[] strings) {
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

    }

}
