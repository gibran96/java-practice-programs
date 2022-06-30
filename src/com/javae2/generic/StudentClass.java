package com.javae2.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentClass {

    public String getQuery(String studentData,String query){
        List<String> studData = new ArrayList<>();
        String[] tempData = studentData.split(" ");
        studData = Arrays.asList(tempData);
        List<String> queryData = new ArrayList<>();

        StudentList<ArrayList> list = new StudentList<>();

        if (query.charAt(0) == '1') {
            queryData = Arrays.asList(query.split(","));
        }
        return null;
    }

}
