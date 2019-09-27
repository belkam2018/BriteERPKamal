package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAcLoc {


    public CreateAcLoc(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='label'][contains(text(),'Account')]")
    public WebElement accountclick;

    @FindBy(xpath = "//div[@id='header-account']//a[contains(text(),'My Account')]")
    public WebElement myAccountClick;

    @FindBy(xpath = "//span[contains(text(),'Create an Account')]")
    public WebElement createAcc;

    @FindBy(id = "firstname")
    public WebElement name;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "email_address")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "confirmation")
    public WebElement confPassword;

    @FindBy(xpath = "//span[contains(text(),'Register')]")
    public WebElement register;

    @FindBy(xpath = "//strong[contains(text(),'Hello, Ghita Lazrak!')]")
    public WebElement dashboardHello;

    @FindBy(xpath = "//a[contains(text(),'TV')]")
    public WebElement tvclick;

    @FindBy(xpath = "//li[1]//div[1]//div[3]//ul[1]//li[1]//a[1]")
    public WebElement addtoWishlist;

    @FindBy(xpath = "//span[contains(text(),'Share Wishlist')]")
    public WebElement shareWish;

    @FindBy(xpath = "//h1[contains(text(),'Share Your Wishlist')]")
    public WebElement checkWishli;






}
