package com.learn.weekend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String[] fileNames = {
                "/Users/siva/Downloads/testing/yob2012short.csv",
                "/Users/siva/Downloads/testing/yob2013short.csv",
                "/Users/siva/Downloads/testing/yob2014short.csv"
        };
        String line ="";




        for (String fileName : fileNames) {
            List<Model> l= processFile(fileName);
           Model m=new Model();
           m.totalBirths(l);
        }
    }
    private static List<Model> processFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        List<Model> modelList=new ArrayList<>();
        while (sc.hasNext()) {
           String str=sc.next();
           String[] arr=str.split(",");
            Model m=new Model();
            m.babyName=arr[0];
            m.gender=arr[1].charAt(0);
            m.count=Integer.parseInt(arr[2]);
            modelList.add(m);
        }
        sc.close();
        return modelList;
    }
}
