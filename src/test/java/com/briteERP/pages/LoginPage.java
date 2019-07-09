package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/ul[1]/li[10]/a[1]/b[1]")
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
