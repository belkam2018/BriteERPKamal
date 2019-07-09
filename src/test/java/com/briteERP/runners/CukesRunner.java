package com.briteERP.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features/noteModule.feature",
        glue = "com/briteERP/step_definitions"
        , dryRun = false
        , tags = "@test1"
)

public class CukesRunner {
}
