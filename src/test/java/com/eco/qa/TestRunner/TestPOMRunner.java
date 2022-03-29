package com.eco.qa.TestRunner;

import com.eco.qa.page.LoginMRSPage;
import com.eco.qa.util.ReadProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestPOMRunner {
    static ReadProperties readProperties = new ReadProperties();

    public static void main(String[] args) {
        WebDriver driver = null;
        String browser = readProperties.getBrowser();
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.get(readProperties.getAppUrl());
        LoginMRSPage loginMRSPage = new LoginMRSPage(driver);
        loginMRSPage.loginToApplication(readProperties.getUserName(), readProperties.getPassword());
        driver.close();
    }
}
