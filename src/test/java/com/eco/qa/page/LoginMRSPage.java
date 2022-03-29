package com.eco.qa.page;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginMRSPage {

    private By userName = By.id("username");
    private By password = By.id("password");
    private By sessionLocator = By.id("Inpatient Ward");
    private By loginButton = By.id("loginButton");

    WebDriver driver;
    public LoginMRSPage(WebDriver driver){
        this.driver = driver;
    }
    public void loginToApplication(String user, String pwd){
        driver.findElement(userName).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(sessionLocator).click();
        driver.findElement(loginButton).click();
    }


}
