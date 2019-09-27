package com.briteERP.utilities;

import java.util.List;
import java.util.Map;

public class ExcelEx2 {

    public static void main(String[] args) {
        List<String> testData;

        String path = "./src/test/resources/test_data/jobDomain.xlsx";
        String sheet = "data";

        ExcelUtil userData = new ExcelUtil(path,sheet);

        testData = userData.getColumnsNames();


        for (String user : testData){

            System.out.println(user.toString());


        }
        {

        }
    }
}
