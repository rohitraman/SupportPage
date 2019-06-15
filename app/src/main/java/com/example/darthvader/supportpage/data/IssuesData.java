package com.example.darthvader.supportpage.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssuesData {
    private static Map<String,List<String>> hashMap=new HashMap<>();

    public static Map<String, List<String>> getData(){
        List<String> list=new ArrayList<>();
        list.add("Please chat with us");
        hashMap.put("I have a query related to placing an order",list);
        list=new ArrayList<>();
        list.add("Please drop us an email");
        hashMap.put("I want to unsubscribe from Swiggy communications",list);
        list=new ArrayList<>();
        list.add("Please call us");
        hashMap.put("I have a payment related query",list);
        return hashMap;
    }
}
