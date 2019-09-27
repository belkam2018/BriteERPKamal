package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAccGuro {

    public LoginAccGuro(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[contains(text(),'Log In')]")
    public WebElement logGuroclick;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailAccG;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement passAccG;

    @FindBy(xpath = "//button[@id='send2']")
    public  WebElement clicktoLoginAccG;


}

