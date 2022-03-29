package com.eco.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MRSHomePage {
    private By searchPatient = By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension");
    WebDriver driver;
    public MRSHomePage(WebDriver driver){
        this.driver = driver;

    }
    public void searchPatient(){
        driver.findElement(searchPatient).click();
    }

}
