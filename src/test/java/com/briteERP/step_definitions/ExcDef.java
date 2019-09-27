package com.briteERP.step_definitions;

import com.briteERP.pages.NoteLocaters;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ExcelUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Test;

import java.util.List;
import java.util.Map;


public class ExcDef {


    NoteLocaters note = new NoteLocaters();

    @Given("user should see {string} and {string}")
    public void user_should_see_and(String tag, String write) {

        String path = "./src/test/resources/test_data/jobDomain.xlsx";
        String sheet = "data";

        ExcelUtil userData = new ExcelUtil(path, sheet);

        for (Map<String, String> user : userData.getDataList()) {
            System.out.println(user.get(tag));



        }
        {


        }


    }


}
