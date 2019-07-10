package com.briteERP.step_definitions;

import com.briteERP.utilities.ConfigurationReader;
import com.briteERP.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
public class Hooks {

//    @Before(order = 1)
//    public void setUp(){
//        System.out.println("I am setting up the test from the Hooks class!!!");
//        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        // you can also add maximize screen here
//        Driver.getDriver().manage().window().maximize();
//    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        Driver.closeDriver();
    }
    }

//    if you want at some specific location then execute code like this..
//
//            if (scenario.isFailed()) {
//            File scrFile = ((TakesScreenshot)dictionaryPage.getDriver()).getScreenshotAs(OutputType.FILE);
//
//            try {
//            FileUtils.copyFile(scrFile, new File(“C:/Users/Public/Downloads/TestScreenshot/Error.jpg”));
//            } catch (IOException e) {
//             TODO Auto-generated catch block
//            e.printStackTrace();
//            }
//            }

