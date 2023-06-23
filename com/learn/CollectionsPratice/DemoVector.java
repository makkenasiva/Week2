package com.learn.CollectionsPratice;

import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {
        Vector<String> vv=new Vector<>();
        vv.add("siva");
        vv.add("raju");
        vv.add("babji");
        vv.add("rajesh");
        vv.add("raju");
        vv.add(null);
        vv.size();
        vv.contains("raju");
        System.out.println(vv.contains("raju"));

    }
}
