package com.eco.qa.stepDefinition;

import com.eco.qa.page.LoginRCMPage;
import com.eco.qa.page.RCMHomePage;
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

    //RCM Test
    LoginRCMPage loginRCMPage;
    RCMHomePage rcmHomePage;
    public TestSteps(){
        String browser = readProperties.getBrowser();
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.get(readProperties.getAppUrl());
        loginRCMPage = new LoginRCMPage(driver);
    }

    @Given("user is on RCM HomePage")
    public void user_is_on_rcm_home_page() throws InterruptedException {
        loginRCMPage.loginToRCM();
        Thread.sleep(3000);
    }
    @When("the user the user clicks on the log out link on the home page")
    public void the_user_the_user_clicks_on_the_log_out_link_on_the_home_page() {
        rcmHomePage = new RCMHomePage(driver);
        rcmHomePage.clickLogout();
    }
    @Then("the user should see the saved login time in database")
    public void the_user_should_see_the_rcm_login_page() {
        //todo
    }



}
