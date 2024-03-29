package com.briteERP.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {
//                "html:target/default-cucumber-reports",
//                "json:target/cucumber.json",
//                "rerun:target/rerun.txt"
//        },
        plugin = "json:target/cucumber.json",
        features = "src/test/resources/features",
        glue = "com/briteERP/step_definitions"
        , dryRun = false
        , tags = "  @script4"
)

public class CukesRunner {


}