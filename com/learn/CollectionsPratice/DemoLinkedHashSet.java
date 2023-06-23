package com.learn.CollectionsPratice;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main(String[] args){
        LinkedHashSet<String> lh=new LinkedHashSet<>();
        lh.add("rahul");
        lh.add("manoj");
        lh.add("raju");
        lh.add("veeru");
        lh.add("siva");
        lh.add(null);
        lh.add("veeru");
        System.out.println(lh);
    }
}
