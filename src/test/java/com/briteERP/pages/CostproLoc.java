package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostproLoc {

    public CostproLoc(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "MOBILE")
    public WebElement CliMobile;

    @FindBy(xpath = "//div[contains(text(),'this is Sony Xperia')]")
    public WebElement sonyDetails;



    @FindBy(xpath = "//span[contains(text(),'$100.00')]")
    public WebElement readSonyCost;

    @FindBy(xpath = "//span[@class='price']")
    public WebElement sonyPrice;

    @FindBy(xpath = "//h2[@class='product-name']//a[contains(text(),'Sony Xperia')]")
    public WebElement clickSony;










}
