package com.learn.functionalInterface;

import java.util.ArrayList;
import java.util.List;

public class DemoFunctionalInterface1 {
    public static void main(String[] args) {
        List<Customer> mydata=new ArrayList<Customer>();
        mydata.add(new Customer("siva","m",35,"hyd", 32,"m"));
        mydata.add(new Customer("rahu","m",20,"banglore", 32,"m"));
        mydata.add(new Customer("manoj","m",25,"hyd", 35,"m"));
        mydata.add(new Customer("srikanth","m",45,"kerala", 15,"m"));
        mydata.add(new Customer("avi","m",54,"chennai", 6,"f"));
        mydata.add(new Customer("sweety","m",38,"vijayawada", 22,"f"));
        mydata.add(new Customer("sundhar","m",22,"gunutr", 38,"m"));

        System.out.println(mydata.stream().anyMatch(employee ->employee.getFirstName().startsWith("b")));
        System.out.println(mydata.stream().noneMatch(employee->employee.getNoOfYearsWorkExperienceEligibility().equals("siva")));
       System.out.println(mydata.stream().allMatch(employee -> employee.getGender().equals("m")));
    }
}
