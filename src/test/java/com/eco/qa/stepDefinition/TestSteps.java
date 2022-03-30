package com.eco.qa.stepDefinition;

import com.eco.qa.page.LoginSauceDemopage;
import com.eco.qa.page.SauceDemoHomePage;
import com.eco.qa.util.ReadProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSteps {
    static ReadProperties readProperties = new ReadProperties();
    WebDriver driver;

    //Sauce Demo Test
    LoginSauceDemopage loginSauceDemopage;
    SauceDemoHomePage sauceDemoHomePage;
    public TestSteps(){
        String browser = readProperties.getBrowser();
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.get(readProperties.getAppUrl());
        loginSauceDemopage = new LoginSauceDemopage(driver);
    }

    @Given("the user is on Sauce Demo Home Page")
    public void the_user_is_on_sauce_demo_login_page() throws InterruptedException {
        loginSauceDemopage.loginToSauceDemo();
    }
    @When("the user clicks on the Sauce Labs Backpack ADD TO CART on the home page")
    public void the_user_the_user_clicks_on_the_sauce_labs_backpack_add_to_cart_on_the_home_page() throws InterruptedException {
        sauceDemoHomePage = new SauceDemoHomePage(driver);
        sauceDemoHomePage.clickBackPackAddToCart();
    }
    @Then("the user should see the Sauce Labs Backpack added to the card")
    public void the_user_should_see_the_sauce_labs_backpack_added_to_the_card() {
        sauceDemoHomePage.verifyAddToCart();
    }



}
