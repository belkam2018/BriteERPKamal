package com.briteERP.step_definitions;

import com.briteERP.pages.LoginPage;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginStepDef {


    LoginPage logObj=new LoginPage();

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }

    @And("User is on the login page as a user")
    public void user_is_on_the_login_page_as_a_user(){
        logObj.signIn.click();
        logObj.email.sendKeys("EventsCRM_User6@info.com");
        logObj.pwd.sendKeys("opJu56KKL44");
        logObj.loginBtn.click();
    }

//    @Then("User is on the login page as a manager with {string} and {string} credentials")
//    public void user_is_on_the_login_page_as_a_manager_with_and_credentials(String email, String password) {
//
//        logObj.signIn.click();
//        logObj.email.sendKeys(email);
//        logObj.pwd.sendKeys(password);
//        logObj.loginBtn.click();
//    }



//    @Then("Logs in with {string} and {string}")
//    public void logs_in_with_and(String email, String password) {
//
//
//    }

//    @Then("Navigates to events module")
//    public void navigates_to_events_module() {
//        BrowserUtils.wait(5);
//        logObj.EventsModule.click();
//    }


}
