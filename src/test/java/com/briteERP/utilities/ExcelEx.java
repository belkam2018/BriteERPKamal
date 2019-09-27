package com.briteERP.utilities;

import org.apache.poi.ss.usermodel.Cell;

import java.util.List;
import java.util.Map;

public class ExcelEx {

    public static void main(String[] args) {


        String path = "./src/test/resources/test_data/jobDomain.xlsx";
        String sheet = "data";

        ExcelUtil jobeAndDomain = new ExcelUtil(path, sheet);
        System.out.println(jobeAndDomain.columnCount());
        System.out.println(jobeAndDomain.rowCount());
        List<String> columnName = jobeAndDomain.getColumnsNames();
        System.out.println(columnName);
//        for (String allNames: columnName) {
//
//            System.out.println(allNames);
//        }
        for (Map<String, String> allJobs : jobeAndDomain.getDataList()) {
            System.out.println(allJobs.get("tags"));
            System.out.println("====================");
            
        }
        for (Map<String,String> allNot : jobeAndDomain.getDataList()) {
            System.out.println(allNot.get("write"));
        }
        
        
    }
}
