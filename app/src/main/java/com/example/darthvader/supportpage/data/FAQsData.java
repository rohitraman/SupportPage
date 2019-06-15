package com.example.darthvader.supportpage.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FAQsData {
    private static Map<String,List<String>> hashMap=new HashMap<>();

    public static Map<String,List<String>> getData(){
        List<String> list=new ArrayList<>();
        list.add("Your order can be edited before it reaches the restaurant");
        hashMap.put("Can I edit my order?",list);
        list=new ArrayList<>();
        list.add("We will try to accomodate your request if the order is not placed to the restaurants.");
        hashMap.put("I want to cancel my order",list);
        list=new ArrayList<>();
        list.add("Delivery fee varies from city to city and is applicable if the order is below a certain amount.");
        hashMap.put("Do you charge for delivery?",list);
        list=new ArrayList<>();
        list.add("Yes,you can order up to 2 days in advance on our platform");
        hashMap.put("Can I order in advance?",list);
        return hashMap;
    }
}
