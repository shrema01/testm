package com.eco.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginRCMPage {
    WebDriver driver;
    public LoginRCMPage(WebDriver driver){
        this.driver = driver;
    }
    private By advanceBtn = By.id("details-button");
    private By proceedLink = By.id("proceed-link");
    private By username = By.id("userNameInput");
    private By password = By.id("passwordInput");
    private By loginButton = By.id("submitButton");
    public void loginToRCM() throws InterruptedException {
        driver.findElement(advanceBtn).click();
        driver.findElement(proceedLink).click();
        Thread.sleep(3000L);
        driver.findElement(advanceBtn).click();
        driver.findElement(proceedLink).click();
        Thread.sleep(3000L);
        driver.manage().window().maximize();
        driver.findElement(username).sendKeys(System.getProperty("username"));
        driver.findElement(password).sendKeys(System.getProperty("password"));
        driver.findElement(loginButton).click();
    }
}
