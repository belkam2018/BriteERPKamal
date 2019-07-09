package com.briteERP.pages;

import com.briteERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoteLocaters  {

public NoteLocaters(){
    PageFactory.initElements(Driver.getDriver(), this);

}


    @FindBy(xpath = "//span[@class='oe_menu_text'][contains(text(),'Notes')]")
    public WebElement noteButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createNote;
}
