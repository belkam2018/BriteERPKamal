package com.briteERP.step_definitions;

import com.briteERP.pages.LoginPage;
import com.briteERP.pages.NoteLocaters;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class NoteStepDef extends BrowserUtils {

     Driver driver =new Driver();
     LoginPage page = new LoginPage();
     NoteLocaters noteLocaters = new NoteLocaters();

        @Given("user should click on Note button")
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

        @Then("user should create note")
        public void user_should_create_note () {
            BrowserUtils.wait(10);
            noteLocaters.createNote.click();
        }

        @Then("user should write tag")
        public void user_should_write_tag() {

            BrowserUtils.wait(5);
           // noteLocaters.tags.click();
            noteLocaters.tags.sendKeys("Adam QA");
            BrowserUtils.wait(5);
            noteLocaters.createTag.click();

        }

        @Then("user should select style")
        public void user_should_select_style() throws InterruptedException {
            BrowserUtils.wait(5);
            noteLocaters.style.click();
            List<String> allNames = BrowserUtils.getElementsText(noteLocaters.dropDownMenu);
            System.out.println(allNames);
//            Select list = new Select();
//            String selectOption = list.getFirstSelectedOption().getText();
//            System.out.println(selectOption);

            noteLocaters.normal.click();
            BrowserUtils.wait(5);
            noteLocaters.write.sendKeys("Hello Adam Belkati");
//            BrowserUtils.wait(5);
//            noteLocaters.writeNote.click();
//



        }


}
