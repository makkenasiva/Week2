package com.learn.weekend;
import java.util.*;

public class Model {

    String babyName;
    char gender;
    int count;

//    public void getRank(){
//
//    }
    public void totalBirths(List<Model> modelList){

        int totalNames=0;
    Set<String> boys=new HashSet<>();
        Set<String> girls =new HashSet<>();
    for(Model m: modelList){
        totalNames+=m.count;

        if(m.gender=='F'){
        girls.add(m.babyName);

        }
        else {
            boys.add(m.babyName);

        }

    }
        System.out.println("Unique boys names count"+boys.size());
        System.out.println("Unique girls names count"+girls.size());
        System.out.println();
        System.out.println("Total names in the file"+totalNames);
        System.out.println();


    }

    }

