package com.briteERP.step_definitions;

import com.briteERP.pages.CreateAcLoc;
import com.briteERP.utilities.BrowserUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CreateAccount {

    CreateAcLoc createAcLoc = new CreateAcLoc();
    public WebDriver driver;



    @Given("Click on my account link")
    public void click_on_my_account_link() {

        createAcLoc.accountclick.click();
        createAcLoc.myAccountClick.click();

    }

    @Given("Create account link and fill new User")
    public void create_account_link_and_fill_new_User() {

        createAcLoc.createAcc.click();
        BrowserUtils.wait(5);

        createAcLoc.name.sendKeys("Ghita");
        createAcLoc.lastName.sendKeys("Lazrak");
        createAcLoc.email.sendKeys("wafaelhaja2019@gmail.com");
        createAcLoc.password.sendKeys("Mamabga8496");
        createAcLoc.confPassword.sendKeys("Mamabga8496");
        BrowserUtils.wait(5);


    }

    @Then("Click register")
    public void click_register() {

        createAcLoc.register.click();

    }

    @Then("Verify registration is done")
    public void verify_registration_is_done() {


        String actual = createAcLoc.dashboardHello.getText();
        String excepted = "Hello, Ghita Lazrak!";
        Assert.assertEquals(excepted,actual);
        System.out.println("Excepteed " + excepted + " Actual " + actual);

    }

    @Then("go to TV menu and Add product in wish list")
    public void go_to_TV_menu_and_Add_product_in_wish_list() {


        BrowserUtils.wait(4);
        createAcLoc.tvclick.click();

    }

    @Then("Click SHARE WISHLIST")
    public void click_SHARE_WISHLIST() {

        createAcLoc.addtoWishlist.click();
        createAcLoc.shareWish.click();

    }

    @Then("Check wishlist is shared")
    public void check_wishlist_is_shared() {

        String act = createAcLoc.checkWishli.getText();
        String exp = "SHARE YOUR WISHLIST";

        Assert.assertEquals(exp,act);



    }

}
