package com.synechron.selenium.basics.utils;

import java.io.*;
import java.util.Properties;

public class ConfigReader {

    public static String getConfigValue(String key)  {
        String value = null;

        File configFile = new File("./src/data/config.properties");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(configFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties prop = new Properties();

        try {
            prop.load(fis);
            value = prop.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return value;
    }
}
