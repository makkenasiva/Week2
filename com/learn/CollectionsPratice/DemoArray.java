package com.learn.CollectionsPratice;

import java.util.ArrayList;

import static java.lang.System.out;

public class DemoArray {
    public static void main(String[] args) {
        ArrayList<String> AL=new ArrayList<>();
        AL.add("siva");
        AL.add("rajiv");
        AL.add("Manoj");
        AL.add("Indra");
        AL.add("Str");
        AL.add("siva");
        AL.add(null);
        System.out.println(AL.size());
        System.out.println(AL);
    }
}
