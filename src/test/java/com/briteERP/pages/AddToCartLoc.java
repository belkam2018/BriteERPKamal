package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartLoc {

    public AddToCartLoc(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//li[1]//div[1]//div[3]//button[1]//span[1]//span[1]")
    public WebElement clickAddCart;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/input")
    public WebElement qty2;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[4]/button")
    public WebElement clickUPdate;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/ul/li/ul/li/span")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@id=\"empty_cart_button\"]")
    public WebElement emptyCart;

    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart is Empty')]")
    public WebElement veryCartEmpty;




}
