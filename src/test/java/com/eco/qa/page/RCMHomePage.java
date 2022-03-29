package com.eco.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RCMHomePage {
    private By logout = By.id("logoff");
    private By loginLink = By.xpath("//*[@id=\"pageLayoutContext\"]/div/div/a");
    WebDriver driver;
    public RCMHomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickLogout(){
        driver.findElement(logout).click();
        driver.close();
    }
}
