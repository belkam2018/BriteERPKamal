package com.briteERP.step_definitions;

import com.briteERP.pages.LoginAccGuro;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import cucumber.api.java.en.Then;

public class LoginAccGuruStep {

    LoginAccGuro loginAccGuro = new LoginAccGuro();


    @Then("Click to login")
    public void click_to_login() {

        BrowserUtils.wait(5);

        //loginAccGuro.logGuroclick.click();
    }

    @Then("write email")
    public void write_email() {

        loginAccGuro.emailAccG.sendKeys(ConfigurationReader.getProperty("emailAccG"));

    }

    @Then("write password")
    public void write_password() {

        loginAccGuro.passAccG.sendKeys(ConfigurationReader.getProperty("passAccG"));

    }

    @Then("Click on login button")
    public void click_on_login_button() {

        loginAccGuro.clicktoLoginAccG.click();
    }
}
