package com.zstringsinterviewlevel;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
// Check Every Character - O(n^2) Time and O(1) Space

    public static boolean areIsomorphic(String s1, String s2) {

        int n = s1.length();
        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            for (int j = 0; j < n; j++) {

                if (s1.charAt(j) == c1 && s2.charAt(j) != c2) {
                    return false;
                }
                if (s2.charAt(j) == c2 && s1.charAt(j) != c1) {
                    return false;
                }
            }
        }
        return true;
    }

    //  Using Hash Maps
    public  static boolean areIsomorphi(String s3, String s4) {

        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s3.length(); ++i) {

            // If character not seen before, store its
            // first occurrence index
            if (!m1.containsKey(s3.charAt(i))) {
                m1.put(s3.charAt(i), i);
            }
            if (!m2.containsKey(s4.charAt(i))) {
                m2.put(s4.charAt(i), i);
            }

            // Check if the first occurrence indices match
            if (!m1.get(s3.charAt(i)).equals(m2.get(s4.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Check Every Character - O(n^2) Time and O(1) Space
        String s1 = "aab";
        String s2 = "xyz";

        if (areIsomorphic(s1, s2)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        //  Using Hash Maps

        String s3 = "aab";
        String s4 = "xyz";

        if (areIsomorphic(s3, s4)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
