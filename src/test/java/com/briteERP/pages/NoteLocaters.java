package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NoteLocaters  {

public NoteLocaters(){
    PageFactory.initElements(Driver.getDriver(), this);

}


    @FindBy(xpath = "//span[@class='oe_menu_text'][contains(text(),'Notes')]")
    public WebElement noteButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createNote;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    public WebElement tags;

    @FindBy(xpath = "//i[@class='fa fa-magic']")
    public WebElement style;

    @FindBy(xpath = "//div[@class='btn-group open']//ul[@class='dropdown-menu']")
    public List<WebElement> dropDownMenu;

    @FindBy(xpath = "//a[contains(text(),'Normal')]")
    public WebElement normal;

    @FindBy(xpath = "/html[1]/body[1]/ul[1]/li[1]/a[1]")
    public WebElement createTag;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[3]")
    public WebElement write;





}


