package com.wjavacorecoding;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClass {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Chandrakant");
        map.put("2", "Priyanka");
        map.put("3", "Ram");
        map.put("4", "Vijay");
        map.put("5", "Shyam");

        Student s = new Student("Sachin", 101, map);

        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());

        map.put("7", "Sanjay");
        System.out.println(s.getMetadata());

        s.getMetadata().put("8", "Santosh");
        System.out.println(s.getMetadata());

    }
}
