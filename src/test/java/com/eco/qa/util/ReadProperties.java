package com.eco.qa.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class ReadProperties {
    Logger log = Logger.getLogger(ReadProperties.class.getName());
    private String appUrl;
    private String browser;
    private String userName;
    private String password;
    private String orDbHost;
    private String orDbPort;
    private String orDbSid;
    private String orDbUsername;
    private String orDbPassword;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrDbHost() {
        return orDbHost;
    }

    public void setOrDbHost(String orDbHost) {
        this.orDbHost = orDbHost;
    }

    public String getOrDbPort() {
        return orDbPort;
    }

    public void setOrDbPort(String orDbPort) {
        this.orDbPort = orDbPort;
    }

    public String getOrDbSid() {
        return orDbSid;
    }

    public void setOrDbSid(String orDbSid) {
        this.orDbSid = orDbSid;
    }

    public String getOrDbUsername() {
        return orDbUsername;
    }

    public void setOrDbUsername(String orDbUsername) {
        this.orDbUsername = orDbUsername;
    }

    public String getOrDbPassword() {
        return orDbPassword;
    }

    public void setOrDbPassword(String orDbPassword) {
        this.orDbPassword = orDbPassword;
    }

    private final String TEST_PROPERTIES = "config/testConfig.properties";

    public ReadProperties() {
        setBrowser(getProjectProperties(TEST_PROPERTIES, "app.web.browser"));
        setAppUrl(getProjectProperties(TEST_PROPERTIES, "app.web.url"));
        setUserName(getProjectProperties(TEST_PROPERTIES, "app.web.username"));
        setPassword(getProjectProperties(TEST_PROPERTIES, "app.web.password"));

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
