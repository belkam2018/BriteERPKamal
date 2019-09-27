package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//b[contains(text(),'Sign in')]")
    public WebElement signIn;

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement pwd;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[@data-menu='124']")
    public WebElement EventsModule;
}
