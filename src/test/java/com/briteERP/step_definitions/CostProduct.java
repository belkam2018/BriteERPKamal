package com.briteERP.step_definitions;

import com.briteERP.pages.CostproLoc;
import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CostProduct {

    CostproLoc costproLoc = new CostproLoc();
   public WebDriver driver;


    @Given("I am on home page")
    public void i_am_on_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("baseUrl"));
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Then("click on MOBIL menu")
    public void click_on_MOBIL_menu() {

       costproLoc.CliMobile.click();


    }

    @Then("read the cost of Sony Experia the value")
    public void read_the_cost_of_Sony_Experia_the_value() {

     String actual = costproLoc.readSonyCost.getText();
     String Exepted = "$100.00";
        Assert.assertEquals(Exepted,actual);


    }

    @Then("click on Sony Experia mobile")
    public void click_on_Sony_Experia_mobile() {

       costproLoc.clickSony.click();

    }

    @Then("read the Sony Experia from details page")
    public void read_the_Sony_Experia_from_details_page()  {

          String actualR = costproLoc.sonyDetails.getText();
          String exeptedR = "this is Sony Xperia1";
          Assert.assertEquals(exeptedR,actualR);


    }

    @Then("compare value and detail page")
    public void compare_value_and_detail_page() {

       String actR = costproLoc.sonyPrice.getText();
       String expR = costproLoc.readSonyCost.getText();

        System.out.println(actR +expR);

       Assert.assertEquals(actR,expR);



    }


}
