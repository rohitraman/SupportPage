package com.example.darthvader.supportpage.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TermsAndConditions {
    private static Map<String,List<String>> map=new HashMap<>();
    public static Map<String,List<String>> getData(){
        List<String> list=new ArrayList<>();
        list.add("If users can post content on your website or mobile app " +
                "(create content and share it on your platform), " +
                "you can remove any content they created if it infringes copyright. " +
                "Your Terms and Conditions will inform users that they can only create and/or share content they own rights to. Similarly, if users can register for an account and choose a username, you can inform users that they are not allowed to choose usernames that may infringe trademarks" +
                ", i.e. usernames like Google, Facebook, and so on.");
        map.put("Terms And Conditions",list);
        list=new ArrayList<>();
        list.add("A privacy policy is a statement or a legal document (in privacy law) that discloses " +
                "some or all of the ways a party gathers, uses, discloses, and manages a customer or client's data. " +
                "It fulfills a legal requirement to protect a customer or client's privacy.");
        map.put("Privacy Policy",list);
        return map;
    }
}
