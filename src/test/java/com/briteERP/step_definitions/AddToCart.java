package com.briteERP.step_definitions;

import com.briteERP.pages.AddToCartLoc;
import com.briteERP.pages.CostproLoc;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class AddToCart {

    AddToCartLoc addToCartLoc = new AddToCartLoc();
    CostproLoc costproLoc = new CostproLoc();


//    @BeforeStep
//    public void homePage() {
//
//
//        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
//        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        costproLoc.CliMobile.click();
//    }



    @Then("click on ADD TO CART button")
    public void click_on_ADD_TO_CART_button() {

        addToCartLoc.clickAddCart.click();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("change QTY value to one thousand")
    public void change_QTY_value_to_one_thousand() {
        addToCartLoc.qty2.click();
        addToCartLoc.qty2.sendKeys("1000");
    }

    @Then("click UPDATE button")
    public void click_UPDATE_button() {

        addToCartLoc.clickUPdate.click();

    }

    @Then("verify the error message")
    public void verify_the_error_message() {

        String actual = addToCartLoc.errorMessage.getText();
        String exepted = "Some of the products cannot be ordered in requested quantity.";
        Assert.assertEquals(exepted,actual);
    }

    @Then("click on EMPTY CART")
    public void click_on_EMPTY_CART() {

        addToCartLoc.emptyCart.click();

    }

    @Then("verify cart is empty")
    public void verify_cart_is_empty() {

        String act = addToCartLoc.veryCartEmpty.getText();
        String exp = "SHOPPING CART IS EMPTY";
        Assert.assertEquals(exp,act);
    }

}
