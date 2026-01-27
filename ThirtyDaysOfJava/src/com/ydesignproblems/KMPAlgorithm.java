package com.ydesignproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class KMPAlgorithm {

    // The value of lps[0] is always 0 because a string of length one has no non-empty proper prefix that is also a suffix
//    public static ArrayList<Integer> computeLPSarray(String pattern) {
//        int n = pattern.length();
//        ArrayList<Integer> lps = new ArrayList<>();
//
//        for (int K = 0; K < n; K++) {
//            lps.add(0);
//        }
//
//        int len = 0;
//        int i = 1;
//
//        while (i < n) {
//            if (pattern.charAt(i) == pattern.charAt(len)) {
//                len++;
//                lps.set(i, len);
//                i++;
//            }
//            else
//            {
//                if (len != 0){
//                    len = lps.get(len - 1);
//                }else
//                {
//                    lps.set(i, 0);
//                    i++;
//                }
//            }
//        }
//        return lps;
//    }

    //KMP Pattern Matching Algorithm
    static void constructLPS(String pat, int[] lps) {
        int len = 0;

        lps[0] = 0;
        int i = 1;

        while (i < pat.length()) {

            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0 ) {
                    len= lps[len - 1];

                }
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    static ArrayList<Integer> search(String pat, String txt) {
        int n = txt.length();
        int m = txt.length();

        int[] lps = new int[m];
        ArrayList<Integer> res = new ArrayList<>();

        constructLPS(pat, lps);

        int i = 0;
        int j = 0;

        while (i < n) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;

                if (j == m){
                    res.add(i - j);

                    j = lps[i - 1];
                }
            }
            else {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        return res;

    }

    public static void main(String[] args) {

        String txt = "aabaacaadaabaaba";
        String pat = "aaba";

//        int txt1 = 1121;
//        int pat1 = 12;

        ArrayList<Integer> res = search(pat, txt);
        for (int i = 0; i < res.size(); i++)
            System.out.println(res.get(i) + " ");

//        ArrayList<Integer> res1 = computeLPSarray(pat);
//        for (int i = 0; i < res1.size(); i++) {
//            System.out.println(res1.get(i) + " ");

        // }

    }
}
