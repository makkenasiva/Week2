package com.learn.CollectionsPratice;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args){

        LinkedList<String> ll=new LinkedList<>();
        ll.add("siva");
        ll.add("ramesh");
        ll.add(null);
        ll.add("suresh");
        ll.add("siva");
        System.out.println(ll.size());
        System.out.println(ll.contains("raj"));
        System.out.println(ll);

    }
}
