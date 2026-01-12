package com.jhashMapHashSet;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyCount {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Chandrakant..");
        al.add("bhosale");
        al.add("Priyanka");
        al.add("Shiv");
        int freq = Collections.frequency(al, "Chandrakant");
        System.out.println("The frequency of the word code is : " +freq);
    }

}
