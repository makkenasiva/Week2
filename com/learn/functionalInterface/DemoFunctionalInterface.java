package com.learn.functionalInterface;

import java.util.ArrayList;
import java.util.List;


public class DemoFunctionalInterface {
    public static void main(String[] args){

        List<Employee> mydata=new ArrayList<Employee>();
        mydata.add(new Employee("ashok",70,8,4));
        mydata.add(new Employee("uday",110 ,14,7));
        mydata.add(new Employee("vinay",120,18,7));
        mydata.add(new Employee("akash",60,9,5));
        mydata.add(new Employee("ashok",90,6,4));
        mydata.add(new Employee("rakesh",80,4,3));
        mydata.add(new Employee("jai",130,5,4));
        mydata.add(new Employee("bhuvan",140,11,8));

        mydata.stream().sorted((a,b)->a.getSalary()-b.getSalary())
                .forEach((employee -> System.out.println(employee.toString()
        )));


    }
}
