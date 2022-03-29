package com.eco.qa.stepDefinition;

import com.eco.qa.page.LoginRCMPage;
import com.eco.qa.page.LoginMRSPage;
import com.eco.qa.page.RCMHomePage;
import com.eco.qa.util.ReadProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestSteps {
    static ReadProperties readProperties = new ReadProperties();
    WebDriver driver;

    //MRS Test
    /*LoginMRSPage loginMRSPage;
    MRSHomePage MRSHomePage;
    public TestSteps(){
        String browser = readProperties.getBrowser();
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.get(readProperties.getAppUrl());
        loginMRSPage = new LoginMRSPage(driver);
    }



    @Given("user has logged into OpenMRS application")
    public void loginToApp() {
    System.out.println("1");
        loginMRSPage.loginToApplication(readProperties.getUserName(), readProperties.getPassword());
        driver.manage().window().maximize();
    }

    @When("user clicks on Find Patient Record on home page")
    public void naviagteToFindPatient() {
    System.out.println("2");
    MRSHomePage = new MRSHomePage(driver);
    MRSHomePage.searchPatient();

    }
    @When("user enters {string} in the search box on find patient page")
    public void seachPatient(String patientName) {
    System.out.println("3" + patientName);
    }
    @Then("user should be able to see the {string} medical history")
    public void user_should_be_able_to_see_the_medical_history(String patientName) throws InterruptedException {
    System.out.println("4");
    driver.close();
    }*/

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
