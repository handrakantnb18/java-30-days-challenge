package com.zabmixedinterviewproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReviseStrings {

    public static void main(String[] args) {
        // Using a For Loop
        String str1 = "Chandrakant";
        String r1 = "";

        for (int i = 0; i < str1.length(); i++) {
            r1 = str1.charAt(i) + r1;
        }
        System.out.println(r1);

        // Using StringBuilder.reverse()
        String str2 = "Priyanka";
        StringBuilder res = new StringBuilder();

        res.append(str2);
        res.reverse();
        System.out.println(res);

        // Using Character Array

        String str3 = "Vijay";
        char[] arr = str3.toCharArray();

        for (int i = arr.length - 1; i >=0; i--)
            System.out.print(arr[i]);

        //  Using Collections.reverse()
        String str4 = "Chandraaknt";
        char[] arr4 = str4.toCharArray();

        List<Character> l = new ArrayList<>();

        for (char c : arr4)
            l.add(c);

        Collections.reverse(l);

        ListIterator it = l.listIterator();

        while (it.hasNext())
            System.out.println(it.next());

        // Using StringBuffer.reverse()
        String str5 = "Bhosale";
        StringBuffer sbf = new StringBuffer(str5);

        sbf.reverse();
        System.out.println(sbf);
        System.out.println();

    }
}
