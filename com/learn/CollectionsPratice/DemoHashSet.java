package com.learn.CollectionsPratice;
import java.util.HashSet;
import java.util.Set;
public class DemoHashSet {
    public static void main (String[] args){

        Set<String>st=new HashSet<>();
        st.add("siva");
        st.add("ramesh");
        st.add("prasad");
        st.add("sruthi");
        st.add("shiva");
        st.add("siva");
        st.add(null);

        System.out.println(st);

    }
}
