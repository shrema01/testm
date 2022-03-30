package com.eco.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSauceDemopage {
    WebDriver driver;
    public LoginSauceDemopage(WebDriver driver){
        this.driver = driver;
    }
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");
    public void loginToSauceDemo() throws InterruptedException {
        driver.manage().window().maximize();
        driver.findElement(username).sendKeys(System.getProperty("username"));
        driver.findElement(password).sendKeys(System.getProperty("password"));
        driver.findElement(loginButton).click();
    }
}
