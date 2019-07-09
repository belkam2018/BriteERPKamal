package com.briteERP.step_definitions;

import com.briteERP.pages.LoginPage;
import com.briteERP.pages.NoteLocaters;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class NoteStepDef extends BrowserUtils {


     LoginPage page = new LoginPage();
    NoteLocaters noteLocaters = new NoteLocaters();

        @And("user should click on Note button")
        public void user_should_click_on_Note_button () {
            Driver.getDriver().get(ConfigurationReader.getProperty("url"));
            String email = ConfigurationReader.getProperty("eventsUserName");
            String password = ConfigurationReader.getProperty("eventsUserPwd");

            page.signIn.click();
            page.email.sendKeys(email);
            page.pwd.sendKeys(password);
            page.loginBtn.click();
            BrowserUtils.wait(10);
            noteLocaters.noteButton.click();

        }

        @Given("user should create note")
        public void user_should_create_note () {
            BrowserUtils.wait(10);
            noteLocaters.createNote.click();
        }

    }
