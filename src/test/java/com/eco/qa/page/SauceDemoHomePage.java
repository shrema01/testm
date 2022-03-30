package com.eco.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class SauceDemoHomePage {
    private By sauce_labs_backpack_add_to_cart = By.id("add-to-cart-sauce-labs-backpack");
    private By sauce_labs_add_to_cart_icon = By.xpath("//*[@id=\'shopping_cart_container\']/a");
    private By sauce_labs_backpack_in_cart = By.xpath("//*[@id='item_4_title_link']/div");

    WebDriver driver;
    public SauceDemoHomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickBackPackAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(sauce_labs_backpack_add_to_cart).click();
        //driver.close();
    }
    public void verifyAddToCart(){
        driver.findElement(sauce_labs_add_to_cart_icon).click();
        assertEquals("Issue with backpack in cart!","Sauce Labs Backpack",driver.findElement(sauce_labs_backpack_in_cart).getText());
        driver.close();
    }
}
