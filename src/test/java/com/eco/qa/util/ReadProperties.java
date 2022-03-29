package com.eco.qa.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class ReadProperties {
    Logger log = Logger.getLogger(ReadProperties.class.getName());
    private String appUrl;
    private String browser;

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }



    private final String TEST_PROPERTIES = "config/testConfig.properties";

    public ReadProperties() {
        setBrowser(getProjectProperties(TEST_PROPERTIES, "app.web.browser"));
        setAppUrl(getProjectProperties(TEST_PROPERTIES, "app.web.url"));

    }

    private String getProjectProperties(String propertyFile, String property) {
        Properties properties = new Properties();
        InputStream inputStream = null;
        inputStream = getClass().getClassLoader().getResourceAsStream(propertyFile);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            log.info(e.getMessage());
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                log.info(e.getMessage());
            }
        }
        return properties.getProperty(property);
    }

}
